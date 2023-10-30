/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ET36
 */
public class Menu implements Importe{
    private String nombre;
    private double costo;
    private ArrayList<Producto> descMenu = new ArrayList<>();

    public Menu(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }
    
    @Override
    public double calcularPrecio(){
    
    return 0;
    }

}
