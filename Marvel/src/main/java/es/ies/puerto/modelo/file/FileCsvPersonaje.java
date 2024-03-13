package main.java.es.ies.puerto.modelo.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import main.java.es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import main.java.es.ies.puerto.modelo.Personaje;

public class FileCsvPersonaje extends UtilidadesClass implements ICrudOperaciones {
    
    @Element(name = "personajes") 
    List<Personaje> personajes;
    String path = "src/main/resources/data.csv";

    
    public List<Personaje> obtenerPersonajes(){
        List<Personaje> personajes = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String linea;
            while((linea = br.readLine()) != null){
                String[] datos = linea.split(DELIMITADOR);
                String nombre = datos[0];
                String alias = datos[1];
                String genero = datos[2];
                List<String> poderes = new ArrayList<>();
                for (int i = 3; i < datos.length; i++) {
                    poderes.add(datos[i]);
                }
                Personaje personaje = new Personaje(nombre, alias, genero, poderes);
                personajes.add(personaje);
            }
            }catch(IOException ioException){
                e.printStackTrace();
            }
            return personajes;
        
    }

    public Personaje obtenerPersonaje(Personaje personaje){
        boolean encontrado = false;
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String linea;
            while(((linea = br.readLine()) != null) && !encontrado){
                String[] datos = linea.split(DELIMITADOR);
                String nombre = datos[0];
                if(nombre = personaje.getNombre()){
                    String alias = datos[1];
                    String genero = datos[2];
                    List<String> poderes = new ArrayList<>();
                    for (int i = 3; i < datos.length; i++) {
                        poderes.get(datos[i]);
                    }
                    encontrado = true;
                }
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return personaje;
    }

    public void addPersonaje(Personaje personaje){
        Personaje personajeBuscado = new Personaje(personaje.getNombre());
        personajeBuscado = obtenerPersonaje(personajeBuscado);
        /** 
        if(personajes.contains(personaje)){
            return;
        }
        */
        try (FileWriter writer = new FileWriter(path, true)){
            writer.write(personaje.toCsv()+"\n");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void deletePersonaje(Personaje personaje){
        Personaje personaBuscar = new Personaje(personaje.getNombre());
        List<Personaje> personajes = obtenerPersonajes();
        personajes.remove(personaje);

        try (FileWriter writer = new FileWriter(path)){
            for (Personaje personajeCsv : personajes) {
                writer.write(personaCsv.toCsv() + "\n");
                }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void updatePersonaje(Personaje personaje){
        List<Personaje> personajes = obtenerPersonajes();
        try (FileWriter writer = new FileWriter(path)){
            for (Personaje personajeCsv : personajes) {
                if(personajesCsv.equals(personaje)){
                    writer.write(personaje.toCsv() + "\n");
                }else{
                    writer.write(personajeCsv.toCsv() + "\n");
                    }
                }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    }
