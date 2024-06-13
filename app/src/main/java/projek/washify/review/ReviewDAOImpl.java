package projek.washify.review;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

public class ReviewDAOImpl implements ReviewDAO {
    private CollectionReference reviewsCollection;

    public ReviewDAOImpl() {
        reviewsCollection = FirebaseFirestore.getInstance().collection("reviews");
    }

    @Override
    public void getAllReviews(EventListener<QuerySnapshot> listener) {
        reviewsCollection.addSnapshotListener(listener);
    }

    @Override
    public void saveReview(String username, String reviewText) {
        String id = reviewsCollection.document().getId();
        Users review = new Users(id, username, reviewText);
        reviewsCollection.document(id).set(review);
    }

    @Override
    public void deleteReview(String id) {
        reviewsCollection.document(id).delete();
    }

    @Override
    public void updateReview(String id, String newReviewText) {
        reviewsCollection.document(id).update("reviewText", newReviewText);
    }
}
