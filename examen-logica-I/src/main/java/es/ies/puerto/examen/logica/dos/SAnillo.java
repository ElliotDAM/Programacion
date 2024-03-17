package es.ies.puerto.examen.logica.dos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SAnillo {
    private final String fechaEstreno = "17/12/2003";
    private final String formatDate = "dd/MM/yyyy";
    private SimpleDateFormat dateFormat;

    public SAnillo() {
        dateFormat = new SimpleDateFormat(formatDate);
    }

    public int obtenerDiasDesdeRetornoRey(String fecha) {
        // Si no se proporciona una fecha, usamos la fecha actual
        if (fecha == null || fecha.isEmpty()) {
            fecha = dateFormat.format(new Date());
        }

        try {
            // Parsear las fechas
            Date fechaEstrenoDate = dateFormat.parse(fechaEstreno);
            Date fechaUsuarioDate = dateFormat.parse(fecha);

            // Verificar si la fecha proporcionada es posterior a la fecha actual
            if (fechaUsuarioDate.after(new Date())) {
                return -1; // Formato de fecha erróneo o fecha futura
            }

            // Calcular los milisegundos transcurridos
            long diferenciaMillis = fechaUsuarioDate.getTime() - fechaEstrenoDate.getTime();
            // Convertir milisegundos a días
            long diasTranscurridos = diferenciaMillis / (1000 * 60 * 60 * 24);

            return (int) diasTranscurridos;
        } catch (ParseException e) {
            // Si hay un error al parsear la fecha, retornar -1
            return -1; // Formato de fecha erróneo
        }
    }
}
