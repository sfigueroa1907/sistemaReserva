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
import java.util.ArrayList;
import java.util.Date;

public class Reserva {

    private ArrayList<Cliente> clientes;
    private ArrayList<Carro> carros;
    private ArrayList<Agencia> agencias;
    private ArrayList<Garaje> garajes;
    private Date fechaInicio;
    private Date fechaFinal;
    private double precioAlquiler;

    private double precioTotal;
    private boolean entregado;

    public Reserva(ArrayList<Cliente> clientes, ArrayList<Carro> carros, ArrayList<Agencia> agencias, ArrayList<Garaje> garajes, Date fechaInicio, Date fechaFinal, double precioAlquiler, double precioTotal, boolean entregado) {
        this.clientes = clientes;
        this.carros = carros;
        this.agencias = agencias;
        this.garajes = garajes;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.precioAlquiler = precioAlquiler;
        this.precioTotal = precioTotal;
        this.entregado = entregado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reserva:\n");
        sb.append("- Cliente: ").append("\n");
        for (Cliente cliente : clientes) {
            sb.append("  - DNI: ").append(cliente.getDNI()).append("\n");
            sb.append("    Nombre: ").append(cliente.getNombre()).append("\n");
            sb.append("    Dirección: ").append(cliente.getDireccion()).append("\n");
            sb.append("    Telefono: ").append(cliente.getTelefono()).append("\n");
            sb.append("    Codigo: ").append(cliente.getCodigo()).append("\n");
            sb.append("    Avalado por: ").append(cliente.getAvaladoPor()).append("\n");
        }
        sb.append("- Carros: ").append("\n");
        for (Carro carro : carros) {
            sb.append("  - Matricula: ").append(carro.getMatricula()).append("\n");
            sb.append("    Modelo: ").append(carro.getModelo()).append("\n");
            sb.append("    Marca: ").append(carro.getMarca()).append("\n");
            sb.append("    Color: ").append(carro.getColor()).append("\n");
            sb.append("    Garaje: ").append(carro.getGaraje()).append("\n");
        }
        sb.append("- Agencia: ").append("\n");
        for (Agencia agencia : agencias) {
            sb.append("  - Nombre Agencia: ").append(agencia.getNombre()).append("\n");
            sb.append("    Dirección Agencia: ").append(agencia.getDireccion()).append("\n");
        }
        sb.append("- Garajes: ").append("\n");
        for (Garaje garaje : garajes) {
            sb.append("  - Codigo Garaje: ").append(garaje.getIdGaraje()).append("\n");
            sb.append("    Cantidad vehiculos: ").append(garaje.getCantMaxCarros()).append("\n");
        }
        sb.append("- Fecha inicio: ").append(fechaInicio.toString()).append("\n");
        sb.append("- Fecha fin: ").append(fechaFinal.toString()).append("\n");
        sb.append("- Precio alquiler: ").append(precioAlquiler).append("\n");
        for (Carro carro : carros) {
            sb.append("- Litros gasolina: ").append(carro.getLitrosGasolina()).append("\n");
        }
        sb.append("- Precio total: ").append(precioTotal).append("\n");
        sb.append("- Entregado: ").append(entregado).append("\n");
        return sb.toString();
    }
    // getters y setters para todos los atributos

    public ArrayList<Cliente> getCliente() {
        return clientes;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.clientes = cliente;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
   
    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

}
