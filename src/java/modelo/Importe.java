/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ET36
 */
public interface Importe {
    //Se usara esta interface para calcular el precio de un menu con sus productos
    //Y se usara para calcular el precio de la venta (IVA, tipo de pago, etc)
    public double calcularPrecio();
}
