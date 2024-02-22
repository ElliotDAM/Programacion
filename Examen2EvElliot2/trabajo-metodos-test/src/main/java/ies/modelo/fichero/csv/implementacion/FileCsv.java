package ies.modelo.fichero.csv.implementacion;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ies.modelo.entity.Alimento;
import ies.modelo.entity.Aparato;
import ies.modelo.entity.CuidadoPersonal;
import ies.modelo.fichero.abstractas.FicheroAbstract;
import ies.modelo.fichero.interfaz.IFileInterface;
import ies.modelo.entity.Articulo;

public class FileCsv extends FicheroAbstract implements IFileInterface {

    public FileCsv() {
        FICHERO_ALIMENTOS = "src/main/resources/alimentos.csv";
        FICHERO_APARATOS = "src/main/resources/aparatos.csv";
        FICHERO_SOUVENIRS = "src/main/resources/souvenirs.csv";
        FICHERO_CUIDADO_PERSONAL = "src/main/resources/cuidado-personal.csv";

    }

    public List<Articulo> obtenerAlimentos(){
        return lectura(FICHERO_ALIMENTOS,"alimento");
    }

    public List<Articulo> obtenerAparatos(){
        return lectura(FICHERO_APARATOS,"aparato");
    }

    public List<Articulo> obtenerSouvenirs(){
        return lectura(FICHERO_SOUVENIRS,"souvernir");
    }

    public List<Articulo> obtenerCuidados(){
        return lectura(FICHERO_CUIDADO_PERSONAL,"cuidado");
    }

    @Override
    public List<Articulo> lectura(String path, String articulo) {
        List<Articulo> articulos = new ArrayList<>();
        if (existeFichero(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i>0) {
                        String[] arrayElemento = linea.split(",");
                        switch (articulo) {
                            case "alimento":
                                articulos.add(splitToAlimento(arrayElemento));
                                break;
                            case "cuidado":
                                articulos.add(splitToCuidadoPersonal(arrayElemento));
                                break;
                            default:
                                articulos.add(splitToDefault(arrayElemento));
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

    @Override
    public boolean escritura(String path, String contenido) {
        return almacenarEnFichero(path, contenido);
    }

    private Alimento splitToAlimento(String[] splitArray){
        Alimento alimento = new Alimento(splitArray[3],
               Float.parseFloat(splitArray[1]), splitArray[0],
                splitArray[4], splitArray[2]);
        return alimento;
    }
    private Aparato splitToDefault(String[] splitArray) {
        Aparato aparato = new Aparato(splitArray[3],
                 Float.parseFloat(splitArray[1]), splitArray[0], 
                 splitArray[2]);
        return aparato;
    }
    private CuidadoPersonal splitToCuidadoPersonal(String[] splitArray) {
        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal(splitArray[3],
                Float.parseFloat(splitArray[1]), splitArray[0],
                splitArray[2], Integer.parseInt(splitArray[4]));
        return cuidadoPersonal;
    }
}
