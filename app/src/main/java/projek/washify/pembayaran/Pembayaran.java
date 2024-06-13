package projek.washify.pembayaran;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import projek.washify.R;

public class Pembayaran extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BayarAdapter bayarAdapter;
    private ArrayList<BayarModel> bayarModels;
//    private DatabaseReference pembayaran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pembayaran);


//        pembayaran = FirebaseDatabase.getInstance().getReference();
        getData();


        recyclerView = findViewById(R.id.recycleview);
        bayarAdapter = new BayarAdapter(bayarModels);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Pembayaran.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(bayarAdapter);
    }

    private void getData() {
        bayarModels = new ArrayList<>();
        bayarModels.add(new BayarModel("Shopee Pay", "085753453444",R.drawable.sopi));
        bayarModels.add(new BayarModel("Ovo", "085768791035",R.drawable.ovo));
        bayarModels.add(new BayarModel("Gopay", "01234567890",R.drawable.gopay));
        bayarModels.add(new BayarModel("Dana", "085735647575",R.drawable.dana));
        bayarModels.add(new BayarModel("Mandiri Transfer", "13455544466",R.drawable.mandiri));
        bayarModels.add(new BayarModel("BRI Transfer", "120567896745",R.drawable.bri));
        bayarModels.add(new BayarModel("BNI Transfer", "13576678900",R.drawable.bni));
        bayarModels.add(new BayarModel("BCA Transfer", "8956435467",R.drawable.bca));
        bayarModels.add(new BayarModel("BTN Transfer", "88977566445",R.drawable.btn));
        bayarModels.add(new BayarModel("BSI Transfer", "15755446632",R.drawable.bsi));
    }
    public void onBayarButtonClicked(View view) {
        // Replace "NextActivity.class" with the actual class of your next layout
        Intent intent = new Intent(this, lanjutbayar.class);
        startActivity(intent);
    }
}
