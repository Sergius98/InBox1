package ua.training.task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegExConstantsTest {
    @Test
    public void testCITY_PHONE_NUMBER_REG_EX_1() {
        assertTrue("+123 45 678 90 12".matches(Constants.CITY_PHONE_NUMBER_REG_EX));
    }
    @Test
    public void testCITY_PHONE_NUMBER_REG_EX_2() {
        assertTrue("+380 (67) 678 90 12".matches(Constants.CITY_PHONE_NUMBER_REG_EX));
    }
    @Test
    public void testCITY_PHONE_NUMBER_REG_EX_3() {
        assertTrue("+380(67)6789012".matches(Constants.CITY_PHONE_NUMBER_REG_EX));
    }
    @Test
    public void testCITY_PHONE_NUMBER_REG_EX_4() {
        assertTrue("380676789012".matches(Constants.CITY_PHONE_NUMBER_REG_EX));
    }
    @Test
    public void testCITY_PHONE_NUMBER_REG_EX_5() {
        assertTrue("380 67 678 90 12".matches(Constants.CITY_PHONE_NUMBER_REG_EX));
    }
    @Test
    public void testMOBILE_PHONE_NUMBER_2_REG_EX_1() {
        assertTrue("380 67 678 90 12".matches(Constants.MOBILE_PHONE_NUMBER_2_REG_EX));
    }
    @Test
    public void testMOBILE_PHONE_NUMBER_2_REG_EX_2() {
        assertTrue("".matches(Constants.MOBILE_PHONE_NUMBER_2_REG_EX));
    }
}