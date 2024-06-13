package projek.washify.pemesanan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import projek.washify.R;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Response;

public class MainPemesanan extends AppCompatActivity {

    private ArrayList<ListBaju> data;
    private RecyclerView rvListBaju;

    Button btToast;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pemesanan_main);

        this.data = new ArrayList<ListBaju>();

        ListBaju a =new ListBaju("Pajamas","Rp 500", "Women", R.drawable.pajamas_2246233);
        ListBaju b =new ListBaju("Skirt","Rp 500", "Women", R.drawable.skirt_2237020);
        ListBaju c =new ListBaju("Dress","Rp 500", "Women", R.drawable.dress_1785375);
        ListBaju d =new ListBaju("Jeans","Rp 500", "Men", R.drawable.jeans_776586);
        ListBaju e =new ListBaju("Underwear","Rp 500", "Men", R.drawable.underwear_10113103);
        ListBaju f =new ListBaju("Socks","Rp 500", "Men", R.drawable.socks_2161101);
        ListBaju g =new ListBaju("Cap","Rp 500", "Men", R.drawable.cap_9943069);

        this.data.add(a);this.data.add(b);this.data.add(c);
        this.data.add(d);this.data.add(e);this.data.add(f);
        this.data.add(g);this.data.add(a);this.data.add(a);

        this.rvListBaju = this.findViewById(R.id.rvListBaju);

        ListBajuAdapter listBajuAdapter =
                new ListBajuAdapter(MainPemesanan.this, this.data);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainPemesanan.this);
        this.rvListBaju.setLayoutManager(lm);
        this.rvListBaju.setAdapter(listBajuAdapter);

        btToast = findViewById(R.id.btToast);

        btToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainPemesanan.this, "clothes already selected", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
