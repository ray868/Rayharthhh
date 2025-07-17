/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package essemanadiez;

import javax.swing.JOptionPane;

/**
 *
 * @author rayha
 */
public class EsSemanaDiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al super querel plata trabajal dia y noche sin palal, trabaja trabja");
        String[] datosEntrada = {
            "Supermercado Chino el no como ratas", 
            "SC001",              
            "Arroz",              
            "P001",              
            "raton Perez",         
            "123456789",          
            "10",                 
            "2000",               
            "comida",          
            "Azúcar",            
            "P002",              
            "juana Lopez",        
            "987654321",          
            "5",                  
            "1500",               
            "comida",          
            "salir"               
        };
        Supermercado supermercado = new Supermercado(datosEntrada[0], datosEntrada[1]);
        
        for (int i = 2; i < datosEntrada.length; i += 7) {
            if (datosEntrada[i].equalsIgnoreCase("salir")) {
                break; 
            }

        }
        int i = 0;
        String nombreProducto = datosEntrada[i]; 
            String codigoProducto = datosEntrada[i + 1]; 
            String nombreEmpleado = datosEntrada[i + 2]; 
            String cedulaEmpleado = datosEntrada[i + 3]; 
            int cantidad = Integer.parseInt(datosEntrada[i + 4]); 
            double precioBase = Double.parseDouble(datosEntrada[i + 5]); 
            String tipoProducto = datosEntrada[i + 6]; 
           
        Producto producto = new Producto(nombreProducto, codigoProducto, nombreEmpleado, cedulaEmpleado, cantidad, precioBase, tipoProducto);

        
        String inventarioInfo = supermercado.mostrarInventario(); 
        double gananciaTotal = supermercado.calcularGananciaTotal();
        mostrarResultados(inventarioInfo, gananciaTotal); 
    }

    private static void mostrarResultados(String inventarioInfo, double gananciaTotal) {
        System.out.println(inventarioInfo); 
        System.out.println("Ganancia total esperada: " + gananciaTotal); 
        JOptionPane.showMessageDialog(null,"Ganancia total esperada:," + gananciaTotal);
    }
}


