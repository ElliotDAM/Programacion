import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Crea una aplicacion en Java para gestionar eventos.
 * @author ElliotDAM
 */
public class Evento {
    
    private String nombre;
    private String fecha;

    public Evento(){}

    public Evento(String fecha){
        this.fecha = fecha;
        DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaIntroducida = formatoFecha.parse(fecha);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaIntroducida);
        calendar.add(Calendar.MONTH, 1);

        this.fecha = formatoFecha.format(calendar.getTime());
    }

    public Evento(String nombre, String fecha){
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String informacion(String fecha){
        DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaEvento = Calendar.getInstance();
        fechaEvento.setTime(formatoFecha.parse(fecha));

        double diferenciaMils = fechaEvento.getTimeInMillis() - fechaActual.getTimeInMillis();
        int diferenciaDias = (diferenciaMils / (24 * 60 * 60 * 1000));

        String informacionEvento = "Nombre: "+nombre+", Fecha: "+formatoFecha.format(fechaEvento.getTime());
        if(diferenciaDias <= 30 && diferenciaDias >= 0){
            informacionEvento = informacionEvento + "Queda menos de un mes para el evento.";
        }

        return informacionEvento;
    }

    public String estaProximo(){
        DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaEvento = Calendar.getInstance();
        fechaEvento.setTime(formatoFecha.parse(this.fecha));

        double diferenciaMils = fechaEvento.getTimeInMillis() - fechaActual.getTimeInMillis();
        int diferenciaDias = (diferenciaMils / (24 * 60 * 60 * 1000));
        String info = "";
        if(diferenciaDias <= 7 && diferenciaDias >= 0){
            info = "El evento esta proximo. Quedan "+diferenciaDias+" dias o menos.";
        }else{
            info = "El evento no esta proximo.";
        }
        return info;
        

    }

}
