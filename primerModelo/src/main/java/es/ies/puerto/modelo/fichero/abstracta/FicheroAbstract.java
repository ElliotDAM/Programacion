package es.ies.puerto.modelo.fichero.abstracta;

import java.io.File;

public abstract class FicheroAbstract {

     public boolean existeFichero(String path) {
    if (path == null || path.isEmpty()) {
        return false;
        }
    File fichero = new File(path);
    return fichero.exists() && fichero.isFile();
    }

    
}
