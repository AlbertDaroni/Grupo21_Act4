package grupo21_act4;

public class Auto {
    private double combustible = 50;
    private String modelo;
    private String patente;
    private String color;

    public Auto(String modelo, String patente, String color) {
        this.modelo = modelo;
        this.patente = patente;
        this.color = color;
    }

    public double getCombustible() {
        return combustible;
    }
    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}