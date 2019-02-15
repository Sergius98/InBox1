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
    public void testCITY_PHONE_NUMBER_REG_EX_6() {
        assertFalse("380 67 678 90 123".matches(Constants.CITY_PHONE_NUMBER_REG_EX));
    }
    @Test
    public void testCITY_PHONE_NUMBER_REG_EX_7() {
        assertFalse("380 (67 678 90 12".matches(Constants.CITY_PHONE_NUMBER_REG_EX));
    }

    @Test
    public void testMOBILE_PHONE_NUMBER_2_REG_EX_1() {
        assertTrue("380 67 678 90 12".matches(Constants.MOBILE_PHONE_NUMBER_2_REG_EX));
    }
    @Test
    public void testMOBILE_PHONE_NUMBER_2_REG_EX_2() {
        assertTrue("".matches(Constants.MOBILE_PHONE_NUMBER_2_REG_EX));
    }

    @Test
    public void testEMAIL_REG_EX_1() {
        assertTrue("ab@ab.ab".matches(Constants.EMAIL_REG_EX));
    }
    @Test
    public void testEMAIL_REG_EX_2() {
        assertTrue("a.b@abc.sd.fg.ab".matches(Constants.EMAIL_REG_EX));
    }
    @Test
    public void testEMAIL_REG_EX_3() {
        assertTrue("a_b.12.fggh@111.ab".matches(Constants.EMAIL_REG_EX));
    }
    @Test
    public void testEMAIL_REG_EX_4() {
        assertFalse("a_b.12.fggh@ab.11".matches(Constants.EMAIL_REG_EX));
    }
    @Test
    public void testEMAIL_REG_EX_5() {
        assertFalse("a-b-12.fggh@ab.com".matches(Constants.EMAIL_REG_EX));
    }

    @Test
    public void testSKYPE_REG_EX_1() {
        assertFalse("ab@ab.ab".matches(Constants.SKYPE_REG_EX));
    }
    @Test
    public void testSKYPE_REG_EX_2() {
        assertFalse("1abcdhkl".matches(Constants.SKYPE_REG_EX));
    }
    @Test
    public void testSKYPE_REG_EX_3() {
        assertFalse("abc".matches(Constants.SKYPE_REG_EX));
    }
    @Test
    public void testSKYPE_REG_EX_4() {
        assertFalse("a12345678901234567890123456789012345".matches(Constants.SKYPE_REG_EX));
    }
    @Test
    public void testSKYPE_REG_EX_5() {
        assertTrue("abcd37879".matches(Constants.SKYPE_REG_EX));
    }
    @Test
    public void testSKYPE_REG_EX_6() {
        assertTrue("ABCcd37879".matches(Constants.SKYPE_REG_EX));
    }
    @Test
    public void testSKYPE_REG_EX_7() {
        assertTrue("a234bcd79".matches(Constants.SKYPE_REG_EX));
    }
}