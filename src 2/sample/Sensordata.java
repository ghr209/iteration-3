package sample;

public class Sensordata {
    private String Temperatur;
    private String Hartbeat; // puls
    private String Blodtryk;

    public void SensorData(String Temperatur, String Hartbeat, String Blodtryk ) {

        this.Temperatur = Temperatur;
        this.Hartbeat = Hartbeat;
        this.Blodtryk= Blodtryk;
    }
    public String getTemperatur() {
        return Temperatur;
    }
    public void setTemperatur(String Temperatur) {
        this.Temperatur = Temperatur;
    }

    public String getHartbeat() {
        return Hartbeat;
    }
    public void setHartbeat(String Hartbeat) { this.Hartbeat = Hartbeat; }

    public String getBlodtryk() {
        return Blodtryk;
    }
    public void setBlodtryk(String Blodtryk) { this.Blodtryk = Blodtryk; }

    @Override
    public String toString(){
        return "SensorData{" +
                ", Temperatur='" + Temperatur + '\'' +"°C"+
                ", Hartbeat='" + Hartbeat + '\''+ "slag i minuttet"+
                ", Blodtryk='" + Blodtryk + '\'' +"mm Hg"+
                '}';
    }
}
