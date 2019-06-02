package customizedTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by zhengjun
 * Date: 2019/6/1
 * Mail:zhengjun1987@outlook.com
 */
public class SimpleTagTest4 extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        String[] strings = {"Monsoon Wedding", "Saved!", "Fahrenheit 9/11"};
        for (String string : strings) {
            getJspContext().setAttribute("movie", string);
            getJspBody().invoke(null);
        }
    }
}
