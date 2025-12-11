package Gato;

/**
 * Clase de prueba para aprender a definir 
 * clase de objeto. 
 * 
 * Representa a un gato ficticio. 
 */
public class Gato {
	//Atributos o variables de instancia.
	private String nombre;
	private String color;
	private String raza;
	private Sexo sexo;
	private int peso; 
	
	//Métodos de instancia.
	/**
	 * Construye un nuevo gato a partir de los datos:
	 * @param nombre del gato
	 * @param color del gato
	 * @param raza del gato
	 * @param sexo del gato
	 * @param peso del gato
	 */

	public Gato(String nombre,String color, String raza) {
		
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
		this.sexo = null;
		this.peso = 5;
	}
	/**
	 * Método para conocer el peso de un gato
	 * @return el peso en gramos
	 */
	
	public int getPeso() {
		return peso;
	}
	/**
	 * Setter que permite actualizar el peso del gato 
	 * @param peso que es un double.
	 */
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	/**
	 * Setter que te permite actualizar el sexo del gato.
	 * @param sexo
	 */
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	/**
	 * Permite conocer el sexo de un gato
	 * @return el sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}
	// Getters y setters
	/**
	 * Permite conocer el nombre de una cadena
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Actualiza el nombre del gato
	 * @param nombre nuevo que queremos ponerle
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Permite conocer el color de un gato
	 * @return una cadena que derscribe el color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * Permite actualizar el color del gato
	 * @param color que le queremos asignar
	 * 
	 */
	public void setcolor(String color) {
		this.color = color;
	}
	/**
	 * Permite conocer la raza del gato.
	 * @returnuna cadena con la raza.
	 */
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	//Otros métodos
	/**
	 * Aumenta el peso del gato en los gramos especificados.
	 * @param gramos que ingiere el gato.
	 */
	public void comer(int gramos) {
		this.peso += gramos; 
		
	}
	/**
	 * Dismuniye el peso del gato 10 gramos por cada hora de ejercicicios.
	 * @param minutos que está haciendo ejercicio. 
	 */
	public void correr (int minutos) {
		this.peso -= 10*minutos/60;
		
		if (this.peso < 0)
			this.peso = 0;
			
	}
	/**
	 * Imprime por patalla el sonido MIAUU.
	 */
	public void maullar () {
		System.out.println("¡MIAAUUU!");
			
	}
	/**
	 * Imprime por patantalla su nombre.
	 */
	public void saludar () {
		System.out.printf("¡Hola! Me llamo %s\n", this.nombre);
	}
	
	
	//Método toString
	/*
	 * Devuelve una cadena de caracteres con los datos del gato 
	 * para poder visualizarlo en pantalla o lo que haga falta. 
	 */
	
	public String toString() {
		return "Gato [nombre = "+ nombre +" , color = "+ color +" , raza = "+ raza +" , sexo = "+ sexo +" , peso = "+ peso +"]";
	
	}
}
