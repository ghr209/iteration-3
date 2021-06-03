package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.sql.*;
import java.util.ArrayList;

public class TestDataController {
    //public GridPane grid;
    public Label empNumberLabel;
    public TextField empNumberText;
    public Label labelFirstName;
    public TextField firstNameText;
    public Label labelLastName;
    public TextField lastNameText;
    public Label LabelpostalCode;
    public TextField postalCodeText;
    public TextArea IncidentListTextArea;
    public TextArea InfectionlistTextArea;
    public Button Seach;
    public Button buttonClearAll;

    @FXML
    private GridPane grid;

    private void clearTextFields(GridPane grid) {
        // Simple method to clear the text fields in a grid
        for (Node node : grid.getChildren()) {
            if (node instanceof TextField ) {
                // clear
                ((TextField)node).setText("");
                node.setStyle(null);
            } else if (node instanceof TextArea) {
                ((TextArea) node).setText("");
                node.setStyle(null);
            }
        }
    }

    private void resetTextFields(GridPane grid) {
        // Simple method to reset the style on text fields in a grid which have a style set
        // and don't touch the other fields
        // We use it to clear the fields we turned yellow
        for (Node node : grid.getChildren()) {
            if (node instanceof TextField) {
                System.out.println(node.getStyle());
                // clear
                if (node.getStyle() != null && !node.getStyle().equals("")) {
                    ((TextField) node).setText("");
                    node.setStyle(null);
                }
            }
        }
    }
    public static String capitalize(String str) {
        // Method to make names appear with capital first letter
        // also turn uppercase letters not in first position into lowercase
        // sorry McDonald!
        if(str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }


    public void onAdd (ActionEvent actionEvent) {

        String firstNameInput= capitalize(firstNameText.getText());
        String lastNameInput= capitalize(lastNameText.getText());
        String empNumberInput = capitalize(empNumberText.getText());
        String postalCodeInput = capitalize(postalCodeText.getText());
        boolean validInput= true;

        // validate the user input


        if (firstNameInput.isEmpty() || ! DataValidator.isValidFirstName(firstNameInput)){
            // We need a valid first name
            firstNameText.setStyle("-fx-background-color: yellow");
            validInput = false;
        }

        if (lastNameInput.isEmpty() || ! DataValidator.isValidLastName(lastNameInput)){
            // We need a valid last name
            lastNameText.setStyle("-fx-background-color: yellow");
            validInput = false;
        }

        if (empNumberInput.isEmpty()){
            // We need a valid last employee number
            empNumberText.setStyle("-fx-background-color: yellow");
            validInput = false;
        }
        if (postalCodeInput.isEmpty()){
            // We need a valid postalcode
            postalCodeText.setStyle("-fx-background-color: yellow");
            validInput = false;
        }

        // Now register the employee
        // not finished!


    }
    public void initialize() {
        String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
        String password = "Elkhattouti92";

        String query = "SELECT PatientLokation, Count(*) as 'Number of incidents' FROM Corona.test WHERE TestResult= 'Positive' Group by PatientLokation order by count(*) desc;";

        try (Connection con = DriverManager.getConnection(url, null, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            ArrayList<TestData> testdata = new ArrayList<>();
            while (rs.next()) {
                String Lokation = rs.getString(1);
                String NumberOfIn = rs.getString(2);
                System.out.println("Postnummer: " + Lokation + " Antal positive: " + NumberOfIn);
                TestData td = new TestData(NumberOfIn, "","","","", Lokation);
                testdata.add(td);

                //String TestResult = rs.getString(2);
                //String TestMutation = rs.getString(3);
                //int PatientLokation= rs.getInt(6);
                //int PatientID= rs.getInt(7);
                // System.out.println("TestID: " + TestID + " | TestResult: " + TestResult + " | TestMutation: " + TestMutation + "| Lokation " + PatientLokation +"| PatientID " + PatientID );
            }
            for (TestData t : testdata) {
                String oldText = IncidentListTextArea.getText();
                String newText = "Postnummer: " + t.getpostalCode() + " Antal positive: "  + t.getTestSvar();
                IncidentListTextArea.setText(oldText + "\n" + newText);
            }


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void onClearAll(ActionEvent actionEvent) {
        clearTextFields(grid);
    }


}
