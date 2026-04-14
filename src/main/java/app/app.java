package app;

import entidades.Cliente;
import servicios.EstadoReserva;
import servicios.Reserva;

import java.time.LocalDate;
import java.time.LocalTime;

public class app {
    static void main() {

        Cliente cli1 = new Cliente("1234","Juan","677534579","@juar@gmail.com","Cazorla");
        Cliente cli2 = new Cliente("5678","María","612345678","maria.lopez@gmail.com","Sevilla");
        Cliente cli3 = new Cliente("9101","Carlos","698765432","carlos.perez@yahoo.com","Granada");
        Cliente cli4 = new Cliente("1121","Lucía","655443322","lucia.garcia@hotmail.com","Jaén");
        Cliente cli5 = new Cliente("3141","Antonio","677889900","antonio.ruiz@gmail.com","Córdoba");
        Cliente cli6 = new Cliente("5161","Elena","600112233","elena.martin@gmail.com","Málaga");
        Cliente cli7 = new Cliente("7181","Pedro","644556677","pedro.sanchez@yahoo.com","Almería");

        Reserva res1 = new Reserva(LocalDate.of(2025,4,2),"Dentro", EstadoReserva.PENDIENTE,
                120.0,5, LocalTime.of(14,0),cli1);
        Reserva res2 = new Reserva(LocalDate.of(2025,4,3),"Fuera", EstadoReserva.CONFIRMADA,
                80.0,2, LocalTime.of(13,30),cli2);
        Reserva res3 = new Reserva(LocalDate.of(2025,4,4),"Dentro", EstadoReserva.CANCELADA,
                150.0,6, LocalTime.of(15,0),cli3);
        Reserva res4 = new Reserva(LocalDate.of(2025,4,5),"Terraza", EstadoReserva.PENDIENTE,
                60.0,2, LocalTime.of(12,45),cli4);
        Reserva res5 = new Reserva(LocalDate.of(2025,4,6),"Dentro", EstadoReserva.CONFIRMADA,
                200.0,8, LocalTime.of(14,30),cli5);
        Reserva res6 = new Reserva(LocalDate.of(2025,4,7),"Fuera", EstadoReserva.PENDIENTE,
                90.0,3, LocalTime.of(13,15),cli1);
        Reserva res7 = new Reserva(LocalDate.of(2025,4,8),"Dentro", EstadoReserva.CONFIRMADA,
                110.0,4, LocalTime.of(15,30),cli2);
        Reserva res8 = new Reserva(LocalDate.of(2025,4,9),"Terraza", EstadoReserva.CANCELADA,
                70.0,2, LocalTime.of(12,30),cli3);
        Reserva res9 = new Reserva(LocalDate.of(2025,4,10),"Dentro", EstadoReserva.PENDIENTE,
                130.0,5, LocalTime.of(14,15),cli4);
        Reserva res10 = new Reserva(LocalDate.of(2025,4,11),"Fuera", EstadoReserva.CONFIRMADA,
                95.0,3, LocalTime.of(13,0),cli5);
        Reserva res11 = new Reserva(LocalDate.of(2025,4,12),"Dentro", EstadoReserva.CANCELADA,
                160.0,6, LocalTime.of(15,45),cli1);
        Reserva res12 = new Reserva(LocalDate.of(2025,4,13),"Terraza", EstadoReserva.PENDIENTE,
                75.0,2, LocalTime.of(12,15),cli2);
        Reserva res13 = new Reserva(LocalDate.of(2025,4,14),"Dentro", EstadoReserva.CONFIRMADA,
                140.0,5, LocalTime.of(14,0),cli3);
        Reserva res14 = new Reserva(LocalDate.of(2025,4,15),"Fuera", EstadoReserva.CANCELADA,
                85.0,3, LocalTime.of(13,45),cli4);
        Reserva res15 = new Reserva(LocalDate.of(2025,4,16),"Terraza", EstadoReserva.CONFIRMADA,
                100.0,4, LocalTime.of(15,15),cli5);










    }
}
