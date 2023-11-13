package ies.puerto;

/**
 * Clase creada para calificar la nota que ha tenido un estudiante.
 * @author ElliotDAM
 */
public class Ejercicio3{

    /**
     * Metodo con if/else que determina la anotacion de la nota de un estudiante.
     * @param nota
     * @return criterio de calificacion
     */
    public String determinacionNotasIf(double nota){

        String resultado = "";
        if (nota <= 4.99){
            resultado = "Suspenso";
        } else if (nota < 6 && nota >= 5){
            resultado = "Aprobado";
        } else if (nota < 7 && nota >= 6){
            resultado = "Bien";
        } else if (nota < 8.99 && nota >= 7){
            resultado = "Notable";
        } else if( nota < 9.99 && nota >= 9){
            resultado = "Sobresaliente";
        } else if (nota == 10){
            resultado = "Matricula";
        }
        return resultado;

    }

    /**
     * Metodo en switch para determinar la calificacion de la nota de un estudiante.
     * @param nota
     */
    public void determinacionNotasSwitch(float nota){

        String resultado = "";

        int enteroNota = (int) nota;

        switch(enteroNota){

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                    resultado = "Suspendido";
                    break;
            case 5:
                    resultado = "Aprobado";
                    break;
            case 6:
                    resultado = "Bien";
                    break;
            case 7:
            case 8:
                    resultado = "Notable";
                    break;
            case 9:
                    resultado = "Sobresaliente";
                    break;
            case 10:
                    resultado = "Matricula";
                    break;
            default:
                    resultado = "La nota no corresponde al criterio de calificacion.";
                    break;

        }
    }
}