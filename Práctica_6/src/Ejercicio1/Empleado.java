
package Ejercicio1;

public class Empleado {
    protected String Nombre;
    protected double Salario;
    
    public Empleado(String Nombre, double Salario) {
        this.Nombre = Nombre;
        this.Salario = Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    public void MetododeClase(){
        System.out.println("Método de Clase de Empleado");
    }
    public void MetododeInstancia(){
        System.out.println("Método de Instancia Empleado");
        System.out.println("Nombre: "+this.Nombre
        +"\nSalario: "+this.Salario);
    }
}
