public class Movie extends Media{
    private int duration;
    public Movie(String title, String auteur, String ISBN, double price,int duration,String mediaType) {
        super(title, auteur, ISBN, price,mediaType);
        this.duration=duration;
    }

    public int getDuration() {
        return duration;
    }


    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void watch(User user) {
        user.addToPurchasedMediaList(this);
    }


    @Override
    public String getMediaType() {
        String superMediaType=super.getMediaType();
        if (duration>=120 ){return "Long Movie";}else return "Movie";

    }

    @Override
    public String toString() {
        return super.toString() + "\nDuration: " + duration + " minutes";

    }

}
