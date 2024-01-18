package main.java.ies.puerto.impl;

public class LecturaDatosFichero implements ILecturaDatos{

    @Override
    public String lectura(){
        return "Realizada la lectura de datos desde fichero";
    }

    @Override
    public String apertura(){
        return "Realizada la apertura desde fichero";
    }

    @Override
    public String cierre(){
        return "Cierre desde fichero";
    }
}
