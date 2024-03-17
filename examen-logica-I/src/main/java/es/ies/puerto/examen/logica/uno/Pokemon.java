package es.ies.puerto.examen.logica.uno;

import java.util.HashMap;
import java.util.Map;

public class Pokemon {

    private final Map<String, Map<String, Float>> efectividad;

    public Pokemon() {
        // Inicializar la tabla de efectividad
        efectividad = new HashMap<>();
        efectividad.put("Agua", new HashMap<>());
        efectividad.put("Fuego", new HashMap<>());
        efectividad.put("Planta", new HashMap<>());
        efectividad.put("Eléctrico", new HashMap<>());

        // Llenar la tabla de efectividad
        efectividad.get("Agua").put("Agua", 0.5f);
        efectividad.get("Agua").put("Fuego", 2f);
        efectividad.get("Agua").put("Planta", 0.5f);
        efectividad.get("Agua").put("Eléctrico", 1f);

        efectividad.get("Fuego").put("Agua", 2f);
        efectividad.get("Fuego").put("Fuego", 0.5f);
        efectividad.get("Fuego").put("Planta", 0.5f);
        efectividad.get("Fuego").put("Eléctrico", 1f);

        efectividad.get("Planta").put("Agua", 0.5f);
        efectividad.get("Planta").put("Fuego", 2f);
        efectividad.get("Planta").put("Planta", 0.5f);
        efectividad.get("Planta").put("Eléctrico", 1f);

        efectividad.get("Eléctrico").put("Agua", 1f);
        efectividad.get("Eléctrico").put("Fuego", 1f);
        efectividad.get("Eléctrico").put("Planta", 1f);
        efectividad.get("Eléctrico").put("Eléctrico", 0.5f);
    }

    float danio(String tipoAtacante, String tipoDefensor, int ataque, int defensa) {
        // Verificar si el ataque o la defensa exceden el límite
        if (ataque > 100) {
            return -1; // Valor del ataque superior a 100
        }
        if (defensa > 100) {
            return -2; // Valor de la defensa superior a 100
        }

        // Obtener la efectividad del ataque
        float efectividadAtaque = efectividad.get(tipoAtacante).get(tipoDefensor);

        // Calcular el daño
        float danio = 50 * (ataque / defensa) * efectividadAtaque;

        return danio;
    }
}

