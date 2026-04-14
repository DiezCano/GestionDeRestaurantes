package entidades;

import servicios.Reserva;

import java.util.List;

public class Restaurante {

    private String nombre;
    private List<Cliente> clientes;
    private List<Reserva> reservas;

    public Restaurante(String nombre) {
        this.nombre = nombre;
    }

    //---- 1º ----
    public void addCliente(Cliente c) {
        clientes.add(c);
    }
    //---- 2º ----
    public void addReserva(Reserva r) {
        reservas.add(r);
    }
    //---- 3º ----
    public Cliente getClientePorDni(String dni) {
        for (Cliente c : clientes) {
            if (c.getDni().equals(dni)) {
                return c;
            }
        }
        return null;
    }
    //---- 4º ----
    public List<Reserva> getReservas() {
        return reservas;
    }
    //---- 5º ----
    public String toString() {
        String texto = "Clientes:\n";
        for (Cliente c : clientes) {
            texto += c + "\n";
        }

        texto += "Reservas:\n";
        for (Reserva r : reservas) {
            texto += r + "\n";
        }

        return texto;
    }


}
