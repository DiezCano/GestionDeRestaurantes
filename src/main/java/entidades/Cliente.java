package entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Cliente {

    private String dni;
    private String Nombre;
    private String Telefono;
    private String email;
    private String ciudad;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("DNI: ").append(dni);
        sb.append(" | Nombre: ").append(Nombre);
        sb.append(" | ").append(email);
        sb.append(" | ").append(Telefono);
        sb.append(" | ").append(ciudad);
        return sb.toString();
    }


}
