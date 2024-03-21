package es.ies.puerto.modelo.file.imp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.ies.puerto.modelo.file.abstracta.FicherosAbstract;
import es.ies.puerto.modelo.imp.Personaje;

public class ModeloCsv extends FicherosAbstract {
    private int columnaNombre = 0;
    private int columnaAlias = 1;
    private int columnaGenero = 2;
    private int columnaPoderes = 3;

    @Override
    public List<Personaje> leer() {
        List<Personaje> personajes = new ArrayList<>();
        if (existe(csvPath)) {
            File file = new File(csvPath);
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] datos = linea.split(DELIMITADOR);
                    List<String> poderes = new ArrayList<>();
                    poderes.addAll(Arrays.asList(Arrays.copyOfRange(datos, columnaPoderes, datos.length)));
                    Personaje nuevoPersonaje = new Personaje(datos[columnaNombre], datos[columnaAlias],
                            datos[columnaGenero], poderes);
                    personajes.add(nuevoPersonaje);
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        return personajes;
    }

    @Override
    public boolean actualizar(List<Personaje> personajes) {
        List<Personaje> personajesList = leer();
        if (personajesList.isEmpty()) {
            return false; 
        }

        for (Personaje personaje : personajes) {
            int index = personajesList.indexOf(personaje);
            if (index != -1) {
                personajesList.set(index, personaje);
            }
        }
        return escribir(personajesList);
    }

    @Override
    public boolean escribir(List<Personaje> personajes) {
        if (!existe(csvPath)) {
            return false;
        }
            File file = new File(csvPath);
            try (BufferedWriter buffer = new BufferedWriter(new FileWriter(file))) {
                for (Personaje personaje : personajes) {
                    buffer.write(toFile(personaje) + "\n");
                }

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            return true;
    }

    @Override
    public boolean modificar(List<Personaje> personajes) {
        return actualizar(personajes);
    }

    public String toFile(Personaje persona) {
        StringBuilder contenidoBuilder = new StringBuilder();
        contenidoBuilder.append(persona.getNombre()).append(DELIMITADOR).append(persona.getAlias())
                .append(DELIMITADOR).append(persona.getGenero()).append(DELIMITADOR)
                .append(String.join(DELIMITADOR, persona.getPoderes()));
        return contenidoBuilder.toString();
    }
}
