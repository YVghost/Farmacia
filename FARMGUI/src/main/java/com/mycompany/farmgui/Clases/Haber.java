/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmgui.Clases;

public class Haber {
  private Fecha fecha;
    private String detalle;
    private double haber;

    public Haber(Fecha fecha, String detalle, double haber) {
        this.fecha = fecha;
        this.detalle = detalle;
        this.haber = haber;
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

    public double getHaber() {
        return haber;
    }

    public void setHaber(double haber) {
        this.haber = haber;
    }
    @Override
    public String toString(){
        return "Detalle: "+detalle+"\nMonto Debe: "+haber+"\nFecha:"+fecha.toString();
    }
}
