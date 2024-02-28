public class Novel extends Book{
    private String genre;

    public Novel(String title, String autuer, String ISBN, double price, int stock, Review[] reviews,String genre) {
        super(title, autuer, ISBN, price, stock, reviews);
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String getMediaType() {
        if (getAverageRating() >= 4.5) {
            return "Bestselling Novel";
        } else {
            return "Novel";
        }
    }

    public double getAverageRating() {
        return 0;
    }

    // Override toString method to include the genre of the novel
    @Override
    public String toString() {
        return super.toString() + "\nGenre: " + genre;
    }
}