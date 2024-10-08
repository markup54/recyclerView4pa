package pl.zabrze.zs10.listy4pa;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ZakupyAdapter extends RecyclerView.Adapter<ZakupyAdapter.ProduktViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<Produkt> listaZakupow;

    public ZakupyAdapter(Context context,ArrayList<Produkt> listaZakupow) {
        inflater = LayoutInflater.from(context);
        this.listaZakupow = listaZakupow;
    }

    @NonNull
    @Override
    public ProduktViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //przygotowanie widoku
        View itemView = inflater.inflate(R.layout.produkt_widok_elementu,
                parent,false);
        return new ProduktViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProduktViewHolder holder, int position) {
        //wypełnienie widoku danymi
        holder.checkBox.setText(listaZakupow.get(position).getNazwa());
    }

    @Override
    public int getItemCount() {
        //ile elementów do wyświetlenia
        return listaZakupow.size();
    }

    public class ProduktViewHolder extends RecyclerView.ViewHolder {
        public CheckBox checkBox;
        public ZakupyAdapter adapter;
        public ProduktViewHolder(@NonNull View itemView, ZakupyAdapter adapterZ) {
            super(itemView);
            checkBox = itemView.findViewById(R.id.checkBox);
            adapter = adapterZ;
        }
    }
}
