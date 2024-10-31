package grupo21_act4;

public class Grupo21_Act4 {
    public static void main(String[] args) {
        Auto cascajo = new Auto("Renault 12", "123 LATA", "Gris oscuro");
        Auto autoFord = new Auto("Ford Focus", "999 POWR", "Gris claro");
        Celular celular = new Celular("Samsung", "+54 000 123-4567", 15000);
        
        Padre papa = new Padre(autoFord, new Casa("Centro", 2), "López");
        System.out.println("Papá me dejó esta casa en zona " + papa.getCasa().getZona() + '.');
        
        Hijo hijo = new Hijo("Juan Carlos", papa.getApellido(), celular, cascajo, papa.getCasa());
        System.out.println("Papá me dejó este auto modelo: " + hijo.getAuto().getModelo() + '.');
        hijo.conducirAuto(autoFord);
        hijo.jugarFutbol();
        hijo.bailar();
        System.out.println("¡SALIÓ EL NÚMERO DE LA SUERTE " + hijo.jugarLoteria() + "!");
        hijo.cantar();
        hijo.heredarDinero(1200);
        System.out.println("Jugando al fútbol. Hoy hiciste " + hijo.hacerGoles() + " goles.");
    }
}