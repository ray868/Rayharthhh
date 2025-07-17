/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package essemanadiez;

/**
 *
 * @author rayha
 */
public class Producto {
    private String nombreProducto;
    private String codigoProducto;
    private String nombreEmpleado;
    private String cedulaEmpleado;
    private int cantidad;
    private double precioBase;
    private String tipoProducto;
    private double precioBruto;
    private double gananciaEsperada;

    public Producto(String nombreProducto, String codigoProducto, String nombreEmpleado, String cedulaEmpleado, int cantidad, double precioBase, String tipoProducto) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.nombreEmpleado = nombreEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.cantidad = cantidad;
        this.precioBase = precioBase;
        this.tipoProducto = tipoProducto;
        this.precioBruto = precioBruto;
        this.gananciaEsperada = gananciaEsperada;
         calcularPrecioBruto();
        calcularGananciaEsperada();
    }
    private void calcularPrecioBruto() {
        switch (tipoProducto.toLowerCase()) {
            case "alimentos":
                precioBruto = precioBase * 1.2; // 20% más
                break;
            case "bebidas":
                precioBruto = precioBase * 1.3; // 30% más
                break;
            case "higiene":
                precioBruto = precioBase * 1.25 + 500; // 25% más + 500
                break;
            case "limpieza":
                precioBruto = precioBase * 1.19 + (precioBase * 0.04) + 1000; // 19% más + 4% + 1000
                break;
            default:
                precioBruto = precioBase; // Sin cambios si no es un tipo válido
                break;
        }
    }
    private void calcularGananciaEsperada() {
        gananciaEsperada = (precioBruto - precioBase) * cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGananciaEsperada() {
        return gananciaEsperada;
    }

    public void setGananciaEsperada(double gananciaEsperada) {
        this.gananciaEsperada = gananciaEsperada;
    }
     public String mostrarInformacion() {
        return "Producto: " + nombreProducto + ", Código: " + codigoProducto + ", Precio Bruto: " + precioBruto +
               ", Ganancia Esperada: " + gananciaEsperada;
    }
    
    
    
    
    
}
