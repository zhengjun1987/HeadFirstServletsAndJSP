package customizedTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Random;

public class AdvisorTagHandler extends SimpleTagSupport {
    private String user;

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write("Hello, " + user + "<br>");
        getJspContext().getOut().write("Your advice is: " + getAdvice());
    }

    String getAdvice() {
        String[] strings = {"That color's not working for you", "You should call in sick.", "You might want to rethink that haircut."};
        return strings[new Random().nextInt(strings.length)];
    }
}
