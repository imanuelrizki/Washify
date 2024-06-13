package projek.washify.pemesanan.pickupschedule;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.lifecycle.ViewModelProvider;
import projek.washify.R;
import projek.washify.pemesanan.halaman_pemesanan_activity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainPickupSchedule extends AppCompatActivity {

    private ScheduleViewModel scheduleViewModel;
    private ImageView arrowback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pemesanan_laundry_pickup);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        arrowback = (ImageView) findViewById(R.id.arrow_back);

        arrowback.setOnClickListener(v -> {
            Intent intent = new Intent(MainPickupSchedule.this, halaman_pemesanan_activity.class);
            startActivity(intent);
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        final ScheduleAdapter adapter = new ScheduleAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        scheduleViewModel = new ViewModelProvider(this).get(ScheduleViewModel.class);
        scheduleViewModel.getAllSchedules().observe(this, schedules -> {
            adapter.setSchedules(schedules);
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> {
            Intent intent = new Intent(MainPickupSchedule.this, AddPickupScheduleActivity.class);
            startActivity(intent);
        });
    }
}
