package de.diskostu.demo;

import de.diskostu.demo.client.GwtTestUtilsDemoTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class GwtTestUtilsDemoSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for GwtTestUtilsDemo");
    suite.addTestSuite(GwtTestUtilsDemoTest.class);
    return suite;
  }
}
