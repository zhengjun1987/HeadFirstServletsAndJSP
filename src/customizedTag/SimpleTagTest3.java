package customizedTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by zhengjun
 * Date: 2019/6/1
 * Mail:zhengjun1987@outlook.com
 */
public class SimpleTagTest3 extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().setAttribute("message","Wear sunscreen");
        getJspBody().invoke(null);
    }
}
