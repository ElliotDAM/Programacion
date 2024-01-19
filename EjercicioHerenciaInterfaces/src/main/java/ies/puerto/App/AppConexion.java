package ies.puerto.App;

import ies.puerto.abstracto.ConexionRedAbstract;
import ies.puerto.impl.ConexionEthernet;
import ies.puerto.impl.ConexionWifi;

public class AppConexion {
    static ConexionRedAbstract conexionWifi;
    static ConexionRedAbstract conexionEthernet;
    public static void main(String[] args) {
        conexionWifi = new ConexionWifi();
        conexionEthernet = new ConexionEthernet();
        System.out.println(conexionEthernet.conectar());
        System.out.println(conexionWifi.conectar());
    }
}
