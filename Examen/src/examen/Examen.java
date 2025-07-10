/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author rayha
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreEmpresa;
        nombreEmpresa = JOptionPane.showInputDialog("Ingrese el nombre de la Empresa:");
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de control de " + nombreEmpresa);

        String nombreAgente = JOptionPane.showInputDialog("dijite por favor el nombre del agente de ventas:");
        String apellidosAgente = JOptionPane.showInputDialog("dijite por favor  los apellidos del agente de ventas:");
        String cedulaAgente = JOptionPane.showInputDialog("dijite por favor la cédula del agente de ventas:");
        String codigoAgente = JOptionPane.showInputDialog("dijite por favor el cod del agente de ventas:");
        String sucursalAgente = JOptionPane.showInputDialog("dijite por favor la sucursal a la que pertenece el agente:");
        int tieneVehiculoOpcion = JOptionPane.showConfirmDialog(null, "¿El agente tiene vehículo propio?", "Vehículo Propio", JOptionPane.YES_NO_OPTION);
        boolean tieneVehiculo = (tieneVehiculoOpcion == JOptionPane.YES_OPTION);

        AgenteVentas agente = new AgenteVentas(nombreAgente, apellidosAgente, cedulaAgente, codigoAgente, sucursalAgente, tieneVehiculo, nombreEmpresa);
        String continuarRegistro;
        do {
            JOptionPane.showMessageDialog(null, "Registro de nueva factura para " + AgenteVentas.getNombre());

            Facturazion facturaActual = new Facturacion();

            String nombreCliente = JOptionPane.showInputDialog("dijite el  del cliente:");
            String cedulaCliente = JOptionPane.showInputDialog("dijite la cedula  del cliente:");

            facturaActual.setInfoCliente(new InfoCliente(nombreCliente, cedulaCliente));

            facturaActual.setCodFactura(JOptionPane.showInputDialog("Código de factura:"));

            double montoFactura = 0;
            boolean montoValido = false;
            do {
                try {
                    montoFactura = Double.parseDouble(JOptionPane.showInputDialog(
                    "dijite el monto de la factura:));
                    if (montoFactura > 0) {
                        facturaActual.setMontoFactura(montoFactura);
                        montoValido = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "El monto debe ser un número positivo baboso.", "error de Entrada se lo dije ", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "puso algo mal. Por favor, dijite un número para el monto.", "error lo mismo", JOptionPane.ERROR_MESSAGE);
                }
            } while (!montoValido);

            int mesNum;
            boolean mesValido = false;
            do {
                try {
                    mesNum = Integer.parseInt(JOptionPane.showInputDialog("Número de mes (1-12):"));
                    if (mesNum >= 1 && mesNum <= 12) {
                        facturaActual.setMes(mesNum);
                        mesValido = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Mes inválido. Ingrese un número entre 1 y 12.", "Tan facil que es y se equivoca", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "dijito algo mal . Por favor, ingrese un número para el mes.", "Error ", JOptionPane.ERROR_MESSAGE);
                }
            } while (!mesValido);
            int numElectricos = 0;
            int numAutomotrices = 0;
            int numConstruccion = 0;
            // Productos Eléctricos (con validación de cantidad)
            if (JOptionPane.showConfirmDialog(null, "su factura contiene productos eléctricos?", "Productos Eléctricos", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                boolean cantidadValida = false;
                do {
                    try {
                        numElectricos = Integer.parseInt(JOptionPane.showInputDialog("dijite la cantidad de productos eléctricos:"));
                        if (numElectricos >= 0) {
                            cantidadValida = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "imposible. Intente de nuevo.", "Error ", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "imposible. Por favor, ingrese un número entero para la cantidad.", "Error de ", JOptionPane.ERROR_MESSAGE);
                    }
                } while (!cantidadValida);
            }
            if (JOptionPane.showConfirmDialog(null, "su factura contiene productos automotrices?", "Productos Automotrices", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                boolean cantidadValida = false;
                do {
                    try {
                        numAutomotrices = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos automotrices:"));
                        if (numAutomotrices >= 0) {
                            cantidadValida = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Que no entiende?. Intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "error. Por favor, ingrese un número entero para la cantidad.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                    }
                } while (!cantidadValida);
                if (JOptionPane.showConfirmDialog(null, "su factura contiene productos de construcción?", "Productos Construcción", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    boolean cantidadValida = false;
                    do {
                        try {
                            numConstruccion = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos de construcción:"));
                            if (numConstruccion >= 0) {
                                cantidadValida = true;
                            } else {
                                JOptionPane.showMessageDialog(null, "La cantidad no puede ser negativa. Intente de nuevo.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "error. Por favor, ingrese un número entero para la cantidad.", "Error ", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (!cantidadValida);

                }
                facturaActual.setProductos(new Productos(numElectricos, numAutomotrices, numConstruccion));
                facturaActual.setEstadoFactura(JOptionPane.showInputDialog("Estado de la factura:"));
            }
            
        
        
    
     


