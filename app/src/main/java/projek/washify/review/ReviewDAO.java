package projek.washify.review;

import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.QuerySnapshot;

public interface ReviewDAO {
    void getAllReviews(EventListener<QuerySnapshot> listener);
    void saveReview(String username, String reviewText);
    void deleteReview(String id);
    void updateReview(String id, String newReviewText);
}
