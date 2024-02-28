public class Review {
    private String username;
    private String comment;
    private String rating;
    public Review(String username,String comment,String rating ){
        this.username=username;
        this.comment=comment;
        this.rating=rating;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
