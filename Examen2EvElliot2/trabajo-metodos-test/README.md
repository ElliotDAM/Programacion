<div align="justify">

# Objetivo del proyecto

Este proyecto mavenn tiene como objetivo ayudar a comprender al alumno el úso de métodos en java, y la documentación de los módulos.

## Comandos maven a utilizar

- Limpieza y compilación del proyecto

    ```console
    mvn clean install
    ```

- Generación de la documentación del proyecto (javadoc)

    ```console
    mvn javadoc:javadoc 
    ```
- Ejecución de tes

    ```console
    mvn clean test 
    ``` 
 ## Enunciado del ejercicio
 
 Vamos a desarrollar un sistema de gestión de inventario para una cadena de tiendas de ultramarinos. El sistema debe manejar productos de diferentes categorías, como alimentos, aparatos electrónicos, souvenirs y productos de cuidado personal. Cada categoría de producto tiene sus propias características y restricciones, que a continuación se describen.

    Define tres interfaces llamadas IVendible, ISaludable y IRecomendable:
        IVendible debe tener métodos para calcular el (float) precio máximo y la (int) cantidad disponible de un producto.
        ISaludable debe tener métodos para calcular (int) cuántos días quedan hasta la caducidad del producto y (boolean) verificar si el producto está caducado.
        IRecomendable debe tener métodos para (boolean) recomendar el producto y (int) calcular su popularidad.

    Crea tres clases abstractas llamadas Producto, ProductoFresco  y ProductoRecomendable:
        Producto debe implementar la interfaz IVendible y contener las propiedades comunes a todos los productos: nombre (String), precio(String), fecha de entrada (String) y un identificador único (String).
        ProductoFresco debe extender Producto e implementar la interfaz ISaludable. Esta clase debe incluir una propiedad adicional para la fecha de caducidad(String).
        ProductoRecomendable debe extender Producto e implementar la interfaz IRecomendable. Esta clase debe incluir métodos para recomendar el producto y calcular su popularidad.
    Implementa las siguientes clases con sus respectivas características:
        Alimento: debe ser una subclase de ProductoFresco y debe tener un método para (int) calcular la cantidad de días antes de la caducidad y para (boolean) verificar si está caducado. calcular el precio máximo (1,35*precio).
        Aparato: debe ser una subclase de Producto y debe tener un método para (float) calcular el precio máximo (1,42*precio).
        Souvenir: debe ser una subclase de Producto y debe tener un método para (float) calcular el precio máximo(1,3*precio).
        CuidadoPersonal: debe ser una subclase de ProductoRecomendable y debe incluir métodos para recomendar el producto y calcular su popularidad,calcular el precio máximo (1,8*precio).
    Crea una clase Tienda que tenga las siguientes características:
        Debe contener listas (List/Set/HasMap) para almacenar cada tipo de producto.
        Debe tener métodos para agregar, eliminar y obtener productos de cada lista.
        Debe incluir métodos para calcular el precio total de cada tipo de producto y el precio total de todos los productos en la tienda. (Los alimentos caducados no se pueden vender).
        Debe de tener un método que calcule cual es la ganancia de cada una de las listas de los productos y de toda la tienda. (Los alimentos caducados no se pueden vender).
        Implementa un método que muestre la cantidad de productos disponibles de cada uno de los tipos que existe.
        Asegúrate de manejar adecuadamente la duplicación de productos y de verificar su existencia antes de realizar operaciones de añadir, eliminar u obtener.
        Implementa un menú interactivo que permita al usuario realizar operaciones como añadir, mostrar, eliminar y modificar productos en la tienda.
        Un producto de cuidado personal, se considera cuando tiene una popularidad de mayor o igual a 7. Implementa un método que muestre aquellos productos que muestren aquellos que lo cumplen.
        Asegúrate de hacer uso de las interfaces y clases abstractas definidas previamente en tus implementaciones.

        CORREGIR
        Añadir metodos faltantes.
        - En el metodo precioTotalProductos, hay que llamar a los metodos de cantidad de cada articulo para calcular la cantidad de productos con su precio y sumarlo.
        - Calcular las ganancias de cada producto, y la ganancia total(precio total - precio sin igic);
        - Simplificar el codigo en app, haciendo que en removeArticulo(como en las otras eliminaciones) se busque por el id y se elimine todo el articulo.
        - Borrar todos los metodos estaticos(y entender por qué le quitamos el static)

        Apuntes:
        Inicializamos el fichero con File(FileWriter, FileReader)
        Declaramos la lista: List<Producto> productos
            -recorro
            -transformo a producto
            -añado en la lista
            -obtenerProducto(productos)
            - cantidad productos= productos.size()

        Añadir:
            -pedir datos productos
            -comprobar si existe(productos.contains(productoAInsertar))
            - añadir producto a la lista(productos.add(producto))
            -añadir al fichero(Metodo escritura)


        CRUD:
            - pedirDatos(id)
            - new Producto(id)
            - se abre fichero(File)
            - recorremos fichero(FileReader)
            - Buffer
            - obtengo linea
            - linea.split(',') = String[] lineaProducto
            - verificar si existe(if(lineaProducto[0] == producto.getId()))
            - Cambiamos lo que queramos modificar si existe = producto.setNombre(lineaProducto[1])...
            - retornamos producto
</div>