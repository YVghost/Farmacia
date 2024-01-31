/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmgui.Clases;

public class Debe {
    private Fecha fecha;
    private String detalle;
    private double debes;

    //Hacer una enumeracion para el detalle
    public Debe(Fecha fecha, String detalle, double debe) {
        this.fecha = fecha;
        this.detalle = detalle;
        this.debes = debe;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getDebe() {
            return debes;
    }

    public void setDebes(double debe) {
        this.debes = debe;
    }
    @Override
    public String toString(){
        return "Detalle: "+detalle+"\nMonto Debe: "+debes+"\nFecha:"+fecha.toString();
    }
}
