/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmgui.Clases;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String cedula;


    private ArrayList<CabeceraFactura>facturas;
    private String direccion;


    public Persona(String nombre, String cedula, String direccioon) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.facturas = new ArrayList<>();
        this.direccion = direccioon;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public ArrayList<CabeceraFactura> getFacturas() {
        return facturas;
    }

    public String getDireccion() {
        return direccion;
    }
    public void añadirFactura(CabeceraFactura CF){
        facturas.add(CF);
    }

}
