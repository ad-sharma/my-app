package com.example.vogellafinal;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VogellaAdapter extends RecyclerView.Adapter<VogellaAdapter.VogellaViewHolder> {

    public List<String> values;

    public static class VogellaViewHolder extends RecyclerView.ViewHolder {
        public TextView vogella_textview;

        public VogellaViewHolder(View v) {
            super(v);
            vogella_textview = (TextView) v.findViewById(R.id.vogella_text_view);
        }
    }

    public VogellaAdapter(List<String> myDataset)
    {
        values=myDataset;
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    @NonNull
    @Override
    public VogellaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View v=inflater.inflate(R.layout.vogella_row,parent,false);
        return  new VogellaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull VogellaViewHolder holder, int position) {
        String name=values.get(position);
        holder.vogella_textview.setText(name);
    }
}
