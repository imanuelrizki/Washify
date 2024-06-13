package projek.washify.review;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class FirebaseHelper {
    private static final String COLLECTION_NAME = "reviews";
    private FirebaseFirestore db;

    public FirebaseHelper() {
        db = FirebaseFirestore.getInstance();
    }

    public void getAllReviews(final FirebaseCallback callback) {
        db.collection(COLLECTION_NAME)
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        List<Users> reviews = new ArrayList<>();
                        for (QueryDocumentSnapshot document : task.getResult()) {
                            String username = document.getString("username");
                            String reviewText = document.getString("review_text");
                            reviews.add(new Users(username, reviewText));
                        }
                        callback.onCallback(reviews);
                    } else {
                        callback.onFailure(task.getException());
                    }
                });
    }

    public void saveReview(String username, String reviewText) {
        Users review = new Users(username, reviewText);
        db.collection(COLLECTION_NAME).add(review);
    }

    public void deleteReview(String id) {
        db.collection(COLLECTION_NAME).document(id).delete();
    }

    public void updateReview(String id, String newReviewText) {
        db.collection(COLLECTION_NAME).document(id)
                .update("review_text", newReviewText);
    }

    public interface FirebaseCallback {
        void onCallback(List<Users> reviews);
        void onFailure(Exception e);
    }
}
