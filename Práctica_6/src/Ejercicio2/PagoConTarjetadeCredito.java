
package Ejercicio2;

public class PagoConTarjetadeCredito extends Pago{
    protected String NumeroTarjeta;
    
    public PagoConTarjetadeCredito(String Propietario, double Monto, String Numero){
        super(Propietario, Monto);
        this.NumeroTarjeta=Numero;
    }

    public String getNumeroTarjeta() {
        return NumeroTarjeta;
    }

    public void setNumeroTarjeta(String NumeroTarjeta) {
        this.NumeroTarjeta = NumeroTarjeta;
    }
    @Override
    public void Pagar(){
        System.out.println("Pago con Tarjeta de Crédito");
        System.out.println("Propietario: "+this.Propietario+"\nMonto: "+this.Monto+"\nNúmero de Tarjeta: "+this.NumeroTarjeta);
    }
}
