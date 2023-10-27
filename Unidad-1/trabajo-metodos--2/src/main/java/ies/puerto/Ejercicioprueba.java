package ies.puerto;

public class Ejercicioprueba {

  public int suma(int valor1, int valor2){
          return valor1 + valor2;
      }
     
      public int suma(int valor1, int valor2, int valor3){
          int resultado = suma(valor1, valor2);
          return resultado = suma(resultado, valor3);
      }
     
      public int suma(int valor1, int valor2, int valor3, int valor4){
          int resultado = suma(valor1, valor2, valor3);
          return resultado = suma(resultado + valor4);
      }
     
      public int suma(int valor1, int valor2, int valor3, int valor4, int valor5){
          int resultado = suma(valor1, valor2, valor3, valor4);
         return resultado = suma(resultado + valor5);
      }

  public int mayor(int numero1, int numero2){

    int resultado = numero1;
    if (numero2 > numero1){
      resultado = numero2;
    }
    return resultado;
  }

  public int mayor(int numero1, int numero2, int numero3){

    int resultado = mayor(numero1, numero2);
    return resultado = mayor(resultado, numero3);
    
  }

  public int mayor(int numero1, int numero2, int numero3, int numero4){

    int resultado = mayor(numero1, numero2, numero3);
    return resultado = mayor(resultado, numero4);

  }

  public int mayor(int numero1, int numero2, int numero3, int numero4, int numero5){

    int resultado = mayor(numero1, numero2, numero3, numero4);
    return resultado = mayor(resultado, numero5);

  }

  public int menor(int numero1, int numero2){

    int resultado = numero2;
    if (numero2 > numero1){
      resultado = numero1;
    }
    return resultado;
  }

  public int menor(int numero1, int numero2, int numero3){
    
    int resultado = menor(numero1, numero2);
    return resultado = menor(resultado, numero3);

  }

   public int menor(int numero1, int numero2, int numero3, int numero4){
    
    int resultado = menor(numero1, numero2, numero3);
    return resultado = menor(resultado, numero4);

  }

   public int menor(int numero1, int numero2, int numero3, int numero4, int numero5){
    
    int resultado = menor(numero1, numero2, numero3, numero4);
    return resultado = menor(resultado, numero5);

  }

  public String mostrarCrecienteTresNumeros(int numero1, int numero2, int numero3){
    int mayor = mayor(numero1, numero2, numero3);
    int menor = menor(numero1, numero2, numero3);
    int medio = suma(numero1, numero2, numero3) - mayor - menor;
    String resultado = menor + ", " + medio + ", " + mayor; 
    return resultado;

  }

  public String mostrarCrecienteCuatroNumeros(int numero1, int numero2, int numero3, int numero4){
      int mayor = mayor(numero1, numero2, numero3);
      int mayor4 = mayor(mayor, numero4);
      int mayor3 = 0;
      if (mayor4 > mayor){
         mayor3 = mayor;
      }
      int menor = menor(numero1, numero2, numero3);
      int menor4 = menor(menor, numero4);
      int menor3 = 0;
      if (menor4 < menor){
        menor3 = menor;
      }
      String resultado = menor + ", " + menor3 + ", " + mayor3 + ", " + mayor4 + ".";
      return resultado;
  }

  public String mostrarCrecienteCincoNumeros(int numero1, int numero2, int numero3, int numero4, int numero5){
    int mayor = mayor(numero1, numero2, numero3, numero4);
    int mayor5 = mayor(mayor, numero5);
    int mayor4 = 0;
    if (mayor5 > mayor){
      mayor4 = mayor;
    }
    
    String resultado = "";
    return resultado;
  }


  
    


}