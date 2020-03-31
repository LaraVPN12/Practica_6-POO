
package Ejercicio2;

public class Pago {
    protected String Propietario;
    protected double Monto;

    public Pago(String Propietario, double Monto) {
        this.Propietario = Propietario;
        this.Monto = Monto;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }
    public void Pagar(){
        System.out.println("Registro de Pago");
        System.out.println("Propietario: "+this.Propietario+"\nMonto: "+this.Monto);
    }
}
