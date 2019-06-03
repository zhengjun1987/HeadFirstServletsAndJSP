package customizedTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class ClassicTag2 extends TagSupport {

    private JspWriter out;

    @Override
    public int doStartTag() throws JspException {
        System.out.println("ClassicTag2.doStartTag");
        out = pageContext.getOut();
        try {
            out.println("Classic tag output<br>");
        } catch (IOException e) {
            e.printStackTrace();
            throw new JspException("IOException-"+e.toString());
        }
        return SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        System.out.println("ClassicTag2.doEndTag");
        try {
            out.println("<strong>ClassicTag2.doEndTag</strong>");
        } catch (IOException e) {
            e.printStackTrace();
            throw new JspException("IOException-"+e.toString());
        }
        return EVAL_PAGE;
    }
}
