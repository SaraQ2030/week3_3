import java.util.Arrays;
public class Book extends Media {
        private int stock;
        private Review[] reviews;
        private double averageRating;

        public Book(String title, String autuer, String ISBN, double price, int stock, Review[] reviews) {
            super(title, autuer, ISBN, price);
            this.stock = stock;
            this.reviews = reviews;
            this.averageRating = calculateAverageRating();
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public Review[] getReviews() {
            return reviews;
        }

        public void setReviews(Review[] reviews) {
            this.reviews = reviews;
            this.averageRating = calculateAverageRating();
        }


        public void addReview(Review r) {
            //
            Review[] newReviews = Arrays.copyOf(reviews, reviews.length + 1);
            newReviews[newReviews.length - 1] = r;
            this.reviews = newReviews;
            this.averageRating = calculateAverageRating();
        }


        public double calculateAverageRating() {
            if (reviews == null || reviews.length == 0) {
                return 0;
            }
            double sum = 0;
            for (Review review : reviews) {
                sum += Double.parseDouble(review.getRating());
            }
            return sum / reviews.length; // Calculate the average rating
        }

        public double getAverageRating() {
            return averageRating;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + getTitle() + '\'' +
                    ", author='" + getAuteur() + '\'' +
                    ", ISBN='" + getISBN() + '\'' +
                    ", price=" + getPrice() +
                    ", stock=" + stock +
                    ", reviews=" + Arrays.toString(reviews) +
                    ", averageRating=" + averageRating +
                    '}';
        }
    }