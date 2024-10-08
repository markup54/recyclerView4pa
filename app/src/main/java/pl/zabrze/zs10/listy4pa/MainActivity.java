package pl.zabrze.zs10.listy4pa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Button button;
    EditText editText;
    ArrayList<String> owocki = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextTextPersonName);
        owocki.add("Zielony banan");
        owocki.add("sliweczka");
        owocki.add("gruszka");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                owocki);
        listView.setAdapter(adapter);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String owoc = editText.getText().toString();
                        owocki.add(owoc);
                        adapter.notifyDataSetChanged();
                    }
                }
        );
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view,
                                            int i, long l) {
                        String ktory = owocki.get(i);
                        Toast.makeText(MainActivity.this, ktory, Toast.LENGTH_SHORT).show();
                        owocki.remove(ktory);
                        adapter.notifyDataSetChanged();


                    }
                }
        );
    }
}