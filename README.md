# PracticasProgramacion2023

## Practica1
## Esta práctica consiste en la obtención del número Pi mediante el método de Montecarlo.
> El método de Montecarlo es un método no determinista o estadístico numérico, usado para aproximar expresiones matemáticas complejas y costosas con exactitud. El método se llamó así en referencia al Casino de Montecarlo (Mónaco) por ser "capital"del juego del azar, al ser la ruleta un generador simple de números aleatorios. El nombre y el desarrollo sistemático de los métodos de Montecarlo datan aproximadamente de 1944 y se mejoraron enormemente con el desarrollo de la computadora.

## Forma de utilizar este programa 
Para la ejecución de este progrma vamos a pulsar el botón derecho del ratón sobre el archivo `App.java`. Una vez iniciado nos solicita el número de veces que queremos ejecutar el bucle. Cuanto mayor sea el numero de iteraciones, más se aproximará al valor del numero Pi. También es cierto que tardará mas y puede llegar a sobrepasar el límite máximo establecido para ese tipo de variables.
El número máximo de iteraciones que tiene el programa es de 2.147.483.467 ya que hemos definido como integer la variable numero de iteraciones.

## Referencias que he consultado
[enlace a wikipedia](https://es.wikipedia.org/wiki/M%C3%A9todo_de_Montecarlo)

## Practica2
En esta practica las reglas son las habituales:
> Si una célula está viva y dos o tres de sus vecinas también lo están. entonces continúa viva en el estado siguiente.
> Si una célula está muerta y tres de sus vecinas están vivas, entonces pasa a estar viva en el estado siguiente.
> El resto de células pasan a estar muertas en el estado siguiente.

## Forma de utilizar el programa
Para la ejecución de este progrma vamos a pulsar el botón derecho del ratón sobre el archivo `App.java`

## Ejecución del programa
Hemos definido una variable que establece el tablero del juego de la vida en un matriz de 30x30 celdas.
El número de iteraciones cuando se hace la simulación del tablero leido es de 6.
Mientras que si se utiliza la generación de un tablero aleatorio el número de iteraciones de la simulación es de 15.