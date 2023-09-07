package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTests {
    @Test
    public void testRectangle(){
        Rectangle test = new Rectangle(100, 100);
        assert test.rect() == 10000;
    }
}
