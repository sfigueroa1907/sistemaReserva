/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoinformacionreservasautomoviles;

import java.util.ArrayList;

public class Agencia {

    private String nombre;
    private String direccion;
    private String listaAgencia;

    public Agencia(String nombre, String direccion, String listaAgencia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaAgencia = listaAgencia;
    }

    // getters y setters para todos los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getListaAgencia() {
        return listaAgencia;
    }

    public void setListaAgencia(String listaAgencia) {
        this.listaAgencia = listaAgencia;
    }

}
