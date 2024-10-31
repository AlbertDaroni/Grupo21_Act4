package grupo21_act4;

public class Celular {
    private String compañía;
    private String numero;
    private double saldo;

    public Celular(String compañía, String numero, double saldo) {
        this.compañía = compañía;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getCompañía() {
        return compañía;
    }
    public void setCompañía(String compañía) {
        this.compañía = compañía;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}