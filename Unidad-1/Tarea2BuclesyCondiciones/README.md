<div align="justify">

# Tarea 2 Bucles y Condiciones

<!-- Recuerda que

## 1. Subtítulo tarea

### 1.1 Subtítulo de la tarea

-- Incluir imagenes

<div align="center">
    <img src="images/diagrama-flujo.png"/> 
</div>

-->

## Descripción del ejercicio
Un número perfecto es aquel que es igual a la suma de sus divisores propios (excluyendo él mismo). Por ejemplo, 6 es un número perfecto porque sus divisores propios son 1, 2 y 3, y 1 + 2 + 3 = 6.
El ejercicio consiste en escribir un programa que encuentre e imprima todos los números perfectos en un rango dado (por ejemplo, entre 1 y 1000). Más información.
## Diagrama de flujos

<div align="center">
    <img src="images/Ejercicio8.png">
</div>

## Pseudocódigo

 - Inicio
 - Declara las variables:
    numeroMenor = 0; numeroMayor = 0; suma = 0;
 - Imprimir "Indicamos el rango que queremos buscar"
 - Leer los dos numeros que facilitara el usuario:
    numeroMenor, numeroMayor
 - Para cada numero i desde numeroMenor hasta numeroMayor: Inicializar suma como 0.
 - Para cada numero j desde numeroMenor hasta i-1: 
    Si i es divisible por j: Sumar i a la variable suma
 - Su suma es igual a i:
    Imprimir i
 - Fin


</div>