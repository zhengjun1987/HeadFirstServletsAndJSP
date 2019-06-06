package customizedTag;

import java.text.SimpleDateFormat;

public class MyUtils {
    public static void println(String text) {
        String format = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss~SSS]").format(System.currentTimeMillis());
        Thread thread = Thread.currentThread();
        System.out.println(format + " #" + thread.getId() + "(" + thread.getName() + ")" + " *********** " + text);
    }
}
