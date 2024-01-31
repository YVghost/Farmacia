/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmgui.Clases;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> productos;
    private String estado;
    private double precio;
    private Fecha fecha;
    private String ID;
    

    public Pedido(ArrayList<Producto> productos, Fecha fecha,String iD) {
        this.productos = productos;
        this.estado = "Pendiente";
        this.precio = 0;
        this.fecha = fecha;
        this.ID = iD;
    }

    public Pedido(double precio) {
        this.precio = precio;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public String getEstado() {
        return estado;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public double getPrecio() {
        calcularPreciototal();
        return precio;
    }
    public String getID(){
    return ID;
    }
    
    
    public void calcularPreciototal(){
        precio=0;
        for (Producto p:productos) {
            precio+=(p.getPrecio()*p.getStock());
        }
       
    }

    public void actualizarEstado(boolean entregado){
        if (entregado){
            estado = "Entregado";
        }
    }


}
