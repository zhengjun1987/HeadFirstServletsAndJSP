package customizedTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.List;

/**
 * Created by zhengjun
 * Date: 2019/6/2
 * Mail:zhengjun1987@outlook.com
 */
public class SimpleTagTest5 extends SimpleTagSupport {
    private List<Movie> movies;

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public void doTag() throws JspException, IOException {
        if (movies == null || movies.isEmpty()) {
            return;
        }
        for (Movie movie : movies) {
            getJspContext().setAttribute("movie",movie);
            getJspBody().invoke(null);
        }
    }
}
