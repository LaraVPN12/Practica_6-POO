
package Ejercicio1;

public class Main {
    public static void main(String[] args){
        Empleado empleado1 = new Empleado("Kevin", 300);
        EmpleadoAsalariado empleadoAs = new EmpleadoAsalariado("Luis", 250, "La constancia");
        Empleado_Horas empleadoHoras = new Empleado_Horas("Tania", 375, 8);
        Empleado_Comision empleadoCom = new Empleado_Comision("José", 600, 9, 3.5);
        empleado1.MetododeInstancia();
        System.out.println("*********************************");
        empleado1=empleadoAs;
        empleado1.MetododeInstancia();
        System.out.println("*********************************");
        empleado1=empleadoHoras;
        empleado1.MetododeInstancia();
        System.out.println("*********************************");
        empleado1=empleadoCom;
        empleado1.MetododeInstancia();
        
    }
}
