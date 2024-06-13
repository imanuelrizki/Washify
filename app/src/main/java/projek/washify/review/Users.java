package projek.washify.review;

public class Users {
    private String id;
    private String userName;
    private String reviewText;

    public Users(String username, String reviewText) {
        // Default constructor required for calls to DataSnapshot.getValue(Users.class)
    }

    public Users(String id, String userName, String reviewText) {
        this.id = id;
        this.userName = userName;
        this.reviewText = reviewText;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }
}
