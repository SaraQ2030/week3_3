import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String email;
    private ArrayList<Media> shoppingCart;
    private ArrayList<Media> purchasedMediaList;

    public User() {
        this.shoppingCart = new ArrayList<>();
        this.purchasedMediaList = new ArrayList<>();
    }

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
        this.shoppingCart = new ArrayList<>();
        this.purchasedMediaList = new ArrayList<>();
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

    public void addToCart(Media media) {
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media) {
        shoppingCart.remove(media);
    }

    public void checkout() {
        purchasedMediaList.addAll(shoppingCart);
        shoppingCart.clear();
    }

    public ArrayList<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(ArrayList<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void addToPurchased(Media media) {
        purchasedMediaList.add(media);
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}

