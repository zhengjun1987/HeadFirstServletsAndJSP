package beerV1;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by zhengjun
 * Date: 2019/5/2
 * Mail:zhengjun1987@outlook.com
 */
public class BeerSessionCounter implements HttpSessionListener {
    private static int activeSessions;

    public static int getActiveSessions() {
        return activeSessions;
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        activeSessions++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        activeSessions--;
    }
}
