/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoinformacionreservasautomoviles;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Sebas
 */
public class Cliente {
    private String DNI;
    private String nombre;
    private String direccion;
    private String telefono;
    private int codigo;
    private Cliente avaladoPor;


    public Cliente(String DNI, String nombre, String direccion, String telefono, int codigo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigo = codigo;
    }

    
    // getters y setters para todos los atributos

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getAvaladoPor() {
        return avaladoPor;
    }

    public void setAvaladoPor(Cliente avaladoPor) {
        this.avaladoPor = avaladoPor;
    }
}
