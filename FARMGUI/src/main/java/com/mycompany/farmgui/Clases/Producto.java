/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmgui.Clases;
public class Producto {
    private String nombre;
    private double precio;
    private int stock;


    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void incrementarStock(int cantidad) {
        stock += cantidad;
    }
    public void cambiarStock(int cantidad){
        stock=cantidad;
    }

    public void cambiarNombre(String nombre){
        this.nombre=nombre;
    }

    public void cambiarPrecio(double precio) {
        this.precio = precio;
    }
    public boolean verificarStock(int cantidad){
        boolean b = stock>=cantidad;
    return b;
    }

    @Override
    public String toString() {
        return "Producto: "+nombre+"\nPrecio: "+precio+"\nStock: "+stock+"\n";
    }
}
