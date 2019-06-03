package customizedTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class ClassicTag3 extends TagSupport {

    private JspWriter out;

    @Override
    public int doStartTag() throws JspException {
        System.out.println("ClassicTag3.doStartTag");
        out = pageContext.getOut();
        try {
            out.println("Classic tag output<br>");
        } catch (IOException e) {
            e.printStackTrace();
            throw new JspException("IOException-" + e.toString());
        }
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doAfterBody() throws JspException {
        BodyContent bodyContent = pageContext.pushBody();
        String string = bodyContent.getString();
        System.out.println("bodyContent = " + string);
        try {
            out.println("<br>");
        } catch (IOException e) {
            e.printStackTrace();
            throw new JspException("IOException-" + e.toString());
        }
        return SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        System.out.println("ClassicTag3.doEndTag");
        try {
            out.println("<strong>ClassicTag3.doEndTag</strong>");
        } catch (IOException e) {
            e.printStackTrace();
            throw new JspException("IOException-" + e.toString());
        }
        return EVAL_PAGE;
    }
}
