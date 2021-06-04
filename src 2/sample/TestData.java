package sample;
//import jakarta.xml.bind.annotation.XmlRootElement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//@XmlRootElement
public class TestData {
    private String TestID;
    private String TestSvar;
    private String Mutation;
    private String TimeOfTest;
    private String TimeOfResult;
    private String postalCode;


    public TestData( String TestSvar, String Mutation, String TestID, String TimeOfTest, String TimeOfResult, String postalCode) {

        this.TestSvar = TestSvar;
        this.Mutation = Mutation;
        this.TestID= TestID;
        this.TimeOfTest= TimeOfTest;
        this.TimeOfResult= TimeOfResult;
        this.postalCode = postalCode;
    }
    public String getTestID() {
        return TestID;
    }
    public void setTestID(String TestID) {
        this.TestID = TestID;
    }

    public String getTestSvar() {
        return TestSvar;
    }
    public void setTestSvar(String TestSvar) {
        this.TestSvar = TestSvar;
    }

    public String getMutation() {
        return Mutation;
    }
    public void setMutation(String Mutation) {
        this.Mutation = Mutation;
    }

    public String getTimeOfTest() {
        return TimeOfTest;
    }
    public void setTimeOfTest(String TimeOfTest) {
        this.TimeOfTest = TimeOfTest;
    }

    public String getTimeOfResult() {
        return TimeOfResult;
    }
    public void setTimeOfResult(String TimeOfResult) {
        this.TimeOfResult = TimeOfResult;
    }

    public String getpostalCode() {
        return postalCode;
    }
    public void setpostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "TestData{" +
                ", TestID='" + TestID + '\'' +
                ", TestSvar='" + TestSvar + '\'' +
                ", Mutation='" + Mutation + '\'' +
                ", Time of test='" + TimeOfTest + '\'' +
                ", Time of result='" + TimeOfResult + '\'' +
                ", location='" + postalCode+ '\'' +
                '}';
    }
}
