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
public class InfoCliente {
    private String NombreCliente;
    private String Idcliente;

    public InfoCliente(String NombreCliente, String Idcliente) {
        this.NombreCliente = NombreCliente;
        this.Idcliente = Idcliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getIdcliente() {
        return Idcliente;
    }

    public void setIdcliente(String Idcliente) {
        this.Idcliente = Idcliente;
    }
    
    
    
}
