package grupo21_act4;

public class Hijo extends Padre implements Madre, Tio, Hermano {
    private int billetera;
    private final String nombre;
    private final Celular celular;

    public Hijo(String nombre, String apellido, Celular celular, Auto auto, Casa casa) {
        super(auto, casa, apellido);
        this.nombre = nombre;
        this.celular = celular;
    }

    public int getBilletera() {
        return billetera;
    }
    public void setBilletera(int billetera) {
        this.billetera = billetera;
    }
    public String getNombre() {
        return nombre;
    }
    public Celular getCelular() {
        return celular;
    }

    @Override
    public void bailar() {
        System.out.println("Sé bailar como mi madre ♪♫♪");
    }

    @Override
    public void cantar() {
        super.cantar();
        System.out.println("- Y así canta " + nombre + '.');
    }
    public void conducirAuto(Auto auto) {
        System.out.println("Conduciendo un " + auto.getModelo() + " de un amigo.");
    }

    @Override
    public int hacerGoles() {
        return (int)(Math.random() * 10);
    }

    @Override
    public void heredarDinero(double dinero) {
        billetera += dinero;
        System.out.println("Tío Lucas te regala estos dolaritos! ¡Ahora tenés USD " + billetera + '!');
    }

    @Override
    public void jugarFutbol() {
        System.out.println("Sé jugar fútbol gracias a mi hermano.");
    }

    @Override
    public int jugarLoteria() {
        billetera += FORTUNA;
        System.out.println("¡¡Heredaste la fortuna de USD " + FORTUNA + " de tu madre la ROSA!! ¡¡¡Ahora tenés USD 50000!!!");
        return NROSUERTE;
    }
}