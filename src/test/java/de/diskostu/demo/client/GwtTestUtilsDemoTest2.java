package de.diskostu.demo.client;

import com.google.gwt.user.client.ui.Label;
import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTest;
import com.googlecode.gwt.test.assertions.GwtAssertions;
import org.junit.Test;

@GwtModule("de.diskostu.demo.GwtTestUtilsDemo")
public class GwtTestUtilsDemoTest2 extends GwtTest {

    @Test
    public void testDemo2() {
        final String labeltext = "DemoText";
        final Label lala = new Label(labeltext);
        GwtAssertions.assertThat(lala).textEquals(labeltext);
    }
}