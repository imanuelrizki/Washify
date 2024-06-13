package projek.washify.pemesanan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import projek.washify.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CekFragment extends Fragment {

    private Spinner spinnerJenisPakaian;
    private Button buttonCekKetersediaan;
    private Retrofit retrofit;

    public CekFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pemesanan_fragment_cek, container, false);
        spinnerJenisPakaian = view.findViewById(R.id.spinnerJenisPakaian);
        buttonCekKetersediaan = view.findViewById(R.id.buttonCekKetersediaan);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://mocki.io/") // Ganti dengan URL server Anda
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        setupSpinner();

        buttonCekKetersediaan.setOnClickListener(v -> {
            String jenisPakaian = spinnerJenisPakaian.getSelectedItem().toString();
            cekKetersediaanLayanan(jenisPakaian);
        });

        return view;    
    }

    private void setupSpinner() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.jenis_pakaian_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJenisPakaian.setAdapter(adapter);
    }

    private void cekKetersediaanLayanan(String jenisPakaian) {
        LaundryServiceAPI service = retrofit.create(LaundryServiceAPI.class);
        Call<KetersediaanResponse> call = null; // Initialize to null to handle the default case

        // Memilih endpoint yang sesuai berdasarkan jenis pakaian
        switch (jenisPakaian) {
            case "Pakaian Biasa":
                call = service.cekKetersediaanPakaianBiasa(jenisPakaian);
                break;
            case "Pakaian Berat":
                call = service.cekKetersediaanPakaianBerat(jenisPakaian);
                break;
            case "Pakaian Khusus":
                call = service.cekKetersediaanPakaianKhusus(jenisPakaian);
                break;
            default:
                // Menampilkan pesan error jika jenis pakaian tidak valid
                Toast.makeText(getContext(), "Jenis pakaian tidak valid", Toast.LENGTH_SHORT).show();
                return;
        }

        // Menjalankan panggilan API dan menangani respons
        if (call != null) {
            call.enqueue(new Callback<KetersediaanResponse>() {
                @Override
                public void onResponse(Call<KetersediaanResponse> call, Response<KetersediaanResponse> response) {
                    if (response.isSuccessful() && response.body() != null) {
                        // Communication back to the Activity can be established here if needed
                        Toast.makeText(getContext(), response.body().getPesan(), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getContext(), "Error: " + response.code() + " " + response.message(), Toast.LENGTH_LONG).show();
                    }
                }

                @Override
                public void onFailure(Call<KetersediaanResponse> call, Throwable t) {
                    Toast.makeText(getContext(), "Network error: " + t.getMessage(), Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
