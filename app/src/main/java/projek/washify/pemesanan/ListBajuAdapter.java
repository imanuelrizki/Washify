package projek.washify.pemesanan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import projek.washify.R;

import org.w3c.dom.Text;

import java.util.List;

public class ListBajuAdapter extends
        RecyclerView.Adapter<RecyclerView.ViewHolder> {



    private final Context context;
    private final List<ListBaju> kontaks;

    public ListBajuAdapter(Context context, List<ListBaju> kontaks) {
        this.context = context;
        this.kontaks = kontaks;
    }

    public class VH extends RecyclerView.ViewHolder{
        private final ImageView ivavatar;
        private final TextView tvjenisbaju;
        private final TextView tvharga;
        private final TextView tvgender;

        public VH(@NonNull View itemView){
            super(itemView);
            this.ivavatar = itemView.findViewById(R.id.ivAvatar);
            this.tvjenisbaju = itemView.findViewById(R.id.tvjenisbaju);
            this.tvharga = itemView.findViewById(R.id.tvharga);
            this.tvgender = itemView.findViewById(R.id.tvgender);


        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vh = LayoutInflater.from(this.context)
                .inflate(R.layout.pemesanan_adding_clothes, parent, false);
        return new VH(vh);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ListBaju L =  this.kontaks.get(position);
        VH vh =(VH) holder;
        vh.ivavatar.setImageResource(   (L.fotoProduk));
        vh.tvjenisbaju.setText(L.jenis_baju.toString());
        vh.tvharga.setText(L.harga.toString());
        vh.tvgender.setText(L.gender.toString());




    }

    @Override
    public int getItemCount() {
        return this.kontaks.size();
    }
}