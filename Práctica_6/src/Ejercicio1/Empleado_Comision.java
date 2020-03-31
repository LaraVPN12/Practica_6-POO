
package Ejercicio1;

public class Empleado_Comision extends Empleado{
    protected int Horas;
    protected double Porcentaje;
    
    public Empleado_Comision(String Nombre, double Salario, int Horas, double Porcentaje){
        super(Nombre, Salario);
        this.Horas=Horas;
        this.Porcentaje=Porcentaje;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public double getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(double Porcentaje) {
        this.Porcentaje = Porcentaje;
    }
    @Override
    public void MetododeClase(){
        System.out.println("Método de Clase de Empleado por Comosión");
    }
    @Override
    public void MetododeInstancia(){
        System.out.println("Método de Instancia de Empleado por Comisión");
        System.out.println("Nombre: "+this.Nombre+"\nSalario: "+this.Salario+"\nHoras de Trabajo: "+this.Horas+"\nPorcentaje: "+this.Porcentaje);
    }
}
