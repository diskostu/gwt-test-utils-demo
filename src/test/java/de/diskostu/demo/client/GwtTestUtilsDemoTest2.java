package de.diskostu.demo.client;

import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTest;
import org.junit.Assert;
import org.junit.Test;

@GwtModule("de.diskostu.demo.GwtTestUtilsDemo")
public class GwtTestUtilsDemoTest2 extends GwtTest {

    @Test
    public void testDemo1() {
        Assert.assertEquals(1, 1);
    }
}