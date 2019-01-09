package com.example.user.pr_re1;

import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NA extends RecyclerView.Adapter<NA.VH>
{
    public String[] info;
    public NA(String[] info)
    {
        this.info = info;
    }
    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.lop,viewGroup,false);
        return new VH(view);  //returns view so create nEW view
    }

    @Override
    public void onBindViewHolder(@NonNull VH vh, int i)
    {
       // wrt t i posn set data to vh
        String title = info[i];  //retrieve data
        vh.tv.setText(title);

    }

    @Override
    public int getItemCount()
    {
        return info.length;
    }

    public class VH extends RecyclerView.ViewHolder
    {
        TextView tv;
        public VH(@NonNull View itemView)
        {
            super(itemView);
            tv = itemView.findViewById(R.id.TV1);

        }
    }
}
