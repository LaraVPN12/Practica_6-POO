
package Ejercicio2;

public class Main {
    public static void main(String[] args){
        Pago pago1 = new Pago("Sofía", 400);
        PagoalContado pagoCont = new PagoalContado("Allison", 1200, 6, 300);
        PagoConTarjetadeCredito pagoTarjeta = new PagoConTarjetadeCredito("Pablo", 300, "09876543");
        pago1.Pagar();
        System.out.println("*****************************************");
        pago1=pagoCont;
        pago1.Pagar();
        System.out.println("*****************************************");
        pago1=pagoTarjeta;
        pago1.Pagar();
    }
}
