import java.util.ArrayList;

public class User {
    private String userName;
    private String email;

  private ArrayList<Media> purchasedMediaList;
    private ArrayList<Media> shoppingCart;
    private ArrayList<Review> reviews;


public User(){}
    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
        this.shoppingCart=new ArrayList<>();
        this.reviews=new ArrayList<>();
        purchasedMediaList=new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public ArrayList<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }


    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void addToCart(Media media){
        shoppingCart.add(media);
}
public void removeFromCart(Media media){
        shoppingCart.remove(media);
}
    public void checkout() {
        purchasedMediaList.addAll(shoppingCart);
        shoppingCart.clear();
    }

    public void addToPurchasedMediaList(Movie movie) {
        shoppingCart.add(movie);
    }
    public void leaveReview(Book book, String comment, String rating) {
        Review review = new Review(userName, comment, rating);
        book.addReview(review);
        reviews.add(review);
    }

    public double average(Book book) {
        double sum = 0;
        int count = 0;
        if (book.getReviews() != null) {
            for (Review review : book.getReviews()) {
                sum += Double.parseDouble(review.getRating());
                count++;
            }
            return count > 0 ? sum / count : 0;
        }    else {
            return -1;
        }
        }

}


