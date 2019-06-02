package customizedTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by zhengjun
 * Date: 2019/6/2
 * Mail:zhengjun1987@outlook.com
 */
public class ErrorTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().print("Message within doTag()<br>");
        getJspContext().getOut().print("About to throw a SkipPageException");
        throw new SkipPageException();
    }
}
