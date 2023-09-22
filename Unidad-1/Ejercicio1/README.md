# Ejercicio 1 <a name="ejercicio1"></a>
Desarrolle un algoritmo que permita leer dos valores distintos, determinar cual de los dos valores es el mayor y escribirlo.

### Diagrama de flujo

<img src="images/images/Diagrama1.png"/>


### Pseudocódigo

Pasos:
- __Inicio__
- Inicializar variables A = 0, B = 0
- Solicitar la introducción de dos valores distintos
- __Leer__ los dos valores
- Asignarlos a las variables A y B
- __Si__ A = B __Entonces__ vuelve a 3 porque los valores deben ser distintos
- __Si__ A > B __Entonces__
    - __Escribir__ A "Es el mayor"
- __De lo contrario: Escribir__ B "Es el mayor"
- __Fin_Si__
- __Fin__

## Ejercicio 2 <a name="ejercicio2"></a>
Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente. El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos. Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales.

### Diagrama de Flujo

<img src="images/images/Diagrama2.png">

### Pseudocógido

Pasos:
- __Inicio__
- Inicializar las variables A, B y C
- __Leer__ los tres valores
- Almacenar en las variables A, B y C
- __Si__ A > B y A > C __Entonces__
- __Escribir__ A "Es el mayor"
- __Sino__
- __Si__ B > A y B > C __Entonces__
- __Escribir__ B "Es el mayor"
- __Sino__
- __Escribir__ C "Es el mayor"
- __Fin_Si__
- __Fin_Si__
- __Fin__



## Ejercicio 3 <a name="ejercicio3"></a>
Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + .... + 10.

### Diagrama de Flujo

<img src="images">

### Pseudocógido

Pasos:
- __Inicio__
- Declaración de variables:
  N = 0, Suma = 0
- Asignación Contador:
  N = N + 1

- Asignación Acumulador:
  Suma = Suma + N

- __Si__ N = 10 __Entonces__
- Escribir Suma
- __De lo contrario__, repetir desde el paso 3
- __Fin_Si__
- __Fin__