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
public class Empleado {
    private String nombre;
    private float salario;
    private int ayoAlta;

    public Empleado(String nombre, float salario, int ayoAlta) {
        this.nombre = nombre;
        this.salario = salario;
        this.ayoAlta = ayoAlta;
    }

    
    //metdodos set

    public String getNombre() {
        return nombre;
    }

    public float getSalario() {
        return salario;
    }

    public int getAyoAlta() {
        return ayoAlta;
    }
    
    public void incSalario( float subida){
        salario += subida;
    }
}
