/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmgui.Clases;

import java.time.LocalDate;
import java.util.Objects;
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void modificarDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void modificarMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void modificarAnio(int anio) {
        this.anio = anio;
    }
    public String obtenerFechaActual(){
        LocalDate fechaActual = LocalDate.now();
        return fechaActual+"";
    }
    public Fecha getFechaActual(){
         int diaActual,mesActual,anioActual;
        diaActual=Integer.parseInt(obtenerFechaActual().substring(8,10));
        mesActual=Integer.parseInt(obtenerFechaActual().substring(5,7));
        anioActual=Integer.parseInt(obtenerFechaActual().substring(0,4));
        Fecha fechaActual=new Fecha(diaActual,mesActual,anioActual);
        return fechaActual;
    }

    public boolean comprobarFecha(Fecha f1, Fecha f2){
            int anioInicio = f1.getAnio( );
            int mesInicio = f1.getMes( );
            int diaInicio = f1.getDia( );
            int anioFin = f2.getAnio( );
            int mesFin = f2.getMes( );
            int diaFin = f2.getDia( );

            boolean diaB=false,mesB=false,anioB=false;
         anioB = anio >= anioInicio && anio <= anioFin;
         mesB = mes >= mesInicio && mes <= mesFin;
         diaB = dia >= diaInicio && dia <= diaFin;


        return anioB && mesB && diaB;
    }

    public String mostrarFecha(){
        return dia+" "+mes+" "+anio;
    }
    @Override
    public String toString(){
        return dia+"/"+mes+"/"+anio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return dia == fecha.dia &&
                mes == fecha.mes &&
                anio == fecha.anio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, anio);
    }
}
