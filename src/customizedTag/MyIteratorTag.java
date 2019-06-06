package customizedTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class MyIteratorTag extends TagSupport {

    private String[] strings;
    private int index;

    @Override
    public int doStartTag() throws JspException {
        MyUtils.println("MyIteratorTag.doStartTag");
        strings = new String[]{"Spiderman", "Saved!", "Amelie"};
        index = 0;
        pageContext.setAttribute("movie",strings[index++]);
        MyUtils.println("pageContext.getAttribute(\"movie\") = " + pageContext.getAttribute("movie"));
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag() throws JspException {
        MyUtils.println("MyIteratorTag.doEndTag");
        return EVAL_PAGE;
    }

    @Override
    public int doAfterBody() throws JspException {
        MyUtils.println("MyIteratorTag.doAfterBody");
        try {
            BodyContent bodyContent = pageContext.pushBody();
            MyUtils.println("bodyContent.getString() = " + bodyContent.getString());
            pageContext.getOut().println(bodyContent.getString());
            pageContext.getOut().println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        pageContext.setAttribute("movie",strings[index++]);
        MyUtils.println("pageContext.getAttribute(\"movie\") = " + pageContext.getAttribute("movie"));
        return index < strings.length ? EVAL_BODY_AGAIN : SKIP_BODY;
    }
}
