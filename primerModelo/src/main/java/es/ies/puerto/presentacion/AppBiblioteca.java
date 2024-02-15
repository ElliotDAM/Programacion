package es.ies.puerto.presentacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppBiblioteca {
    public static void main(String[] args) {
        List<Articulo> alimentos = lecturaAlimentos("src/main/resources/alimentos.csv");
        System.out.println(alimentos);
        List<Articulo> aparatos = lecturaAparatos("src/main/resources/aparatos.csv");
        //lectura("src/main/resources/cuidado-personal.csv");
        //lectura("src/main/resources/souvenirs.csv");
    }


    public static List<Articulo> lecturaAlimentos(String path) {
        List<Articulo> articulos = new ArrayList<>();
            File fichero = new File(path);
            if (fichero.exists() && fichero.isFile()) {
                try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                    String linea;
                    int i = 0;
                    while ((linea = br.readLine()) != null) {
                        if (i>0){
                            String[] alimentoArray = linea.split(",");
                            Alimento alimento = new Alimento(alimentoArray[3], alimentoArray[0], Float.parseFloat(alimentoArray[1]), alimentoArray[2], alimentoArray[4]);
                            articulos.add(alimento);
                        }
                        i++;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("El fichero no existe o no es un fichero válido.");
            }
            return articulos;
        }

        public static List<Articulo> lecturaAparatos(String path) {
        List<Articulo> articulos = new ArrayList<>();
            File fichero = new File(path);
            if (fichero.exists() && fichero.isFile()) {
                try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                    String linea;
                    int i = 0;
                    while ((linea = br.readLine()) != null) {
                        if (i>0){
                            String[] aparatoArray = linea.split(",");
                            Aparato aparato = new Aparato(aparatoArray[3], aparatoArray[0], Float.parseFloat(aparatoArray[1]), aparatoArray[2], null);
                            articulos.add(aparato);
                            System.out.println(linea);
                        }
                        i++;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("El fichero no existe o no es un fichero válido.");
            }
            return articulos;
        }

        public static List<Articulo> lectura(String path, String articulo) {
        List<Articulo> articulos = new ArrayList<>();
            File fichero = new File(path);
            if (fichero.exists() && fichero.isFile()) {
                try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                    String linea;
                    int i = 0;
                    while ((linea = br.readLine()) != null) {
                        if (i>0){
                            switch (articulo) {
                                case "alimento":
                                    break;
                                case "aparato":
                                    break;
                                default://mostrar error
                                    break;
                            }
                            String[] alimentoArray = linea.split(",");
                            Alimento alimento = new Alimento(alimentoArray[3], alimentoArray[0], Float.parseFloat(alimentoArray[1]), alimentoArray[2], alimentoArray[4]);
                            articulos.add(alimento);
                            System.out.println(linea);
                        }
                        i++;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("El fichero no existe o no es un fichero válido.");
            }
            return articulos;
        }
}
