package projek.washify.riwayatPemesanan.thread;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import projek.washify.riwayatPemesanan.adapter.PesananAdapter;
import projek.washify.riwayatPemesanan.database.entitas.Pesanan;


public class PesananFetcher {
    private static final String TAG = "PesananFetcher";
    private final Context context;
    private final PesananAdapter adapter;
    private final ArrayList<Pesanan> pesananList = new ArrayList<>();
    private DatabaseReference databaseReference;

    public PesananFetcher(Context context, PesananAdapter adapter) {
        this.context = context;
        this.adapter = adapter;
        this.databaseReference = FirebaseDatabase.getInstance().getReference("orders"); // Ganti "orders" dengan path yang sesuai di database Anda
    }

    public void fetchDataFromFirebase() {
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                pesananList.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Pesanan pesanan = snapshot.getValue(Pesanan.class);
                    if (pesanan != null) {
                        pesananList.add(pesanan);
                    }
                }
                new Handler(Looper.getMainLooper()).post(() -> adapter.setData(pesananList));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.w(TAG, "Failed to read value.", error.toException());
                new Handler(Looper.getMainLooper()).post(() ->
                        Toast.makeText(context, "Failed to fetch data", Toast.LENGTH_SHORT).show());
            }
        });
    }
}
