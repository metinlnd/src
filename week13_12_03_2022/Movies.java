package week13_12_03_2022;

public class Movies {


    public String title;
    public String director;
    public int year;
    public double rating;


    public static void gettitle() {

        System.out.println("title");
    }


    public static String getdirector(String director) {
        return director;
    }

    public Movies(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }


    public String toString() {
        return "Movies{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args) {

        Movies movies1 = new Movies("kacis", "jmeti", 2000, 18.2);
        System.out.println(movies1);


        Products product2= new Products("meit",252,5);


        System.out.println(product2);


    }
}