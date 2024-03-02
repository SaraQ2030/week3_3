import java.util.ArrayList;

public class Music extends Media {
private String artist;
    private ArrayList<Review> reviews;

    public Music(String title,String auteur,String ISBN,double price){
        super(title,auteur,ISBN,price);
        this.artist= artist;
        this.reviews = new ArrayList<>();
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public void listen(User user) {
        user.addToPurchased(this);
    }

    public ArrayList<Music> generatePlaylist(ArrayList<Music> musicCatalog) {
        ArrayList<Music> playlist = new ArrayList<>();
        for (Music music : musicCatalog) {
            if (music.getArtist().equals(artist) && !music.getTitle().equals(getTitle())) {
                playlist.add(music);
            }
        }
        return playlist;
    }


    public String getMediaType(){
            if (getPrice()>=10){
                return "premium Music";
            }else  return "Music";
        }


    public void addReview(Review review) {
        reviews.add(review);
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public String toString() {
        return "Music{" +
                "title='" + getTitle() + '\'' +
                ", auteur='" + getAuteur() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                ", artist='" + artist + '\'' +
                '}';
    }
}
