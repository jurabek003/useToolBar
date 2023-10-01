package uz.turgunboyevjurabek.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import uz.turgunboyevjurabek.myapplication.databinding.ItemRvBinding;

public class RvAdapterr2 extends RecyclerView.Adapter<RvAdapterr2.Vh> {
    private ArrayList<Madels2> list;

    public RvAdapterr2(ArrayList<Madels2> list) {
        this.list = list;
    }

    public class Vh extends RecyclerView.ViewHolder {
        private ItemRvBinding itemRvBinding;

        public Vh(ItemRvBinding itemRvBinding) {
            super(itemRvBinding.getRoot());
            this.itemRvBinding = itemRvBinding;
        }

        public void onBind(Madels2 madels) {
            itemRvBinding.name.setText(String.valueOf(madels.name));
            itemRvBinding.lastName.setText(String.valueOf(madels.last_name));
        }
    }

    @Override
    public Vh onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemRvBinding itemRvBinding = ItemRvBinding.inflate(inflater, parent, false);
        return new Vh(itemRvBinding);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onBindViewHolder(Vh holder, int position) {
        holder.onBind(list.get(position));
    }
}
