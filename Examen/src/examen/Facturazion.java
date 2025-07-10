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
public class Facturazion {
    private String codFactura;
    private int mesNumero;
    private String mesNombre;
    private double montoFactura;
    private String estadoFactura;
    private InfoCliente infoCliente;
    private Productos productos;

    public Facturazion() {
        this.infoCliente = null;
        this.productos = null;
    }

    public double calcularComision() {
        double comision = 0;
        double montoBase = this.montoFactura;
        if (this.productos == null) {
            System.err.println("error: Objeto Productos no puestos en Facturacion.");
            return 0;
        }
        if (productos.getProductosElec() > 0 && productos.getProductosAuto() > 0 && productos.getProductosConstru() > 0) {
            comision = montoBase * 0.10;
            if (montoBase > 50000) {
                comision += montoBase * 0.05;
            }
            return comision;
        }
        if (productos.getProductosElec() >= 3) {
            comision += montoBase * 0.04; 
        } else if (productos.getProductosElec() > 0) {
            comision += montoBase * 0.02; 
        }
        if (productos.getProductosAuto() > 4) {
            comision += montoBase * 0.04; 
        } else if (productos.getProductosAuto() > 0) {
            comision += montoBase * 0.02; 
        }
        if (productos.getProductosConstru() > 0) {
            comision += montoBase * 0.08; 
        }
        if (montoBase > 50000) {
            comision += montoBase * 0.05; 
        }
        return comision;

    }

    public int calcularPuntos() {
        int puntos = 0;
        if (this.productos == null) {
            System.err.println("Error: Objeto Productos no puestos en Facturacion.");
            return 0;
        }
        if (productos.getProductosElec() > 0 && productos.getProductosAuto() > 0 && productos.getProductosConstru() > 0) {
            puntos += 3;
        }
        if (productos.getProductosElec() > 0) {
            puntos += 1;
        }
        if (productos.getProductosAuto() > 0) {
            puntos += 1;
        }
        if (productos.getProductosConstru() > 0) {
            puntos += 2;
        }
        if (montoFactura > 50000) {
            puntos += 1;
        }
        return puntos;

    }

    public double calculaErroneo() {
        return this.montoFactura * 0.01;
    }

    public double CalculoPuntosExtra() {
        return this.montoFactura * 0.20;
    }

    public String getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(String codFactura) {
        this.codFactura = codFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getMesNumero() {
        return mesNumero;
    }

    public void setMes(int mesNumero) {
        this.mesNumero = mesNumero;
        this.mesNombre = convertirNumeroAMes(mesNumero);
    }

    public String getMesNombre() {
        return mesNombre;
    }

    public String getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(String estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    public InfoCliente getInfoCliente() {
        return infoCliente;
    }

    public void setInfoCliente(InfoCliente infoCliente) {
        this.infoCliente = infoCliente;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    private String convertirNumeroAMes(int numeroMes) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        if (numeroMes >= 1 && numeroMes <= 12) {
            return meses[numeroMes - 1];
        }
        return "Mes Inválido";
    }

}
