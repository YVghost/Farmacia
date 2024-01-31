/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmgui.Clases;

import java.util.ArrayList;
import java.util.List;

public class Proveedor {
    private String nombreEmpresa;
    private String RUC;
    private ArrayList<Producto>productosProveedor;
    private String telefono;
    private double precioPedido;
    private ArrayList<Pedido> pedidos;

    public Proveedor(String empresa, String RUC, String telefono) {
        this.nombreEmpresa = empresa;
        this.RUC = RUC;
        this.productosProveedor = new ArrayList<>();
        this.telefono = telefono;
        this.precioPedido=0.0;
        this.pedidos=new ArrayList<>();
    }

    public String getEmpresa() {
        return nombreEmpresa;
    }

    public void cambiarEmpresa(String empresa) {
        this.nombreEmpresa = empresa;
    }

    public String getRUC() {
        return RUC;
    }

    public void cambiarRUC(String RUC) {
        this.RUC = RUC;
    }

    public List<Producto> getProductosProveedor() {
        return productosProveedor;
    }
    public void añadirPedido(Pedido p){
        pedidos.add(p);
    }


    public String getTelefono() {
        return telefono;
    }
    
    public ArrayList<Pedido> getPedido(){
    return pedidos;
    }

    public void cambiarTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void agregarProducto(Producto producto){
        productosProveedor.add(producto);
    }
    public double hacerPedido(ArrayList<Producto> stock, ArrayList<Producto> nuevoPedido) {
        for (Producto x : stock) {
            for (Producto y: nuevoPedido) {
                if (x.getNombre().equals(y.getNombre()))
                    x.incrementarStock(y.getStock());
                precioPedido += y.getPrecio()*y.getStock();
            }

        }
        return precioPedido;
    }
    public double getPrecioPedido(){
        return precioPedido;
    }
  
   
  

    @Override
    public String toString() {
        return  "Nombre de la Empresa='" + nombreEmpresa + '\n' +
                "RUC='" + RUC + '\n' +
                "Lista de Productos: \n" + productosProveedor +
                "Telefono='" + telefono + '\n' +

                '}';
    }
    public String nombreProducto(){
        return productosProveedor+"\n";
    }
    
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    public Producto buscarProducto(String prod){
        for (Producto x:productosProveedor) {
            if(x.getNombre().equals(prod)){
            return x;
            }
        }
        return null;
    }
    
    public Pedido getPedido(String id){
        for(Pedido x:pedidos){
            if (x.getID().equals(id)) {
                System.out.println("id:"+x.getID());
                return x;
            }
                
                
                /*
            for (int i=0;i>x.getProductos().size();i++) {
                System.out.println("busqueda:"+i+" "+x.getProductos().get(i)+"\n");
                for(Producto stck:stock){
                    System.out.println("-"+stck.getNombre()+"\n");
                    if (stck.getNombre().equals(x.getProductos().get(i).getNombre())) {
                        stck.incrementarStock(x.getProductos().get(i).getStock());
                        System.out.println("stock incrementado de: "+stck.getNombre());
             
                    }else{
                        stock.add(x.getProductos().get(i));
                        
                        System.out.println("Añadido al stock"+stck.getNombre());
                    }
                
                        }
            }
                
            }}
        
        
        System.out.println("se acabó");*/
    }
        return null;
}
}

