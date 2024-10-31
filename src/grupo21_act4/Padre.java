package grupo21_act4;

public class Padre {
    private final String nombre = "Papá";
    protected String apellido = "López";
    protected Auto auto;
    protected Casa casa;

    public Padre(Auto auto, Casa casa, String apellido) {
        this.auto = auto;
        this.construirCasa(casa);
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public Auto getAuto() {
        return auto;
    }
    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    public Casa getCasa() {
        return casa;
    }
    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    
    public void cantar() {
        System.out.println("- Así canta tu padre, Don " + apellido + "...");
    }
    
    public void comprarAuto(Auto auto) {
        this.auto = auto;
    }

    public final void construirCasa(Casa casa) {
        this.casa = new Casa(casa.getZona(), casa.getPisos());
    }
}
