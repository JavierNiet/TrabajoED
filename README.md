El paquete contiene tres archivos:

1. Gato.java

Es la clase principal del proyecto. Representa a un gato con varios atributos:

nombre

color

raza

sexo (usa la enumeración Sexo)

peso

Incluye constructores, getters/setters, algunos métodos como maullar(), comer(), pelear(), saludar(), etc., y también un método toString() para mostrar la información del gato por pantalla.

En resumen, aquí es donde defino el comportamiento básico que tendrá cualquier objeto de tipo Gato.

2. Sexo.java

Es una enumeración sencilla que define los distintos sexos posibles para un gato:

MACHO

HEMBRA

HERMAFRODITA

La uso dentro de la clase Gato para tipar correctamente este atributo y evitar usar Strings sueltos.

3. PruebaGato.java

Clase de prueba donde creo objetos de tipo Gato y utilizo sus métodos.
Sirve para comprobar que todo funciona: imprimir por consola, saludar, maullar, etc.

Es básicamente el punto de entrada para testear la clase principal.
