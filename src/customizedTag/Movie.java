package customizedTag;

/**
 * Created by zhengjun
 * Date: 2019/6/2
 * Mail:zhengjun1987@outlook.com
 */
public class Movie {
    private String name;
    private String genre;

    public Movie() {
    }

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
