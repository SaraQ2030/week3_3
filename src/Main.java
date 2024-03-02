import java.awt.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
User user=new User();


        Book book1 = new Book("book 1", "Frank", "9780743273565", 15.99, 10);
        Book book2 = new Novel("Novel 1", "lew", "9780061120084", 12.50, 15, "fancy");
        Book book3 = new AcademicBook("Computer", "joe", "9780262033848", 75.00, 5, "Science");
        Movie movie1 = new Movie("Taken", "Can", "9780783229744", 9.99, 148);
        Music music1 = new Music("song", "meme", "9780769200135", 1.29);

            //  review
//            Review review = new Review("Frank", "This book is amazing!", 5);
//            book1.addReview(review);

        Store store = new Store();
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        store.addMedia(movie1);
        store.addMedia(music1);


        User user1 = new User("user1", "user1@example.com");

        // Add to the user's shopping cart
        user1.addToCart(book1);
        user1.addToCart(movie1);

        // Remove from shopping cart
        user1.removeFromCart(book1);

        // Complete purchase
        user1.checkout();

        // Display available medias and registered users
        store.displayMedia();
        store.displayUsers();

        // Test searchBook method
        Book foundBook = (Book) store.searchBook("book 1");
        if (foundBook != null) {
            System.out.println("Found Book: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}


