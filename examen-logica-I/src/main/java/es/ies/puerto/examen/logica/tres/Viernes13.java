package es.ies.puerto.examen.logica.tres;

import java.util.Calendar;
import java.util.Date;

public class Viernes13 {
    public boolean esElFinDelMundo(Date fecha) {
        // Crear un objeto de Calendar y establecer la fecha dada
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fecha);
        
        // Obtener el día del mes y el día de la semana
        int diaMes = calendario.get(Calendar.DAY_OF_MONTH);
        int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);
        
        // Verificar si el día es el 13 y si el día de la semana es viernes (valor 6 en Calendar)
        if (diaMes == 13 && diaSemana == Calendar.FRIDAY) {
            return true; // ¡Es el Día del Caos!
        } else {
            return false; // No es el Día del Caos
        }
    }
}
