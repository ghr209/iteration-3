package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataValidatorTest {

    @Test
    void isValidCPRTest1() {
        DataValidator dataValidator = new DataValidator();
        String cprNumber = "126310-abcR";
        Boolean actualResult = dataValidator.isValidCPR(cprNumber);
        System.out.println("Test1");
        assertEquals(false,actualResult, "CPR-number must not contain letters");
    }

    @Test
    void isValidCPRTest2() {
        DataValidator dataValidator = new DataValidator();
        String cprNumber = "1234567890";
        Boolean actualResult = dataValidator.isValidCPR(cprNumber);
        System.out.println("Test2");
        assertEquals(false,actualResult, "CPR-number must not contain less than 10 numbers");
    }

    @Test
    void isValidCPRTest3() {
        DataValidator dataValidator = new DataValidator();
        String cprNumber = "123456-7890";
        Boolean actualResult = dataValidator.isValidCPR(cprNumber);
        System.out.println("Test3");
        assertEquals(true,actualResult, "Ok..");
    }

    @Test
    void isValidFirstNameTest1() {
        DataValidator dataValidator = new DataValidator();
        String letterName = "12345677890";
        Boolean actualResult = dataValidator.isValidFirstName(letterName);
        System.out.println("Test1");
        assertEquals(false,actualResult, "Name must not contain numbers");
    }

    @Test
    void isValidForNameTest2() {
        DataValidator dataValidator = new DataValidator();
        String letterName = "1234abcd";
        Boolean actualResult = dataValidator.isValidFirstName(letterName);
        System.out.println("Test2");
        assertEquals(false,actualResult, "Name must not contain numbers and letters");
    }

    @Test
    void isValidForNameTest3() {
        DataValidator dataValidator = new DataValidator();
        String letterName = "Helin";
        Boolean actualResult = dataValidator.isValidFirstName(letterName);
        System.out.println("Test3");
        assertEquals(true,actualResult, "Ok...");
    }

    @Test
    void isValidLastNameTest1() {
        DataValidator dataValidator = new DataValidator();
        String letteName = "12345677890";
        Boolean actualResult = dataValidator.isValidLastName(letteName);
        System.out.println("Test1");
        assertEquals(false,actualResult, "Name must not contain numbers");
    }

    @Test
    void isValidLastNameTest2() {
        DataValidator dataValidator = new DataValidator();
        String letteName = "1234abcd";
        Boolean actualResult = dataValidator.isValidLastName(letteName);
        System.out.println("Test2");
        assertEquals(false,actualResult, "Name must not contain numbers and letters");
    }

    @Test
    void isValidLastNameTest3() {
        DataValidator dataValidator = new DataValidator();
        String letteName = "Helin";
        Boolean actualResult = dataValidator.isValidLastName(letteName);
        System.out.println("Test3");
        assertEquals(true,actualResult, "Ok...");
    }

    @Test
    void isValidNumberTest1() {
        DataValidator dataValidator = new DataValidator();
        String numberNumber = "12";
        Boolean actualResult = dataValidator.isValidNumber(numberNumber);
        System.out.println("Test1");
        assertEquals(false,actualResult, "Wrong format!");
    }

    @Test
    void isValidNumberTest2() {
        DataValidator dataValidator = new DataValidator();
        String numberNumber = "hejmeddig";
        Boolean actualResult = dataValidator.isValidNumber(numberNumber);
        System.out.println("Test2");
        assertEquals(false,actualResult, "Only numbers!");
    }

    @Test
    void isValidNumberTest3() {
        DataValidator dataValidator = new DataValidator();
        String numberNumber = "12345678";
        Boolean actualResult = dataValidator.isValidNumber(numberNumber);
        System.out.println("Test3");
        assertEquals(true,actualResult, "Ok...");
    }

    @Test
    void isValidEmailTest1() {
        DataValidator dataValidator = new DataValidator();
        String email = "hej.dk";
        Boolean actualResult = dataValidator.isValidEmail(email);
        System.out.println("Test1");
        assertEquals(false,actualResult, "Wrong format. It must contain snabela");
    }

    @Test
    void isValidEmailTest2() {
        DataValidator dataValidator = new DataValidator();
        String email = "hej@";
        Boolean actualResult = dataValidator.isValidEmail(email);
        System.out.println("Test2");
        assertEquals(false,actualResult, "Short length");
    }
    @Test
    void isValidEmailTest3() {
        DataValidator dataValidator = new DataValidator();
        String email = "hejmeddig@hotmail.com";
        Boolean actualResult = dataValidator.isValidEmail(email);
        System.out.println("Test3");
        assertEquals(true,actualResult, "Ok...");
    }

    @Test
    void isValidBlodtrykTest1() {
        DataValidator dataValidator = new DataValidator();
        String Blodtryk = "ab/60";
        Boolean actualResult = dataValidator.isValidBlodtryk(Blodtryk);
        System.out.println("Test1");
        assertEquals(false,actualResult, "Blodtryk does nok contain letters");
    }
    @Test
    void isValidBlodtrykTest2() {
        DataValidator dataValidator = new DataValidator();
        String Blodtryk = "12060";
        Boolean actualResult = dataValidator.isValidBlodtryk(Blodtryk);
        System.out.println("Test2");
        assertEquals(false,actualResult, "Missing slash");
    }
    @Test
    void isValidBlodtrykTest3() {
        DataValidator dataValidator = new DataValidator();
        String Blodtryk = "120/60";
        Boolean actualResult = dataValidator.isValidBlodtryk(Blodtryk);
        System.out.println("Test3");
        assertEquals(true,actualResult, "Ok.....");
    }

    @Test
    void isValidHartBeatTest1() {
        DataValidator dataValidator = new DataValidator();
        String HartBeat = "hm";
        Boolean actualResult = dataValidator.isValidHartBeat(HartBeat);
        System.out.println("Test1");
        assertEquals(false,actualResult, "HartBeat is a number");
    }
    @Test
    void isValidHartBeatTest2() {
        DataValidator dataValidator = new DataValidator();
        String HartBeat = "7875";
        Boolean actualResult = dataValidator.isValidHartBeat(HartBeat);
        System.out.println("Test2");
        assertEquals(false,actualResult, "HartBeat is too long");
    }
    @Test
    void isValidHartBeatTest3() {
        DataValidator dataValidator = new DataValidator();
        String HartBeat = "67";
        Boolean actualResult = dataValidator.isValidHartBeat(HartBeat);
        System.out.println("Test1");
        assertEquals(true,actualResult, "Ok....");
    }

    @Test
    void isValidTemperaturTest1() {
        DataValidator dataValidator = new DataValidator();
        String Temperatur = "HH";
        Boolean actualResult = dataValidator.isValidTemperatur(Temperatur);
        System.out.println("Test1");
        assertEquals(false,actualResult, "Temperatur is does nor contain letters");
    }
    @Test
    void isValidTemperaturTest2() {
        DataValidator dataValidator = new DataValidator();
        String Temperatur = "455";
        Boolean actualResult = dataValidator.isValidTemperatur(Temperatur);
        System.out.println("Test2");
        assertEquals(false,actualResult, "Temperatur is too long");
    }
    @Test
    void isValidTemperaturTest3() {
        DataValidator dataValidator = new DataValidator();
        String Temperatur = "38";
        Boolean actualResult = dataValidator.isValidTemperatur(Temperatur);
        System.out.println("Test3");
        assertEquals(true,actualResult, "Ok...");
    }

    @Test
    void isValidpostalCodeTest1() {
        DataValidator dataValidator = new DataValidator();
        String postalCode = "hhmf";
        Boolean actualResult = dataValidator.isValidpostalCode(postalCode);
        System.out.println("Test1");
        assertEquals(false,actualResult, "location is a number");
    }
    @Test
    void isValidpostalCodeTest2() {
        DataValidator dataValidator = new DataValidator();
        String postalCode  = "22000";
        Boolean actualResult = dataValidator.isValidpostalCode(postalCode);
        System.out.println("Test2");
        assertEquals(false,actualResult, "location is too long");
    }
    @Test
    void isValidpostalCodeTest3() {
        DataValidator dataValidator = new DataValidator();
        String postalCode= "2100";
        Boolean actualResult = dataValidator.isValidpostalCode(postalCode);
        System.out.println("Test3");
        assertEquals(true,actualResult, "Ok..");

}

    @Test
    void isValidTestIDTest1() {
        DataValidator dataValidator = new DataValidator();
        String TestID = "21050";
        Boolean actualResult = dataValidator.isValidTestID(TestID);
        System.out.println("Test1");
        assertEquals(false,actualResult, "too long");
    }
    @Test
    void isValidTestIDTest2() {
        DataValidator dataValidator = new DataValidator();
        String TestID = "21050";
        Boolean actualResult = dataValidator.isValidTestID(TestID);
        System.out.println("Test2");
        assertEquals(false,actualResult, " has to be numbers");
    }
    @Test
    void isValidTestIDTest3() {
        DataValidator dataValidator = new DataValidator();
        String TestID = "210";
        Boolean actualResult = dataValidator.isValidTestID(TestID);
        System.out.println("Test2");
        assertEquals(true,actualResult, "Ok...");
    }
}