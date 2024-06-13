package projek.washify.pembayaran;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import projek.washify.R;

public class BayarAdapter extends RecyclerView.Adapter<BayarAdapter.ViewHolder> {

    private ArrayList<BayarModel> bayarModels;

    public BayarAdapter(ArrayList<BayarModel> bayarModels) {
        this.bayarModels = bayarModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pembayaran_list_item,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.namabayar.setText(bayarModels.get(position).getNamabayar());
        holder.nomer.setText(bayarModels.get(position).getnomer());
        holder.logobayar.setImageResource(bayarModels.get(position).getLogobayar());

    }

    @Override
    public int getItemCount() {
        return bayarModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namabayar;
        TextView nomer;
        Button btBayar;
        ImageView logobayar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namabayar = itemView.findViewById(R.id.namabayar);
            nomer = itemView.findViewById(R.id.nomer);
            btBayar = itemView.findViewById(R.id.btBayar);
            logobayar = itemView.findViewById(R.id.logobayar);
        }
    }
}
