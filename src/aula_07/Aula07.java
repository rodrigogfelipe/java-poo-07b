package aula_07;

public class Aula07 {

	public static void main(String[] args) {
		
		/*Declarando array lutador*/
		Lutador l[] = new Lutador[6];
		
		l[0]= new Lutador("Pretty boy","França", 31, 1.75f, 65.9f, 11, 2, 1);
		l[1]= new Lutador("Putscript","Brasil", 29, 1.80f, 90.9f, 10, 2, 2);
		l[2]= new Lutador("Rodrigo","Brasil", 33, 1.60f, 70.9f, 20, 2, 2);
		
		/*imprimindo status na tela*/
		l[2].status();
		
	}

}
