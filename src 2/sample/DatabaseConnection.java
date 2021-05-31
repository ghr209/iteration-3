package sample;
import java.sql.*;

public class DatabaseConnection {

    public static void DB(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
        String password = "Elkhattouti92";

        String query = "SELECT PatientLokation, Count(*) as 'Number of incidents' FROM Corona.test WHERE TestResult= 'Positive' Group by PatientLokation order by count(*) desc;";

        try (Connection con = DriverManager.getConnection(url, null, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                String Lokation = rs.getString(1);
                String NumberOfIn = rs.getString(2);
                System.out.println("Postnummer: " + Lokation + " Antal positive: " + NumberOfIn);

                //String TestResult = rs.getString(2);
                //String TestMutation = rs.getString(3);
                //int PatientLokation= rs.getInt(6);
                //int PatientID= rs.getInt(7);
                // System.out.println("TestID: " + TestID + " | TestResult: " + TestResult + " | TestMutation: " + TestMutation + "| Lokation " + PatientLokation +"| PatientID " + PatientID );
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}






// SELECT PatientLokation, Count(*) as 'Number of incidents' FROM Corona.test
//WHERE TestResult= 'Positive'
//Group by PatientLokation
//order by count(*) desc;

