package ies.puerto;

/**
 * Clase realizada para realizar varios metodos en base a las notas de un alumno contenidas en un array.
 * @author ElliotDAM
 */
public class Ejercicio1{

    public static void main(String[] args) {

    }

    /**
     * Metodo para pedir las notas al usuario
     */
    public void pedirNotas(){
        float[] array = new float[5];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        float temporal;
        do {
            System.out.println("Introduzca el valor" + (i + 1));
            temporal = scanner.nextFloat();
            if((temporal <= 10) && (temporal >= 0)){
                array[i] = temporal;
                i++;
            }
        }while(i < array.length);
        //MAIN?
    }

    /**
     * Metodo para mostrar el array dado.
     * @param notas
     */
    public void mostrarArray(float[] notas){

        for (int i = 0; i < notas.length; i++) {
            System.out.println(nota[i] + ",");
        }
    }

    /**
     * Metodo para calcular la media de los valores de un array.
     * @param notas
     * @return media
     */
    public float calcularMedia(float[] notas){
        float media = 0;
        float suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma = suma + nota[i];
        }

        media = suma / notas.length;

        return media;
    }

    /**
     * Metodo para mostrar la nota mas alta de un alumno en un array.
     * @param notas
     * @return notaAlta del alumno
     */
    public float notaMasAlta(int[] notas){
        float notaAlta = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < notas [i + 1]){
                notaAlta = notas[i+1];
            }
        }
        return notaAlta;
    }

    /**
     * Metodo para mostrar la nota mas baja de un alumno en un array
     * @param notas
     * @return notaBaja del alumno
     */
    public float notaMasBaja(float[] notas ){
        float notaBaja = notas[0];

        for (int i = 0; i < notas.length ; i++) {
            if(nota[i] > nota[i+1]){
                notaBaja = notas[i+1];
            }
        }
        return notaBaja;
    }
}