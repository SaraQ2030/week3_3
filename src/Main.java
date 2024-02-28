import java.awt.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
User user=new User();

        // Create instances of various books, movies, and music items
        Book book1 = new Book("Book1", "asfddre", "978074", 12.99, 100, new Review[]{new Review("user1", "Great book!", "5"), new Review("user2", "Enjoyed reading it", "4")});
        Book book2 = new Book("book2", "Harper Lee", "9780061120084", 10.50, 150, new Review[]{new Review("user3", "Good", "4"), new Review("user4", "Highly recommended", "5")});

        Movie movie1 = new Movie("movie1", "auteur1", "9780123456789", 14.99, 148, "Movie");
        Movie movie2 = new Movie("movie2 ", "auteur2", "9780790731953", 9.99, 80, "Movie");

            Music music1 = new Music("song1", "auteur1", "9780903284", 0.99, "song");
            Music music2 = new Music("song2", "auteur2", "9781432119703", 1.29, "song");

        Novel novel1 = new Novel("novel1", "George Orwell", "9780451524935", 9.95, 200, new Review[]{new Review("user5", "Dystopian masterpiece", "5"), new Review("user6", "Thought-provoking", "4.5")}, "Dystopian");
        AcademicBook academicBook1 = new AcademicBook("Introduction to Algorithms", "Thomas H. Cormen", "9780262033848", 80.50, 500, new Review[]{new Review("user7", "Comprehensive guide", "4.5"), new Review("user8", "Excellent textbook", "5")});

        // Create a store
        Store store = new Store();

        // Add media to the media list
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(music1);
        store.addMedia(music2);
        store.addMedia(novel1);
        store.addMedia(academicBook1);

        // Display media list
        System.out.println("Store's Available Media List:");
        ArrayList<Media> availableMedia = store.displayMedia();
        for (Media media : availableMedia) {
            System.out.println(media);
        }





    }
}