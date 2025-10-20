package com.example.minhaaplicao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class PlanetaAdapter extends ArrayAdapter<Planeta> {
int mResouce;
    public PlanetaAdapter(@NonNull Context context, int resource, @NonNull List<Planeta> objects) {
        super(context, resource, objects);
        mResouce=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater Inflater = LayoutInflater.from(getContext());
        View v = Inflater.inflate( mResouce, parent, false);
        Planeta planeta = getItem(position);
        TextView tv=v.findViewById(R.id.textView);
        ImageView iv = v.findViewById(R.id.imageView);
        tv.setText(planeta.nome);
        iv.setImageResource(planeta.foto);

        return v;
    }
}
