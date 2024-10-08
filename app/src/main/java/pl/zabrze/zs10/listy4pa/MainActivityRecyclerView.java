package pl.zabrze.zs10.listy4pa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivityRecyclerView extends AppCompatActivity {
    ArrayList<Produkt> produkty = new ArrayList<>();
    RecyclerView recyclerView;
    ZakupyAdapter adapter;
    EditText editText;
    Button buttonDodaj;
    Button buttonUsun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler_view);
        produkty.add(new Produkt("jabłka",3.5,"owoce"));
        produkty.add(new Produkt("gruszki",4.5,"owoce"));
        produkty.add(new Produkt("pomidory",4.5,"warzywa"));
        produkty.add(new Produkt("woda",2.5,"napoje"));
        produkty.add(new Produkt("krewetki",25.5,"owoce morza"));
        produkty.add(new Produkt("pstrąg",25.5,"ryby"));
        produkty.add(new Produkt("pstrąg",25.5,"ryby"));
        produkty.add(new Produkt("pstrąg",25.5,"ryby"));
        produkty.add(new Produkt("pstrąg",25.5,"ryby"));
        produkty.add(new Produkt("pstrąg",25.5,"ryby"));
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new ZakupyAdapter(this,produkty);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        buttonDodaj = findViewById(R.id.button2);
        buttonUsun = findViewById(R.id.button3);
        editText = findViewById(R.id.editTextTextPersonName2);
        buttonDodaj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String nazwaProduktu  = editText.getText().toString();
                        Produkt produkt = new Produkt(nazwaProduktu,23,"jakaś");
                        adapter.dodajProdukt(produkt);
                    }
                }
        );
        buttonUsun.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        adapter.usunProdukty();
                    }
                }
        );
    }
}