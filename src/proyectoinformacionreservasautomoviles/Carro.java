/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoinformacionreservasautomoviles;

/**
 *
 * @author Sebas
 */
public class Carro {

    private String matricula;
    private String modelo;
    private String color;
    private String marca;
    private double litrosGasolina;
    private Garaje garaje;

    public Carro(String matricula, String modelo, String color, String marca, double litrosGasolina, Garaje garaje) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.litrosGasolina = litrosGasolina;
        this.garaje = garaje;
    }

    // getters y setters para todos los atributos
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getLitrosGasolina() {
        return litrosGasolina;
    }

    public void setLitrosGasolina(double litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }

    public Garaje getGaraje() {
        return garaje;
    }

    public void setGaraje(Garaje garaje) {
        this.garaje = garaje;
    }
}
