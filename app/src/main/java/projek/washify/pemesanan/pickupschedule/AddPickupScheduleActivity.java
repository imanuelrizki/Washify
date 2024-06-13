package projek.washify.pemesanan.pickupschedule;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import projek.washify.R;

public class AddPickupScheduleActivity extends AppCompatActivity {

    private ScheduleViewModel scheduleViewModel;
    private ImageView arrowback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pemesanan_activity_add_pickup_schedule);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        scheduleViewModel = new ViewModelProvider(this).get(ScheduleViewModel.class);

        EditText customerNameEditText = findViewById(R.id.edit_text_customer_name);
        EditText notesEditText = findViewById(R.id.edit_text_notes);
        Button saveButton = findViewById(R.id.button_save);

        arrowback = (ImageView) findViewById(R.id.arrow_back3);

        arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(getApplicationContext(), MainPickupSchedule.class);
                startActivity(kembali);
            }
        });




        saveButton.setOnClickListener(v -> {
            String customerName = customerNameEditText.getText().toString();
            String notes = notesEditText.getText().toString();
            PickupSchedule schedule = new PickupSchedule(0, customerName, System.currentTimeMillis(), "Scheduled", notes);
            scheduleViewModel.insert(schedule);
            finish();
        });
    }
}
