package ies.puerto.App;

import ies.puerto.abstracto.ConexionRedAbstract;
import ies.puerto.impl.ConexionWifi;

public class AppConexion {
    static ConexionRedAbstract conexion;
    public static void main(String[] args) {
        conexion = new ConexionWifi();
    }
}
