package beerV1;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Created by zhengjun
 * Date: 2019/5/2
 * Mail:zhengjun1987@outlook.com
 */
public class BeerAttributListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        System.out.println("BeerAttributListener.attributeAdded  " + name + " => " + value);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        System.out.println("BeerAttributListener.attributeRemoved  " + name + " => " + value);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        System.out.println("BeerAttributListener.attributeReplaced  " + name + " => " + value);
    }
}
