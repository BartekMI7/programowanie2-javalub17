

package day1.plytaCD;

public class Utwor {
    private String title;
    private String author;
    private double time;

    public Utwor(String title, String author, double time) {
        this.title = title;
        this.author = author;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getTime() {
        return time;
    }


    public String toString() {
        return title + " " + author + " " + time;
    }

}
