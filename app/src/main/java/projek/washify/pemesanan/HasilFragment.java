package projek.washify.pemesanan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import projek.washify.R;

public class HasilFragment extends Fragment {

    private TextView textViewHasil;

    public HasilFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pemesanan_fragment_hasil, container, false);
        textViewHasil = view.findViewById(R.id.textViewHasil);

        // Set text from arguments
        if (getArguments() != null && getArguments().containsKey("result")) {
            textViewHasil.setText(getArguments().getString("result"));
        }

        return view;
    }

    public void updateResult(String result) {
        if (textViewHasil != null) {
            textViewHasil.setText(result);
        }
    }
}
