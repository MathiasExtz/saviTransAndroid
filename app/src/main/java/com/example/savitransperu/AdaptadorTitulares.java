package com.example.savitransperu;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorTitulares extends RecyclerView.Adapter<AdaptadorTitulares.TitularesViewHolder>  {

    private ArrayList<Titular> datos;

    public AdaptadorTitulares(ArrayList<Titular> datos){this.datos = datos;}


    public static class TitularesViewHolder extends RecyclerView.ViewHolder {

        private TextView txtTitulo;
        private TextView txtSubtitulo;
        private TextView txtSubtitulo2;


        public TitularesViewHolder(View itemView) {
            super(itemView);

            txtTitulo = (TextView)itemView.findViewById(R.id.LblTitulo);
            txtSubtitulo = (TextView)itemView.findViewById(R.id.LblSubTitulo);
            txtSubtitulo2 = (TextView)itemView.findViewById(R.id.LblSubTitulo2);
        }

        public void bindTitular(Titular t) {
            txtTitulo.setText(t.getTitulo());
            txtSubtitulo.setText(t.getSubtitulo());
            txtSubtitulo2.setText(t.getSubtitulo2());
        }
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    @Override
    public void onBindViewHolder(TitularesViewHolder viewHolder, int pos) {
        Titular item = datos.get(pos);
        viewHolder.bindTitular(item);
    }

    @Override
    public TitularesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.listitem_titular, viewGroup, false);

        TitularesViewHolder tvh = new TitularesViewHolder(itemView);

        return tvh;
    }






}
