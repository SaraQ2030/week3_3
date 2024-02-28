public class AcademicBook extends Book {
    private String subject;

    public AcademicBook(String title, String autuer, String ISBN, double price, int stock, Review[] reviews) {
        super(title, autuer, ISBN, price, stock, reviews);
        this.subject = subject;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        if (getAverageRating() >= 4.5) {
            return "Bestselling AcademicBook";
        } else {
            return "AcademicBook";
        }
    }



    @Override
    public String toString() {
        return super.toString() + "\nSubject: " + subject;
    }
//    private double getAverageRating() {
//
//    }
}