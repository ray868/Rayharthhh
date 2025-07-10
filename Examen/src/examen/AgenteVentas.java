/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author rayha
 */
public class AgenteVentas {
    private String nombre;
    private String apellidos;
    private String cedula;
    private String codigo;
    private String sucursal;
    private boolean tieneVehiculoPropio;
    private String nombreEmpresa;

    private double totalVendidoAcumulado;
    private double totalComisionesAcumulado;
    private int totalPuntosAcumulado;
    private int cantidadFacturasAcumuladas;
    private String mesUltimaFactura;

    public AgenteVentas(String nombre, String apellidos, String cedula, String codigo, String sucursal, boolean tieneVehiculoPropio, String nombreEmpresa) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.tieneVehiculoPropio = tieneVehiculoPropio;
        this.nombreEmpresa = nombreEmpresa;
        this.totalVendidoAcumulado = 0;
        this.totalComisionesAcumulado = 0;
        this.totalPuntosAcumulado = 0;
        this.cantidadFacturasAcumuladas = 0;
        this.mesUltimaFactura = ":0";
    }

    public void acumularResultadosFactura(Facturazion factura) {
        this.totalVendidoAcumulado += factura.getMontoFactura();
        this.totalComisionesAcumulado += factura.calcularComision();
        this.totalComisionesAcumulado += factura.calculaErroneo();
        this.totalPuntosAcumulado += factura.calcularPuntos();
        this.cantidadFacturasAcumuladas++;
        this.mesUltimaFactura = factura.getMesNombre();

    }

    public void mostrarResumen() {
        StringBuilder resumen = new StringBuilder();
        resumen.append("--- RESUMEN DEL AGENTE VENDEDOR ---\n");
        resumen.append("Empresa: ").append(nombreEmpresa).append("\n");
        resumen.append("Agente Vendedor \"").append(nombre).append(" ").append(apellidos).append("\" código: ").append(codigo).append("\n");
        resumen.append("Sucursal: ").append(sucursal).append("\n");
        resumen.append("El Agente Vendedor ").append(tieneVehiculoPropio ? "sí" : "no").append(" cuenta con vehículo propio\n\n");
        resumen.append("En el mes de ").append(mesUltimaFactura).append(".\n");
        resumen.append("• Vendió un total de ").append(String.format("%.2f", totalVendidoAcumulado)).append(" en facturas\n");
        double comisionesFinalesParaMostrar = totalComisionesAcumulado;
        boolean logroBonoExtra = false;

        if (cantidadFacturasAcumuladas > 3 || totalVendidoAcumulado > 300000) {
            comisionesFinalesParaMostrar += 20000;
            logroBonoExtra = true;
            resumen.append("• Obtuvo un total en comisiones de ").append(String.format("%.2f", comisionesFinalesParaMostrar)).append("\n");
            resumen.append("• El agente vendedor ").append(logroBonoExtra ? "sí" : "no").append(" logró el objetivo de llegar al BONO EXTRA.\n");
            resumen.append("• Puntos obtenidos por el vendedor: ").append(totalPuntosAcumulado).append("\n");
            JOptionPane.showMessageDialog(null, resumen.toString(), "Resultados del Agente", JOptionPane.INFORMATION_MESSAGE);

        }
    }

}
