
package Ejercicio1;

public class Empleado_Horas extends Empleado{
    protected int Horas;
    
    public Empleado_Horas(String Nombre, double Salario, int Horas){
        super(Nombre, Salario);
        this.Horas=Horas;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }
    @Override
    public void MetododeClase(){
        System.out.println("Método de Clase Epleado por Horas");
    }
    @Override
    public void MetododeInstancia(){
        System.out.println("Método de Instancia Empleado por Hora");
        System.out.println("Nombre: "+this.Nombre+"\nSalario: "+this.Salario+"\nCantidad de Horas: "+this.Horas);
    }
}
