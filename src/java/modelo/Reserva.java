/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ET36
 */
public class Reserva {
    private int cantPlatos;
    private int cantPersonas;
    private Mesa mesa;
    private ArrayList<Menu> menusEleccion = new ArrayList<>();
    private LocalDate fecha;

    public Reserva(int cantPlatos, int cantPersonas, Mesa mesa, LocalDate fecha) {
        this.cantPlatos = cantPlatos;
        this.cantPersonas = cantPersonas;
        this.mesa = mesa;
        this.fecha = fecha;
    }
    

}
