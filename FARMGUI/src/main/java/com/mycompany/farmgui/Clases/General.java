/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmgui.Clases;

import com.mycompany.farmgui.GUI.Contabilidad;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sebas
 */
public class General {
     
    public static ArrayList<CabeceraFactura> cabeceraFacturas = new ArrayList<>();
    public static ArrayList<DetalleFactura> detalleFacturas = new ArrayList<>();
    public static ArrayList<Persona> listaClientes = new ArrayList<>();
    public static ArrayList<Producto> productos = new ArrayList<>();
    public static ArrayList<Proveedor> proveedores = new ArrayList<>();
    public static ArrayList<Producto> stock = new ArrayList<>();
    public static GeneradorID id = new GeneradorID();
    public static Contabilidadd c1=new Contabilidadd();

    static {
        //stock
        stock.add(new Producto("Ibuprofeno(20 tabletas)", 3.50, 12));
        stock.add(new Producto("Paracetamol(24 tabletas)", 2.80, 20));
        stock.add(new Producto("Loratadina(10 tabletas)", 4, 15));
        stock.add(new Producto("Omeprazol(14 cápsulas)", 6.50, 7));
        stock.add(new Producto("Antiácido(Líquido)", 7.00, 19));
        stock.add(new Producto("Loperamida(12 tabletas)", 3.00, 11));
        stock.add(new Producto("Vitamina C(20 tabletas efervecentes)", 4.50, 25));
        stock.add(new Producto("Alcohol isoporpílico(250 ml)", 3.50, 30));
        stock.add(new Producto("Crema antibiótica(30g)", 6.00, 17));
        stock.add(new Producto("Crema hidratante(150ml)", 5.50, 10));
        stock.add(new Producto("Pastilla anticonceptivas", 12.00, 30));
        stock.add(new Producto("Jarabe para la tos(120ml)", 7.50, 27));
        stock.add(new Producto("Pasta dental(100g)", 2.50, 23));

        //Productos Proveedores
        Producto producto1 = new Producto("Loratadina", 1.0, 0);
        Producto producto2 = new Producto("Aspirina", 2.0, 0);
        Producto producto3 = new Producto("Condones", 1.5, 0);
        Producto producto4 = new Producto("Paracetamol", 1.0, 0);

        //Proveedores y Productos
        proveedores.add(new Proveedor("Bayern", "17098048", "098999999"));
        proveedores.get(0).agregarProducto(producto1);
        proveedores.get(0).agregarProducto(producto2);
        proveedores.add(new Proveedor("Genericas", "17345678", "09777777"));
        proveedores.get(1).agregarProducto(producto3);
        proveedores.get(1).agregarProducto(producto4);
        proveedores.add(new Proveedor("Sanuz", "17099789876", "0988984654"));
        proveedores.get(2).agregarProducto(producto2);

        //Lista Clientes
        listaClientes.add(new Persona("Roberto Abad", "1709784521", "Tumbaco"));
        listaClientes.add(new Persona("Sonia Contreras", "1714029384", "La Magdalena"));
        listaClientes.add(new Persona("Mateo Ortega", "175546576", "Carcelen"));

        //Cabecera Facturas
        cabeceraFacturas.add(new CabeceraFactura(id.generarID(), listaClientes.get(0), new Fecha(12, 1, 2023)));
        cabeceraFacturas.get(0).añadirDetalle(new DetalleFactura(stock.get(0), 5));
        cabeceraFacturas.get(0).añadirDetalle(new DetalleFactura(stock.get(2), 3));

        cabeceraFacturas.add(new CabeceraFactura(id.generarID(), listaClientes.get(1), new Fecha(2, 3, 2023)));
        cabeceraFacturas.get(1).añadirDetalle(new DetalleFactura(stock.get(7), 1));
        cabeceraFacturas.get(1).añadirDetalle(new DetalleFactura(stock.get(6), 2));

        cabeceraFacturas.add(new CabeceraFactura(id.generarID(), listaClientes.get(2), new Fecha(5, 5, 2023)));
        cabeceraFacturas.get(2).añadirDetalle(new DetalleFactura(stock.get(3), 1));
    }
    
    //Metodos GET
    
     public static ArrayList<CabeceraFactura> getCabeceraFacturas() {
        return cabeceraFacturas;
    }

    public static ArrayList<DetalleFactura> getDetalleFacturas() {
        return detalleFacturas;
    }

    public static ArrayList<Persona> getListaClientes() {
        return listaClientes;
    }

