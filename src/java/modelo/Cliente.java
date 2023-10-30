/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ET36
 */
public class Cliente extends Usuario {
    private String tipoPago;

    public Cliente(String tipoPago, String nombre, int dni) {
        super(nombre, dni);
        this.tipoPago = tipoPago;
    }
    
    public void Pedido(){}

    
}
