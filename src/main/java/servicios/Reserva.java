package servicios;

import entidades.Cliente;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class Reserva {

    private Long id;
    private Cliente cliente;
    private LocalDate fecha;
    private LocalTime hora;
    private int numpersonas;
    private double importePrevisto;
    private EstadoReserva estado;
    private String zona;

    public Reserva(LocalDate fecha, String zona, EstadoReserva estado, double importePrevisto, int numpersonas, LocalTime hora, Cliente cliente) {
        this.fecha = fecha;
        this.zona = zona;
        this.estado = estado;
        this.importePrevisto = importePrevisto;
        this.numpersonas = numpersonas;
        this.hora = hora;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("ID: ").append(id);
        sb.append(" | Cliente: ").append(cliente);
        sb.append(" | Fecha: ").append(fecha);
        sb.append(" | Hora: ").append(hora);
        sb.append(" | Personas: ").append(numpersonas);
        sb.append(" | Importe: ").append(importePrevisto).append("€");
        sb.append(" | Estado: ").append(estado);
        sb.append(" | Zona: ").append(zona);
        return sb.toString();
    }

}
