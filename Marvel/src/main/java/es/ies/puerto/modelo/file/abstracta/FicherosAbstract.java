package es.ies.puerto.modelo.file.abstracta;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import es.ies.puerto.modelo.file.interfaz.IFicheros;

public abstract class FicherosAbstract implements IFicheros {
    public static final String csvPath="src/main/resources/data.csv";
    public static final String xmlPath="src/main/resources/data.xml";
    public static final String jsonPath="src/main/resources/data.json";
    public static final String DELIMITADOR=",";


    @Override
    public boolean existe(String path){
        if (path.isEmpty()) {
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isFile();
    }

    @Override
    public boolean eliminar(String path){
        if (existe(path)) {
            File file = new File(path);
            try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
                byte[] vacio = {};
                fileOutputStream.write(vacio);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
