
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholar;

/**
 *
 * @author estudiante
 */
public class Scholar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1=new Empleado();
        empleado1.nombre= "Lunellys paola";
        empleado1.apellido= "Cortes montalvo";
        empleado1.fecha_nacimiento="02 de mayo";
        empleado1.tipo_sangre="O+";
        
        
        //System.out.println("El empleado se llama " +empleado1.nombre);
        
        //System.out.println("El apellido del empleado es "+empleado1.apellido);
        empleado1.printName();
        System.out.println("La fecha de nacimiento es"+empleado1.fecha_nacimiento);
        System.out.println("El tipo de sangre es"+empleado1.tipo_sangre);
        
        Estudiante estudiante1=new Estudiante();
        estudiante1.nombre= "Marcos Elias ";
        estudiante1.apellido= "Caro Meza";
        
                
        //System.out.println("El estudiante se llama " +estudiante1.nombre);
        //System.out.println("El apellido del estudiante es " +estudiante1.apellido);
        estudiante1.printName();
        
        
        
        
    }
    
}
