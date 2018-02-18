package de.diskostu.demo.client;

import com.google.gwt.user.client.ui.Label;
import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTest;
import com.googlecode.gwt.test.assertions.GwtAssertions;
import org.junit.Assert;
import org.junit.Test;

@GwtModule("de.diskostu.demo.GwtTestUtilsDemo")
public class GwtTestUtilsDemoTest2 extends GwtTest {

    @Test
    public void testDemo1() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void testDemo2() {
        Label lala = new Label("lala");
        GwtAssertions.assertThat(lala).textEquals("lala");
    }
}