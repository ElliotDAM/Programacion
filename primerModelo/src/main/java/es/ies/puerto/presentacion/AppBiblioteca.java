package es.ies.puerto.presentacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import es.ies.puerto.modelo.entity.Alimento;
import es.ies.puerto.modelo.entity.Aparato;
import es.ies.puerto.modelo.entity.Articulo;
import es.ies.puerto.modelo.entity.Cuidadopersonal;

public class AppBiblioteca {
    public static void main(String[] args) {
        List<Articulo> alimentos = lectura("src/main/resources/alimentos.csv", "alimento");
        System.out.println(alimentos);
        List<Articulo> aparatos = lectura("src/main/resources/aparatos.csv", "aparato");
        System.out.println(aparatos);
        List<Articulo> souvenirs = lectura("src/main/resources/souvenirs.csv", "souvenirs");
        System.out.println(souvenirs);
        List<Articulo> cuidados = lectura("src/main/resources/cuidado-personal.csv", "cuidado personal");
    }

/** 
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
        */
/** 
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
*/
        public static List<Articulo> lectura(String path, String articulo) {
        List<Articulo> articulos = new ArrayList<>();
            File fichero = new File(path);
            if (fichero.exists() && fichero.isFile()) {
                try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                    String linea;
                    int i = 0;
                    while ((linea = br.readLine()) != null) {
                        if (i>0){
                            String[] splitArray = linea.split(",");
                            switch (articulo) {
                                case "alimento":
                                    articulos.add(splitToAlimento(splitArray));
                                    break;
                                case "aparato":
                                    articulos.add(splitToAparato(splitArray));
                                    break;
                                default://mostrar error
                                    break;
                            }
                            
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

        private static Alimento splitToAlimento(String[] splitArray){
            Alimento alimento = new Alimento(splitArray[3], splitArray[0], Float.parseFloat(splitArray[1]), splitArray[2], splitArray[4]);
            return alimento;
        }

        private static Aparato splitToAparato(String[] splitArray){
            Aparato aparato = new Aparato(splitArray[3], splitArray[0], Float.parseFloat(splitArray[1]), splitArray[2], null);

            return aparato;
        }

        private static Cuidadopersonal splitToCuidadopersonal(String[] splitArray){
            Cuidadopersonal cuidado = new Cuidadopersonal(null, null, 0, null, 0);
            return cuidado;
        }



        
}
