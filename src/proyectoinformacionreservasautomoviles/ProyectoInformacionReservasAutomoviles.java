/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoinformacionreservasautomoviles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class ProyectoInformacionReservasAutomoviles {

    private static final ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static final ArrayList<Carro> listaCarros = new ArrayList<>();
    private static final ArrayList<Agencia> listaAgencias = new ArrayList<>();
    private static final ArrayList<Garaje> listaGarajes = new ArrayList<>();

    public static void main(String[] args) {

        // Crear algunos clientes
        Cliente cliente1 = new Cliente("11111111", "Juan Perez", "Calle Mayor 1", "555111222", 123);
        Cliente cliente2 = new Cliente("22222222B", "Maria Lopez", "Calle Principal 2", "555333444", 234);
        Cliente cliente3 = new Cliente("33333333C", "Pedro Martinez", "Calle Secundaria 3", "555555666", 345);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        // Asignar aval a cliente2
        cliente1.setAvaladoPor(cliente2);
        // Crear carros
        Carro carro1 = new Carro("1234ABC", "Sedan", "Rojo", "Toyota", 5.1, new Garaje(1, 3));
        Carro carro2 = new Carro("5678DEF", "SUV", "Azul", "Ford", 6.1, new Garaje(1, 2));
        Carro carro3 = new Carro("9012GHI", "Deportivo", "Negro", "Ferrari", 8.5, new Garaje(1, 1));

        // Crear agencia
        //ArrayList<Agencia> agencias = new ArrayList<Agencia>();
        listaAgencias.add(new Agencia("Agencia 1", "calle1", "f"));
        listaAgencias.add(new Agencia("Agencia 2", "calle1", "s"));
        Agencia agencia1 = listaAgencias.get(0);
        Agencia agencia2 = listaAgencias.get(1);

        //Crear garajes
        listaGarajes.add(new Garaje(525, 3));

        // Crear reservas
        //ArrayList<Carro> carrosReserva1 = new ArrayList<>();
        listaCarros.add(carro1);
        listaCarros.add(carro2);
        Reserva reserva1 = new Reserva(listaClientes, listaCarros, listaAgencias, listaGarajes, new Date(), new Date(), 50.0, 200.0, false);

        //ArrayList<Carro> carrosReserva2 = new ArrayList<>();
        //carrosReserva2.add(carro3);
        //Reserva reserva2 = new Reserva(cliente2, carrosReserva2, agencia2, new Date(), new Date(), 80.0, 15.0, 150.0, false);
        //ArrayList<Carro> carrosReserva3 = new ArrayList<>();
        //carrosReserva3.add(carro1);
        //Reserva reserva3 = new Reserva(cliente3, carrosReserva3, agencia1, new Date(), new Date(), 60.0, 25.0, 300.0, false);
        // Imprimir información de las reservas
        //System.out.println(reserva1.toString());
        //System.out.println(reserva2.toString());
        //System.out.println(reserva3.toString());
        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "SISTEMA DE RESERVAS DE CARROS 2023\n"
                    + "Seleccione una opción:\n"
                    + "1. Registrar Cliente.\n"
                    + "2. Registrar reserva.\n"
                    + "3. Registrar carro.\n"
                    + "4. Registrar agencia.\n"
                    + "5. Registrar garaje\n"
                    + "6. Disponibilidades\n"
                    + "7. Consultar cliente.\n"
                    + "8. Salir."));

            switch (opcion) {
                case 1:
                    registrarClientes();
                    break;
                case 2:
                    /*
                    String dni = JOptionPane.showInputDialog(null, "Ingrese n° identificación:");
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese Nombre:");
                    String direccion = JOptionPane.showInputDialog(null, "Direccion:");
                    String telefono = JOptionPane.showInputDialog(null, "Telefono:");
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo:"));
                    //String avaladoPor = JOptionPane.showInputDialog(null, "Nombre de avalado:");
                    Cliente nuevaParticipante = new Cliente(dni, nombre, direccion, telefono, codigo);
                    listaClientes.add(nuevaParticipante);
                    //JOptionPane.showMessageDialog(null, "Reina más alta:\n" + puntajeMayorReina.toString());
                     */
                    break;
                case 3:
                    registrarCarros();
                    break;

                case 4:
                    registrarAgencias();

                    break;

                case 5:
                    registrarGarajes();

                    break;

                case 6:

                    while (true) {
                        int opciones = Integer.parseInt(JOptionPane.showInputDialog(
                                "Disponibilidades 2023\n"
                                + "Seleccione una opción:\n"
                                + "1. Disponibilidad clientes:\n"
                                + "2. Disponibilidad de carros:\n"
                                + "3. Disponibilidad de garajes: \n"
                                + "4. Disponibilidad de agencias: \n"
                                + "5. Salir."));

                        switch (opciones) {
                            case 1:
                                String listadoCliente = "Disponibilidad clientes:\n";
                                Iterator<Cliente> iterador = listaClientes.iterator();

                                while (iterador.hasNext()) {
                                    Cliente d = iterador.next();
                                    listadoCliente += "-DNI: " + d.getDNI()
                                            + "\n" + " -Nombre: " + d.getNombre()
                                            + "\n" + " -Código: " + d.getCodigo() + "\n" + "\n";
                                }
                                //System.out.println(reserva1.toString());
                                JOptionPane.showMessageDialog(null, "Datos de clientes:\n" + listadoCliente);
                                break;

                            case 2:
                                String listadoCarro = "Disponibilidad carros:\n";
                                Iterator<Carro> iteradorCarro = listaCarros.iterator();

                                while (iteradorCarro.hasNext()) {
                                    Carro d = iteradorCarro.next();
                                    listadoCarro += "-Matricula: "
                                            + d.getMatricula() + "\n"
                                            + " -Marca: " + d.getMarca() + "\n"
                                            + " -Modelo: " + d.getModelo() + "\n"
                                            + " -Listros gasolina: " + d.getLitrosGasolina() + "\n" + "\n";
                                }
                                //System.out.println(reserva1.toString());
                                JOptionPane.showMessageDialog(null, "Datos del carro:\n" + listadoCarro);
                                break;

                            case 3:
                                String listadoGaraje = "Disponibilidad garajes:\n";
                                Iterator<Garaje> iteradorGaraje = listaGarajes.iterator();

                                while (iteradorGaraje.hasNext()) {
                                    Garaje d = iteradorGaraje.next();
                                    listadoGaraje += "-Id Garaje: " + d.getIdGaraje() + "\n"
                                            + " -Capacidad maxima: " + d.getCantMaxCarros() + "\n" + "\n";
                                }
                                //System.out.println(reserva1.toString());
                                JOptionPane.showMessageDialog(null, "Datos del garaje:\n" + listadoGaraje);
                                break;

                            case 4:
                                String listadoAgencia = "Disponibilidad agencias:\n";
                                Iterator<Agencia> iteradorAgencia = listaAgencias.iterator();

                                while (iteradorAgencia.hasNext()) {
                                    Agencia d = iteradorAgencia.next();
                                    listadoAgencia += "-Nombre: " + d.getNombre() + "\n"
                                            + " -Direccion: " + d.getDireccion() + "\n" + "\n";
                                }
                                //System.out.println(reserva1.toString());
                                JOptionPane.showMessageDialog(null, "Datos de la agencia:\n" + listadoAgencia);
                                break;

                            case 5:
                                JOptionPane.showMessageDialog(null, "Hasta luego!");
                                return;

                            default:
                                JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");

                        }
                        break;
                    }
                    break;
                case 7:
                    //System.out.println(reserva1.toString());
                    //JOptionPane.showMessageDialog(null, "Datos de la reserva:\n" + reserva1.toString());
                    registrarReserva();
                    //JOptionPane.showMessageDialog(null, "Puntajes de los participantes:\n" + listado);
                    break;

                case 8:
                    JOptionPane.showMessageDialog(null, "Hasta luego!");
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        }
    }

    private static void registrarReserva() {

        int cantidadElementos = listaCarros.size();
        if (listaCarros.size() > 2) {
            JOptionPane.showMessageDialog(null, "La cantidad maxima superada: " + cantidadElementos);
        }
// Obtener el cliente correspondiente de la lista de clientes
        Cliente cliente = listaClientes.get(0); // por ejemplo, obtener el primer cliente en la lista
    }

    private static void registrarClientes() {
        String dni = JOptionPane.showInputDialog(null, "Ingrese n° identificación:");
        String nombre = JOptionPane.showInputDialog(null, "Ingrese Nombre:");
        String direccion = JOptionPane.showInputDialog(null, "Direccion:");
        String telefono = JOptionPane.showInputDialog(null, "Telefono:");
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo:"));
        //String avaladoPor = JOptionPane.showInputDialog(null, "Nombre de avalado:");
        Cliente nuevoCliente = new Cliente(dni, nombre, direccion, telefono, codigo);
        listaClientes.add(nuevoCliente);
        int cantidadElementos = listaClientes.size();
        JOptionPane.showMessageDialog(null, "La cantidad de clientes es: " + cantidadElementos);
    }

    private static void registrarCarros() {
        String matricula = JOptionPane.showInputDialog(null, "Ingrese matricula:");
        String modelo = JOptionPane.showInputDialog(null, "Ingrese modelo:");
        String color = JOptionPane.showInputDialog(null, "Color:");
        String marca = JOptionPane.showInputDialog(null, "Marca:");
        //int garaje = Integer.parseInt(JOptionPane.showInputDialog(null, "Garaje:"));
        Carro nuevoCarro = new Carro(matricula, modelo, color, marca, 5, new Garaje(2, 1));
        listaCarros.add(nuevoCarro);
        int cantidadElementos = listaCarros.size();
        JOptionPane.showMessageDialog(null, "La cantidad de clientes es: " + cantidadElementos);
    }

    private static void registrarAgencias() {
        String nombreAgencia = JOptionPane.showInputDialog(null, "Ingrese nombre agencia:");
        String direccionAgencia = JOptionPane.showInputDialog(null, "Ingrese direccion de agencia:");
        Agencia nuevaAgencia = new Agencia(nombreAgencia, direccionAgencia, "sd");
        listaAgencias.add(nuevaAgencia);
        int cantidadElementos = listaAgencias.size();
        JOptionPane.showMessageDialog(null, "La cantidad de agencias es: " + cantidadElementos);
    }

    private static void registrarGarajes() {
        int idGaraje = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo:"));
        int cantMaxCarros = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad Maxima de vehiculos:"));
        Garaje nuevoGaraje = new Garaje(idGaraje, cantMaxCarros);
        listaGarajes.add(nuevoGaraje);
        int cantidadElementos = listaGarajes.size();
        JOptionPane.showMessageDialog(null, "La cantidad de garajes es: " + cantidadElementos);
    }
}
