package streams;

public class Movie {


    private String title="";
    private int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }


    public void setLikes(int likes) {
        this.likes = likes;
    }






}
