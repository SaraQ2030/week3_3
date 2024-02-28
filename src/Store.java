import java.util.ArrayList;
public class Store {
    private ArrayList<Media> media;
    private ArrayList<User> user;
    public Store(ArrayList<Media> media, ArrayList<User> user) {
        this.media = new ArrayList<>(media); // Copy the media ArrayList
        this.user = new ArrayList<>(user);   // Copy the user ArrayList
    }

    public Store() {

    }

    public void addUser(User newUser) {
        user.add(newUser);
    }

    public void addMedia(Media newMedia) {
        media.add(newMedia);
    }

    public ArrayList<User> displayUser() {
        return user;
    }

    public ArrayList<Media> displayMedia() {
        return media;
    }

    public Media searchTitle(String title) {
        for (Media m : media) {
            if (m.getTitle().equals(title)) {
                return m; // Return the media if found
            }
        }
        return null; // Return null if not found
    }


    @Override
    public String toString() {
        return "Store: \nUsers: " + user + "\nMedia: " + media;
    }
}
