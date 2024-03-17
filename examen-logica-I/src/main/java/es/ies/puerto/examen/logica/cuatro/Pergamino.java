package es.ies.puerto.examen.logica.cuatro;

public class Pergamino {

    Pergamino() {

    }

    Object[] analizador(String texto) {
        // Dividir el texto en palabras y oraciones
        String[] palabras = texto.split("[\\s\\p{Punct}]+");
        String[] oraciones = texto.split("[.!?]");

        // Inicializar variables para el análisis
        int totalPalabras = palabras.length;
        int totalLetras = 0;
        int totalOraciones = oraciones.length;
        String palabraMasLarga = "";

        // Calcular la longitud total de todas las palabras y encontrar la palabra más larga
        for (String palabra : palabras) {
            totalLetras += palabra.length();
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }

        // Calcular la longitud media de las palabras
        double longitudMediaPalabras = (double) totalLetras / totalPalabras;

        // Crear un array con los resultados
        Object[] resultado = {totalPalabras, longitudMediaPalabras, totalOraciones, palabraMasLarga};
        
        return resultado;
    }
}

