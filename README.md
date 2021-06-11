# Taller 9 (Laboratorio)
## Elaboración de ejercicios haciendo uso del concepto de Herencia en Programación Orientada a Objetos.

* Generar el diagrama de clases solicitado
* Generar una solución el lenguaje Java


Analizar la siguiente problemática:

1. Generar un diagrama de clases entre Prestamo, PrestamoAutomovil y PrestamoEducativo


2. Crear una clase Persona en lenguaje Java
	- Atributos:	
		- Nombre
		- Apellido

3. Crear una clase Préstamo en lenguaje Java:
	- Atributos:	
		- beneficiario - de tipo Persona
		- tiempo de préstamo en meses
		- ciudad del préstamo (de tipo String)

4. Crear una clase PrestamosAutomovil que herede de Préstamo en lenguaje Java
	- Atributos:	
		- tipo de automóvil
		- marca de automóvil
		- garante1 tipo Persona
		- valor de automóvil
		- valor mensual de pago préstamo automóvil
	
	- Métodos: 
		- Agregar los métodos correspondientes; además agregar un método toString
		- El valor mensual del pago del préstamo del automóvil es igual al valor del automóvil dividido para el número de meses.
		- El método para establecer la ciudad del préstamo de tipo PrestamoAutomovil debe asignar el valor siempre en minúscula.
		- Personalizar el método toString; usar el método de la superclase

5. Crear una clase PrestamoEducativo que herede de Préstamo en lenguaje Java
	- Atributos:
		- nivel de estudio
		- nombre de centro educativo
		- valor de la carrera
		- valor mensual del pago del préstamo del valor de la carrera
	
	- Método: 
		- Agregar los métodos correspondientes; además agregar un método toString
		- El valor mensual del pago del préstamo del valor de la carrera es igual al (valor de la carrera dividido para el número de meses) menos 10% del (resultado del valor de la carrera dividido para el número de meses)  
		- Personalizar el método toString; usar el método de la superclase.
		El método para establecer la ciudad del préstamo de tipo PrestamoEducativo debe asignar el valor siempre en mayúscula. 


6. Crear clase Ejecutora que permita crear:

	- Generar un menú que permita al usuario decidir si desea ingresar datos por teclado para un préstamo de tipo PrestamoAutomovil o PrestamoEducativo.
	- Independiente del tipo de préstamo, se debe imprimir la representación del objeto (toString)
	- El proceso de ingreso de prestamos termina cuando el usuario lo decide.

