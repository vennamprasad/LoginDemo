package com.example.trackrtc.Adpt;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.example.trackrtc.R;
import com.example.trackrtc.databinding.BusListBinding;
import com.example.trackrtc.model.BusList;

import java.util.ArrayList;

public class BusListAdapter extends RecyclerView.Adapter<BusListAdapter.MyViewHolder> {
    ArrayList<BusList> busListAdapterArrayList;
    Context context;

    public BusListAdapter(Activity activity, ArrayList<BusList> busListAdapterArrayList) {
        context = activity;
        this.busListAdapterArrayList = busListAdapterArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        BusListBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.bus_list, null, false);
        return new MyViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        holder.binding.tvBusName.setText(busListAdapterArrayList.get(i).getBusName());

    }

    @Override
    public int getItemCount() {
        return busListAdapterArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        BusListBinding binding;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = DataBindingUtil.getBinding(itemView);
        }
    }
}
