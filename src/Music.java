public class Music extends Media {
private String artist;

    public Music(String title,String auteur,String ISBN,double price,String mediaType){
        super(title,auteur,ISBN,price,mediaType);
        this.artist=artist;
    }

    public void listen(User user){
//  listen to music

    }


    public String getMediaType(){
        if (getPrice()>=10){
            return "premium Music";
        }else  return "Music";

    }

    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                '}';
    }
}
