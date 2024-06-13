package projek.washify.pembayaran;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import projek.washify.R;

public class lanjutbayar extends AppCompatActivity {

    Button firstFragmentBtn, secondFragmentBtn;
    private TextView tvStatus, tvMessage, tvNomorId, tvJumlahPesanan, tvTotalHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pembayaran_lanjutactivity);
        firstFragmentBtn = findViewById(R.id.btkembali);
        secondFragmentBtn = findViewById(R.id.btlanjut);
        tvStatus = findViewById(R.id.tvStatus);
        tvMessage = findViewById(R.id.tvMessage);
        tvNomorId = findViewById(R.id.tvNomorId);
        tvJumlahPesanan = findViewById(R.id.tvJumlahPesanan);
        tvTotalHarga = findViewById(R.id.tvTotalHarga);

        firstFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBackMessage();
            }
        });

        secondFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLanjutBayarMessage();
            }
        });
    }

    private void showBackMessage() {
        tvMessage.setText("Kembali ke halaman sebelumnya");
        // Implementasikan logika tambahan yang diperlukan saat tombol 'Kembali' ditekan
    }

    private void showLanjutBayarMessage() {
        tvMessage.setText("Lanjut ke halaman pembayaran");
        // Implementasikan logika tambahan yang diperlukan saat tombol 'Lanjut' ditekan
    }
}
