
package Ejercicio2;

public class PagoalContado extends Pago{
    protected int CantidadMeses;
    protected double Cuota;
    
    public PagoalContado(String Propietario, double Monto, int Cantidad, double Cuota){
        super(Propietario, Monto);
        this.CantidadMeses=Cantidad;
        this.Cuota=Cuota;
    }

    public int getCantidadMeses() {
        return CantidadMeses;
    }

    public void setCantidadMeses(int CantidadMeses) {
        this.CantidadMeses = CantidadMeses;
    }

    public double getCuota() {
        return Cuota;
    }

    public void setCuota(double Cuota) {
        this.Cuota = Cuota;
    }
    @Override
    public void Pagar(){
        System.out.println("Registro de Pago al Contado");
        System.out.println("Propietario: "+this.Propietario+"\nMonto: "+this.Monto+"\nCantidad de Meses: "+this.CantidadMeses+"\nCuota: "+this.Cuota);
    }
}
