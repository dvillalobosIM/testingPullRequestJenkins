package com.test;

import com.spring.Application;
import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
    Application application = new Application();

    @Test
    public void testMain() {
        try {
            application.main(new String[]{});
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }
}
