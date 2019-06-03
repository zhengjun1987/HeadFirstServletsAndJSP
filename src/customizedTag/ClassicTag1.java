package customizedTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class ClassicTag1 extends TagSupport {

    private JspWriter out;

    @Override
    public int doStartTag() throws JspException {
        System.out.println("ClassicTag1.doStartTag");
        out = pageContext.getOut();
        try {
            out.println("Classic tag output");
        } catch (IOException e) {
            e.printStackTrace();
            throw new JspException("IOException-"+e.toString());
        }
        return SKIP_BODY;
    }
}
