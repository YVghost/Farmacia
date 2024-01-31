/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmgui.Clases;

import java.util.ArrayList;
import java.util.Iterator;

public class Contabilidadd {
    private ArrayList<Debe> debe;
    private ArrayList<Haber> haber;
    private double totalDebe;
    private double totalHaber;

    public Contabilidadd() {
        debe = new ArrayList<Debe>();
        haber = new ArrayList<Haber>();
        this.totalDebe = 0;
        this.totalHaber = 0;
    }
    
     public ArrayList<Debe> getDebe() {
        return debe;
    }

    public ArrayList<Haber> getHaber() {
        return haber;
    }

    public void agregarDebe(Debe nuevoDebe) {
        debe.add(nuevoDebe);
    }

    public void agregarHaber(Haber nuevoHaber) {
        haber.add(nuevoHaber);
    }

    public void mostrarDebeHistorico() {//Organizar por fechas, periodos

        System.out.println("------Debe------");
        for (Debe x : debe) {
            System.out.println(x);
        }

    }



    public void mostrarHaberHistorico() {
        System.out.println("------Haber------");
        for (Haber x : haber) {
            System.out.println(x);
        }
    }

    public void calcularDebe() {
totalDebe=0;
        for (Debe x : debe) {
            totalDebe += x.getDebe();
        }

    }

    public void calcularHaber() {
    totalHaber=0;
        for (Haber x : haber) {
            totalHaber += x.getHaber();
        }
    }

    public double getTotalDebe() {
        calcularDebe();
        return totalDebe;
    }

    public double getTotalHaber() {
        calcularHaber();
        return totalHaber;
    }
    public double calcularBeneficioPerdida(){
        return totalHaber-totalDebe;
    }




    public void mostrarDebeFiltroFecha(Fecha f1,Fecha f2) {//Organizar por fechas, periodos
        System.out.println("------Debe------");
        for (Debe x : debe) {
            if (x.getFecha().comprobarFecha(f1, f2)) {
                System.out.println(x);
            }
        }
    }
    public void mostrarHaberFiltroFecha(Fecha f1,Fecha f2) {//Organizar por fechas, periodos
        System.out.println("------Haber------");
        for (Haber x : haber) {
            if (x.getFecha().comprobarFecha(f1, f2)) {
                System.out.println(x);
            }
        }
    }
    public void calcularDebeFiltroFecha(Fecha f1,Fecha f2) {
        for (Debe x : debe) {
            if (x.getFecha().comprobarFecha(f1, f2)) {
                totalDebe += x.getDebe();
            }
        }
    }
    public void calcularHaberFiltroFecha(Fecha f1,Fecha f2) {

        for (Haber x : haber) {
            if (x.getFecha().comprobarFecha(f1, f2)) {
                totalHaber += x.getHaber();
            }
        }
    }
    public  void eliminarDebe(String descripcion, Fecha f1) {
        Iterator<Debe> iter = debe.iterator();
        while (iter.hasNext()) {
            Debe debe1 = iter.next();
            if (debe1.getDetalle().equals(descripcion) && debe1.getFecha().equals(f1)) {
                iter.remove();
                System.out.println("Debe eliminado: " + debe1.getDetalle() + ", Fecha: " + debe1.getFecha());
                return;
            }else {
                System.out.println("No se ha encontrado ningun objeto");
            }
        }
    }
    public  void eliminarHaber(String descripcion, Fecha f1) {

        Iterator<Haber> iter = haber.iterator();

        while (iter.hasNext()) {
            Haber haber1 = iter.next();
            if (haber1.getDetalle().equals(descripcion) && haber1.getFecha().equals(f1)) {
                iter.remove();
                System.out.println("Debe eliminado: " + haber1.getDetalle() + ", Fecha: " + haber1.getFecha());
            }
        }
    }
    public void generarDebe(String detallePedido, double montoPedido){
        Fecha f1=new Fecha(0,0,0);
        Debe debe2=new Debe(f1.getFechaActual(),detallePedido,montoPedido);
        agregarDebe(debe2);
    }

}
