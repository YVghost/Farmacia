/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmgui.Clases;

public class DetalleFactura {
private Producto producto;
private int cantidadProducto;
private double valorProductos;

    public DetalleFactura(Producto producto, int cantidadProducto) {
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
        this.valorProductos = 0;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public double getValorProductos() {
        calcularValorProductos();
        return valorProductos;
    }

    public void calcularValorProductos(){
       valorProductos=0;
        valorProductos= producto.getPrecio()*cantidadProducto;
    }

    @Override
    public String toString() {
        return producto.getNombre()+"\t\t\t"+cantidadProducto+"\t\t"+producto.getPrecio()+"\t\t"+valorProductos;
    }
}