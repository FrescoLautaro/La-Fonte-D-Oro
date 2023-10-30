/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ET36
 */
public class Admin extends Usuario {
   private int contra;

    public Admin(int contra, String nombre, int dni) {
        super(nombre, dni);
        this.contra = contra;
    }
    
    public void cambiarMenu(){}
    
    public void verEstadisticas(){}
   
   
}
