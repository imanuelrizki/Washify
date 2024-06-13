package projek.washify.riwayatPemesanan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import projek.washify.R;

public class Pelacakan extends AppCompatActivity implements View.OnClickListener {

    private View btBack,btCall;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.riwayat_pesanan_activity_pelacakan);
        this.btBack = this.findViewById(R.id.ivBack);
        this.btCall = this.findViewById(R.id.btCall);
        Intent jembatan = getIntent();
        int idPesanan = jembatan.getIntExtra("id",0);
        TextView tvNomorOrder = findViewById(R.id.tvIdOrder);
        tvNomorOrder.setText("# " + idPesanan);
        String tanggalPesanan = jembatan.getStringExtra("tanggal");
        TextView tvTanggalPesan = findViewById(R.id.tvTanggalPesan);
        tvTanggalPesan.setText(tanggalPesanan.toString());
        String estimasi = jembatan.getStringExtra("estimasi");
        TextView tvEstimasiDelivery = findViewById(R.id.tvEstimasiDelivery);
        tvEstimasiDelivery.setText("Estimasi Pengiriman "+estimasi.toString());

    }

    @Override
    protected void onResume() {
        super.onResume();
        this.btBack.setOnClickListener(this);
        this.btCall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.ivBack){
            Intent jembatan = new Intent(this, RiwayatPesanan.class);
            startActivity(jembatan);
        }
        if(v.getId()==R.id.btCall){
            Intent jembatan = new Intent(Intent.ACTION_VIEW);
            jembatan.setData(Uri.parse("content://contacts"));
            startActivity(jembatan);

        }

    }
}
