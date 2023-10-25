package ies.puerto;

public class Ejercicio6 {



    /**
     * Función que verifica si un número es Armstrong
     * @param numero para realizar la verificación
     * @return resultado boolean true/false con la verificación
     */
    public boolean verificaArmstrong(int numero){
        boolean resultado = true;
        int digitos = 0;
        int calculoDigitos = numero;

        while(calculoDigitos > 0){
            calculoDigitos = calculoDigitos / 10;
            digitos++;
        }

        int resto = 0;
        calculoDigitos = numero;
        int suma = 0;
        int digito = 0;
        while ( digito > 0){
            resto =  calculoDigitos % 10;
            calculoDigitos = calculoDigitos / 10;

            suma = suma + resto;
            digitos --;
        }

        return resultado;
}

}