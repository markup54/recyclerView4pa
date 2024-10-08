package pl.zabrze.zs10.listy4pa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivityRecyclerView extends AppCompatActivity {
    ArrayList<Produkt> produkty = new ArrayList<>();
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
    }
}