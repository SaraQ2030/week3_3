import java.util.ArrayList;

public class Store {
    private ArrayList<Media> mediaList;
    private ArrayList<User> users;
    public Store(ArrayList<Media> media, ArrayList<User> user) {
        this.mediaList = new ArrayList<>();
        this.users = new ArrayList<>();
    }
    public Store() {
        this.mediaList = new ArrayList<>();
        this.users = new ArrayList<>();
    }


    public void addUser(User user) {

        users.add(user);
    }
    public void displayUsers() {
        System.out.println("Registered Users:");
        for (User user : users) {
            System.out.println(user.getUserName() + " - " + user.getEmail());
        }
    }

    public void addMedia(Media media)
    {
        mediaList.add(media);
    }

       public void displayMedia() {
           System.out.println("Available Media:");
           for (Media media : mediaList) {
               System.out.println(media);
           }
       }

    public Media searchBook(String title) {
        for (Media media : mediaList) {
            if (media instanceof Book && media.getTitle().equalsIgnoreCase(title)) {
                return (Book) media;
            }
        }
        return null; // Return null if not found
    }


    @Override
    public String toString() {
        return "Store: \nUsers: " + users + "\nMedia: " + mediaList;
    }
}
