package Gato;
/**
 * Clase que sirve para probar la clase Gato. 
 */

public class PruebaGato {

	public static void main(String[] args) {
		Gato g1, g2;
		
		g1 = new Gato("Garfield", "naranja", "corriente");

		g2 = new Gato("Silvestre", "tuxedo", "corriente");
		
		g1.setPeso(8800);
		g1.setSexo(Sexo.MACHO);
		
		g2.setPeso(6600);
		g2.setSexo(Sexo.MACHO);
		
		System.out.println("Gato 1 = " + g1);
		System.out.println("Gato 2 = " + g2);
		
		System.out.println("Sexo de los gatos: ");
		System.out.println("g1: " + g1.getSexo());
		System.out.println("g2: " + g2.getSexo());
		
		System.out.println("Echándole de comer al gato...");
		g1.comer(1000);		
		System.out.println(g1);
		System.out.println("Haciendo ejercicio...");
		g1.setPeso(10);
		g1.correr(180);
		System.out.println(g1);
		
		g1.saludar();
		g1.maullar();
	}

}
