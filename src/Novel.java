public class Novel extends Book{
    private String genre;

    public Novel(String title, String autuer, String ISBN, double price, int stock, String genre) {
        super(title, autuer, ISBN, price, stock);
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
         if(isBestseller() ){
            return "Bestselling Novel";
        }else  return  "Novel";
    }


    // Override toString method to include the genre of the novel
    @Override
    public String toString(){
     return "Novel{" +
             "title='" + getTitle() + '\'' +
            ", auteur='" + getAuteur() + '\'' +
            ", ISBN='" + getISBN() + '\'' +
            ", price=" + getPrice() +
            ", quantityInStock=" + getStock() +
            ", reviews=" + super.toString() +
            ", genre='" + genre + '\'' +
            '}';
}
}