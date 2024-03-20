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

public class ModeloCsv extends FicherosAbstract{
    private int columnaNombre = 0;
    private int columnaAlias = 1;
    private int columnaGenero = 2;
    private int columnaPoderes = 3;

    @Override
    public List<Personaje> leer() {
        List<Personaje> personajes = new ArrayList<>();
        if(existe(csvPath)){
            File file = new File(csvPath);
            try (BufferedReader br = new BufferedReader(new FileReader(file))){
                String linea;
                while((linea = br.readLine()) != null){
                    String[] datos = linea.split(DELIMITADOR);
                    List<String> poderes = new ArrayList<>();
                    poderes.addAll(Arrays.asList(Arrays.copyOfRange(datos, columnaPoderes, datos.length)));
                    Personaje nuevoPersonaje = new Personaje(datos[columnaNombre], datos[columnaAlias], datos[columnaGenero], poderes);
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
        return eliminar(csvPath) && escribir(personajes);
    }
    @Override
    public boolean escribir(List<Personaje> personajes) {
        if(existe(csvPath)){
            File file = new File(csvPath);
            try (BufferedWriter buffer = new BufferedWriter(new FileWriter(file))){
                buffer.write(toFile(personajes));
                return true;
                
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean modificar(List<Personaje> personajes) {
       return actualizar(personajes);
    }

    public String toFile(List<Personaje> personas) {
        if (personas.isEmpty()) {
            return null;
        }
        StringBuilder contenidoBuilder = new StringBuilder();
        for (Personaje persona : personas) {
            contenidoBuilder.append(persona.toCsv()).append("\n");
        }
        return contenidoBuilder.toString();
    }


}
