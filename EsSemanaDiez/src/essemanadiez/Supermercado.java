/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package essemanadiez;

import java.util.Vector;

/**
 *
 * @author rayha
 */
public class Supermercado {
    private String nombreSuper;
    private String codigoSuper;
    private Vector<Producto> inventario;

    public Supermercado(String nombreSuper, String codigoSuper, Vector<Producto> inventario) {
        this.nombreSuper = nombreSuper;
        this.codigoSuper = codigoSuper;
        this.inventario = inventario;
         this.inventario = new Vector<>();
    }

    Supermercado(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }
    public String mostrarInventario() {
        StringBuilder inventarioInfo = new StringBuilder("Inventario de " + nombreSuper + ":\n");
        for (Producto producto : inventario) {
            inventarioInfo.append(producto.mostrarInformacion()).append("\n");
        }
        return inventarioInfo.toString();
    }
    public double calcularGananciaTotal() {
        double gananciaTotal = 0;
        for (Producto producto : inventario) {
            gananciaTotal += producto.getGananciaEsperada();
        }
        return gananciaTotal;
    }
    
}
