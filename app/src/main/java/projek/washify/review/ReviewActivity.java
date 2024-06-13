package projek.washify.review;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

import projek.washify.R;

public class ReviewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ReviewAdapter adapter;
    private ReviewDAO reviewDAO;
    private Button writeReviewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review_activity_review);

        recyclerView = findViewById(R.id.rvReview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        reviewDAO = new ReviewDAOImpl();

        reviewDAO.getAllReviews(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error != null) {
                    // Handle the error
                    return;
                }

                List<Users> reviews = new ArrayList<>();
                for (QueryDocumentSnapshot document : value) {
                    Users review = document.toObject(Users.class);
                    reviews.add(review);
                }
                adapter = new ReviewAdapter(reviews);
                recyclerView.setAdapter(adapter);
            }
        });

        writeReviewButton = findViewById(R.id.buttonReview);
        writeReviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReviewActivity.this, ReviewFormActivity.class);
                startActivity(intent);
            }
        });
    }
}
