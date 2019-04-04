/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminario2;

/**
 *
 * @author Estudiante
 */
public class PruebaEmpleados {
    
    public static void main(String[] args){
        Empleado [] empleados = new Empleado [3];
        
        empleados [0] = new Empleado("Juan", 1000, 2001);
        Jefe jefe = new Jefe(0.5f, "Pedro", 1200, 1999);
        empleados [1] = jefe;
        empleados [2] = new Administrativo(jefe, "Enrique", 900, 2003);
        
        for(Empleado empleado: empleados){
            if(empleado instanceof Jefe){
                Jefe jefe2 =(Jefe) jefe;
                jefe.setBonificacion(0.8f);
                System.out.println("Bonificacion para: " + jefe.getNombre());
            }
            
        }
      
    }
}