    public static ArrayList<Producto> getProductos() {
        return productos;
    }

    public static ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public static ArrayList<Producto> getStock() {
        return stock;
    }

    public static GeneradorID getId() {
        return id;
    }
    public static Contabilidadd getConta(){
        return c1;
    }
    
    //Metodos añadir al arraylist
    public static void añadirCabecera(Persona cliente){
    cabeceraFacturas.add(new CabeceraFactura(id.generarID(),cliente,new Fecha(1,1,1).getFechaActual()));
    }
    
    public void añadirCliente(String cedula,String nombre,String direccion){
    listaClientes.add(new Persona(nombre,cedula,direccion));
    }
    public void añadirProveedor(String nombre,String RUC,String telefono){
    proveedores.add(new Proveedor(nombre,RUC,telefono));
    }
    public void añadirProductoStock(String nombre,double precioVenta){
    stock.add(new Producto(nombre,precioVenta,0));
    }
   /* public void incrementarStok(ArrayList<Producto> p){
        for(Producto pp:p){
            System.out.println(""+pp.getNombre());
           for(Producto stck:stock){
               System.out.println(""+pp.getNombre());
              if (!pp.getNombre().equals(stck.getNombre())) {
                   añadirProductoStock(pp.getNombre(),pp.getPrecio());
        }else {
              
               stck.incrementarStock(pp.getStock());
              }
    }
        }
}*/

public void incrementarStok(ArrayList<Producto> p) {
    for (Producto pp : p) {
        System.out.println("" + pp.getNombre());

        Iterator<Producto> iterator = stock.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            Producto stck = iterator.next();

            System.out.println("" + pp.getNombre());

            if (!pp.getNombre().equals(stck.getNombre())) {
                // Si el producto no existe en la lista stock, añadirlo
                añadirProductoStock(pp.getNombre(), pp.getPrecio());
            } else {
                // Si el producto ya existe, incrementar su stock
                stck.incrementarStock(pp.getStock());
                encontrado = true;
                break; // Salir del bucle ya que encontramos el producto
            }
        }

        // Si el producto no fue encontrado en la lista stock, añadirlo al final
        if (!encontrado) {
            añadirProductoStock(pp.getNombre(), pp.getPrecio());
        }
    }
}
    
    
    //Metodos Extra
    
     public CabeceraFactura buscarCabeceraPorNumero (ArrayList < CabeceraFactura > listaCabeceras, String
        numeroFactura){
            for (CabeceraFactura cabecera : listaCabeceras) {
                if (cabecera.getCodigoFactura().equals(numeroFactura)) {
                    return cabecera;  // Devolver la cabecera cuando encuentre una coincidencia
                }
            }
            return null;  // Devolver null si no se encuentra ninguna coincidencia
        }
    public Persona buscarCliente(ArrayList<Persona> p, String cedula){
         for (Persona per : p) {
                if (per.getCedula().equals(cedula)){
                    return per;  // Devolver la cabecera cuando encuentre una coincidencia
                }
            }
            return null;  // Devolver null si no se encuentra ninguna coincidencia
    }
    
    public Producto buscarProducto(ArrayList<Producto> p, String prod){
         for (Producto pro : p) {
                if (pro.getNombre().equals(prod)){
                    return pro; 
                }
            }
            return null;  // Devolver null si no se encuentra ninguna coincidencia
    }
    public Proveedor buscarProveedorRUC(ArrayList<Proveedor> p, String prov){
         for (Proveedor prove : p) {
                if (prove.getRUC().equals(prov)){
                    return prove;  // Devolver la cabecera cuando encuentre una coincidencia
                }
            }
            return null;  // Devolver null si no se encuentra ninguna coincidencia
    }
     public Proveedor buscarProveedor(ArrayList<Proveedor> p, String prov){
         for (Proveedor prove : p) {
                if (prove.getEmpresa().equals(prov)){
                    return prove;  // Devolver la cabecera cuando encuentre una coincidencia
                }
            }
            return null;  // Devolver null si no se encuentra ninguna coincidencia
    }
    public Pedido buscarPedido(ArrayList<Pedido> p,String id){
    for (Pedido pedido : p) {
                if (pedido.getID().equals(id)){
                    return pedido;  // Devolver la cabecera cuando encuentre una coincidencia
                }
            }
            return null;
    }
    
    public Producto buscarStock(String nombreProd){
    for(Producto prod:stock){
        if (prod.getNombre().equals(nombreProd)) {
            return prod;
        }
    }
    return null;
    }

    
}
