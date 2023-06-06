/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoinformacionreservasautomoviles;

/**
 *
 * @author Sebas
 */
public class Garaje {

    private int idGaraje;
    private int cantMaxCarros;

    public Garaje(int idGaraje, int cantMaxCarros) {
        this.idGaraje = idGaraje;
        this.cantMaxCarros = cantMaxCarros;
    }

    public int getIdGaraje() {
        return idGaraje;
    }

    public void setIdGaraje(int idGaraje) {
        this.idGaraje = idGaraje;
    }

    public int getCantMaxCarros() {
        return cantMaxCarros;
    }

    public void setCantMaxCarros(int cantMaxCarros) {
        this.cantMaxCarros = cantMaxCarros;
    }

}
