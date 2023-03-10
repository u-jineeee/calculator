package com.ll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolynomialTest {
    @Test
    public void getSplitInfo() {
        assertEquals(6, new Polynomial("3 + 3").calc());
    }

    @Test
    public void getSplitInfo_2(){assertEquals(15, new Polynomial("13 + 2").calc());}
    /*
    @Test
    public void getSplitInfo_3() {
        assertEquals(12, new Polynomial("3 * 3 + 3").calc());
    }

    @Test
    public void getSplitInfo_4() {
        assertEquals(18, new Polynomial("(3 + 3) * 3").calc());
    }
     */
}
