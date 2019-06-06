package customizedTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.List;

public class SelectTagHandler extends SimpleTagSupport {
    private static final String ATTR_TEMPLATE = "%s='%s'";
    private List optionList;
    private int size;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setOptionList(List optionList) {
        this.optionList = optionList;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void doTag() throws JspException, IOException {
        MyUtils.println("optionList = " + optionList);
        MyUtils.println("size = " + size);
        JspWriter jspWriter = getJspContext().getOut();
        String s = "<select " + String.format(ATTR_TEMPLATE, "name", name) + " " + String.format(ATTR_TEMPLATE, "size", size)+">";
        jspWriter.println(s);
        for (int i = 0; i < size; i++) {
            String option = (String) optionList.get(i);
            String content = "<option value=\'" + option + "\'> " + option + " </option>";
            jspWriter.println(content);
        }
        jspWriter.println(" </select>");
    }
}
