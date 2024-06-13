package projek.washify.pemesanan.LayananLaundry;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import projek.washify.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SelectServiceActivity extends AppCompatActivity {
    private DatabaseReference databaseReference;
    private EditText serviceDescriptionEditText, servicePriceEditText;
    private Button addServiceButton;
    private Spinner serviceSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pemesanan_activity_select_service);

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        serviceDescriptionEditText = findViewById(R.id.service_description);
        servicePriceEditText = findViewById(R.id.service_price);
        addServiceButton = findViewById(R.id.add_service_button);
        serviceSpinner = findViewById(R.id.service_spinner);

        // Isi spinner dengan opsi layanan
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.service_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        serviceSpinner.setAdapter(adapter);

        addServiceButton.setOnClickListener(v -> addService());
    }

    public void addService() {
        String name = serviceSpinner.getSelectedItem().toString();
        String description = serviceDescriptionEditText.getText().toString();
        String price = servicePriceEditText.getText().toString();

        // Validasi input
        if (TextUtils.isEmpty(description) || TextUtils.isEmpty(price)) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        // Menambahkan data ke Firebase Realtime Database
        String key = databaseReference.child("services").push().getKey();
        Service service = new Service(name, description, Double.parseDouble(price));
        databaseReference.child("services").child(key).setValue(service)
                    .addOnSuccessListener(unused -> {
                        // Data berhasil ditambahkan
                        Toast.makeText(SelectServiceActivity.this, "Service added successfully", Toast.LENGTH_SHORT).show();
                        finish();
                    })
                .addOnFailureListener(e -> {
                    // Gagal menambahkan data
                    Toast.makeText(SelectServiceActivity.this, "Failed to add service: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                });
    }
}
