package projek.washify.riwayatPemesanan.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import projek.washify.R;
import projek.washify.riwayatPemesanan.Pelacakan;
import projek.washify.riwayatPemesanan.database.entitas.Pesanan;


public class PesananAdapter extends RecyclerView.Adapter<PesananAdapter.VH> {

    private final Context context;
    private ArrayList<Pesanan> list;

    public PesananAdapter(Context context) {
        this.context = context;
        this.list = new ArrayList<>();
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.riwayat_pesanan, parent, false);
        return new VH(view);
    }

    public void setData(ArrayList<Pesanan> pesananList) {
        if (pesananList != null) {
            this.list = pesananList;
        } else {
            this.list = new ArrayList<>();
        }
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.tvIdOrder.setText("Order #" + list.get(position).nomorId);
        holder.tvTanggalPesan.setText(list.get(position).tanggalPemesanan);
        holder.tvEstimasiDelivery.setText("Estimated Delivery in " + list.get(position).estimasiDelivery);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class VH extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvIdOrder;
        TextView tvTanggalPesan;
        TextView tvEstimasiDelivery;

        public VH(@NonNull View itemView) {
            super(itemView);
            tvIdOrder = itemView.findViewById(R.id.tvIdOrder);
            tvTanggalPesan = itemView.findViewById(R.id.tvTanggalPesan);
            tvEstimasiDelivery = itemView.findViewById(R.id.tvEstimasiDelivery);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Pesanan pesanan = list.get(getAdapterPosition());
            String message = "Pesanan " + pesanan.nomorId + " ditekan";
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(context, Pelacakan.class);
            intent.putExtra("id", pesanan.nomorId);
            intent.putExtra("tanggal", pesanan.tanggalPemesanan);
            intent.putExtra("estimasi", pesanan.estimasiDelivery);
            context.startActivity(intent);
        }
    }
}
