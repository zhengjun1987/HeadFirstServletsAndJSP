package customizedTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by zhengjun
 * Date: 2019/6/1
 * Mail:zhengjun1987@outlook.com
 */
public class SimpleTagTest2 extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
//        这个调用方法意味着直接将tag的body-content输出到out
        getJspBody().invoke(null);
    }
}
