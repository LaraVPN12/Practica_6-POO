
package Ejercicio1;

public class EmpleadoAsalariado extends Empleado{
    protected String Empresa;
    
    public EmpleadoAsalariado(String Nombre, double Salario, String Empresa){
        super(Nombre, Salario);
        this.Empresa=Empresa;
    }
    @Override
    public void MetododeClase(){
        System.out.println("Método de Clase Empleado Asalariado");
    }
    @Override
    public void MetododeInstancia(){
        System.out.println("Método de Instancia Empleado Asalariado");
        System.out.println("Nombre: "+this.Nombre+"\nSalario: "+this.Salario+"\nEmpresas: "+this.Empresa);
    }
}

