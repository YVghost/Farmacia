/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmgui.Clases;

import java.util.ArrayList;

public class CabeceraFactura
{
    private String codigoFactura;
    private Persona cliente;
    private Fecha fecha;
    private ArrayList<DetalleFactura> detallesFactura;
    private double subtotal;
    private double total;
    private double valorIVA;
    private GeneradorID g;
    public static final double IVA=1.12;


    public CabeceraFactura(String ID, Persona cliente, Fecha fecha) {
        this.codigoFactura = ID;
        this.cliente = cliente;
        this.fecha = fecha;
        this.detallesFactura = new ArrayList<>();
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public Persona getCliente() {
        return cliente;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public ArrayList<DetalleFactura> getDetallesFactura() {
        return detallesFactura;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }
    public void añadirDetalle(DetalleFactura detalleFac){
        detallesFactura.add(detalleFac);
    }

    public void calcularSubtotal(){
        subtotal=0;
        for (DetalleFactura x:detallesFactura) {
            subtotal+= x.getValorProductos();
        }
    }

    public void calcularIVA(){
       valorIVA=0;
       valorIVA=subtotal*(IVA-1);
    }
    public void calcularTotal(){
        total=0;
        total=subtotal*IVA;
    }
    public String concatenarTexto(){
    StringBuilder c=new StringBuilder();
     for (DetalleFactura p : detallesFactura) {
            c.append(p).append("\n");
        }
     return c.toString().trim();
    }
     public  String generarFactura() {
        // Utilizar String.format para crear la cadena formateada
        String tot = String.format("Subtotal: %.2f\nIVA: %.2f\nTotal: %.2f", subtotal, valorIVA, total);

        return tot;
    }
    
    
    public String mostrarFactura(){
        calcularSubtotal();
        calcularIVA();
        calcularTotal();
        
        String s= "-----------------------------------------------Factura-----------------------------------------------\n" +
                "-------------------------------------------Farmacia Medicity-------------------------------------------\n" +
                "                    Dirección Sucursal\n               AV. INTEROCENAICA KM 5 / TUMBACO\n" +"Factura: "+codigoFactura+
                "\nRUC: 1790016919002\t\t\t\t\t" +"Fecha Emisión: "+fecha.mostrarFecha()+
                "\nCliente:" +cliente.getNombre()+"\n" +
                "Cedula/Ruc: "+cliente.getCedula()+"\t\tDireccion: "+cliente.getDireccion()+
                "\nDescripción\t\t\t\t\tCant\tP.Uni\tP.Tot\n"+
                concatenarTexto()+"\n"+ generarFactura();
        return s;

    }
}
    /*public void mostrarFacturaFecha(Fecha f1,Fecha f2){
        if (fecha.comprobarFecha(f1,f2)) {
            calcularSubtotal();
            calcularIVA();
            calcularTotal();
            System.out.println("--------------------------Factura--------------------------\n" +
                    "---------------------Farmacia Medicity---------------------\n" +
                    "                    Dirección Sucursal\n               AV. INTEROCENAICA KM 5 / TUMBACO\n" + "Factura: " + codigoFactura +
                    "\nRUC: 1790016919002\t\t\t\t\t" + "Fecha Emisión: " + fecha.mostrarFecha() +
                    "\nCliente:" + cliente.getNombre() + "\n" +
                    "Cedula/Ruc: " + cliente.getCedula() + "\t\tDireccion: " + cliente.getDireccion() +
                    "\nDescripción\t\t\t\t\tCant\tP.Uni\tP.Tot\n");
            for (DetalleFactura x : getDetallesFactura()) {
                System.out.println(x + "\n");
            }
            System.out.println("Subtotal: " + subtotal);
            System.out.printf("IVA: %.2f \nTotal: %.2f \n", valorIVA, total);
        }
    }
}*/
