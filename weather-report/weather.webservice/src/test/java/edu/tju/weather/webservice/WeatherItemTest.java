package edu.tju.weather.webservice;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: reyoung
 * Date: 12-10-17
 * Time: 上午11:07
 * EMail: reyoung@126.com
 * Blog: www.reyoung.me
 */
public class WeatherItemTest extends TestCase {
    public void testHighTemperature(){
        WeatherItem item = new WeatherItem();
        item.setHighTemperature(10);
        Assert.assertEquals(10,item.getHighTemperature());
    }
}
