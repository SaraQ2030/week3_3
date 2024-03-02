import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book extends Media {
        private int stock;
        private ArrayList<Review> reviews;


        public Book(String title, String autuer, String ISBN, double price, int stock) {
            super(title, autuer, ISBN, price);
            this.stock = stock;
           this.reviews=new ArrayList<>();
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public void addReview(Review review) {

            reviews.add(review);
        }


    public double getAverageRating() {
        if (reviews.isEmpty()) return 0.0;
        double sum = 0.0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        return sum / reviews.size();
    }


    public void purchase(User user) {
        user.addToCart(this);
       stock--;
    }
    public boolean isBestseller() {
        return getAverageRating() >= 4.5;
    }
    public void restock(int quantity) {
        stock += quantity;
        System.out.println("Restocked " + getTitle() + ". New quantity in stock: " + stock);
    }

    @Override
    public String getMediaType() {
        return isBestseller() ? "Bestselling Book" : "Book";
    }

    @Override
        public String toString() {
            return "Book{" +
                    "title='" + getTitle() + '\'' +
                    ", author='" + getAuteur() + '\'' +
                    ", ISBN='" + getISBN() + '\'' +
                    ", price=" + getPrice() +
                    ", stock=" + stock +
                    ", reviews=" +reviews +
                    '}';
        }
    }