package projek.washify.review;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import projek.washify.R;

public class ReviewFormActivity extends AppCompatActivity {
    private EditText reviewEditText;
    private Button submitButton;
    private ReviewDAO reviewDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review_activity_writereview);

        reviewEditText = findViewById(R.id.editTextReview);
        submitButton = findViewById(R.id.buttonSubmit);
        reviewDAO = new ReviewDAOImpl();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String review = reviewEditText.getText().toString().trim();
                if (!review.isEmpty()) {
                    reviewDAO.saveReview("Current User", review);
                }
                finish();
            }
        });
    }
}
