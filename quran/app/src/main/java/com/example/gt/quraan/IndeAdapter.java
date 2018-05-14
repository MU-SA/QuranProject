package com.example.gt.quraan;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by g.t on 13/01/2018.
 */

public class IndeAdapter extends RecyclerView.Adapter<IndeAdapter.MyViewHolder> {
    private Context mContext;
    private java.util.List<Soraa> List;


    public IndeAdapter(Context mContext, java.util.List<Soraa> words) {
        this.mContext = mContext;
        List = words;
        List = words;


    }

    @Override
    public IndeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.index_item, parent, false);

        return new IndeAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(IndeAdapter.MyViewHolder holder, final int position) {
        final Soraa listItem = List.get(position);
        holder.name.setText(listItem.getName());
        holder.page_number.setText(String.valueOf(listItem.getPageNumber()));
        // Font path
        String fontPath = "fonts/hafs.otf";


        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(mContext.getAssets(), fontPath);

        // Applying font
        holder.name.setTypeface(tf);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, Slider.class);
                Bundle bundle = new Bundle();
                bundle.putInt("position", position);
                bundle.putInt("index", listItem.getPageNumber());
                intent.putExtras(bundle);
                mContext.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return List.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final Context context;
        TextView name, page_number;

        public MyViewHolder(View view) {
            super(view);

            name = (TextView) view.findViewById(R.id.nmae);
            page_number = (TextView) view.findViewById(R.id.number);
            context = itemView.getContext();


        }
    }
}

