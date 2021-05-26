package com.example.projecttwoversion.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projecttwoversion.Bean.Bean_a;
import com.example.projecttwoversion.R;

import java.util.ArrayList;
import java.util.List;

public class Adapter_A  extends RecyclerView.Adapter<Adapter_A.MyHoldView> {

    private Context mcontext;
    private List<Bean_a> date;

    public Adapter_A(Context mcontext, List<Bean_a> date) {
        this.mcontext = mcontext;
        this.date = date;
    }

    @NonNull
    @Override
    public MyHoldView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(mcontext, R.layout.item_sample, null);
        return new MyHoldView(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyHoldView holder, int position) {
        holder.tv_title.setText(date.get(position).getEqupment());
        holder.tv_sample.setText(date.get(position).getSample());
        holder.tv_scantime.setText(date.get(position).getScantime());
        holder.tv_solvent.setText(date.get(position).getSolvent());
    }

    @Override
    public int getItemCount() {
        return date.size();
    }

    public class MyHoldView extends RecyclerView.ViewHolder {
        private TextView tv_title,tv_sample,tv_scantime,tv_solvent;
        public MyHoldView(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_sample = itemView.findViewById(R.id.tv_sample_name);
            tv_scantime = itemView.findViewById(R.id.tv_scantime_name);
            tv_solvent = itemView.findViewById(R.id.solvent_name);
        }
    }
}
