package com.test;

import com.spring.Controller;
import org.junit.Assert;
import org.junit.Test;

public class ControllerTest {
    Controller controller = new Controller();

    @Test
    public void getNumberOneTest() {
        Assert.assertEquals(1, controller.getNumberOne().getNumber());
    }

    @Test
    public void getNumberTwoTest() {
        Assert.assertEquals(2, controller.getNumberTwo().getNumber());
    }

    @Test
    public void getNumberThreeTest() {
        Assert.assertEquals(3, controller.getNumberThree().getNumber());
    }
}
