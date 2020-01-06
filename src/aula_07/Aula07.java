package aula_07;

public class Aula07 {

	public static void main(String[] args) {

		/* Declarando array lutador */
		Lutador l[] = new Lutador[6];

		l[0] = new Lutador("Pretty boy", "França", 31, 1.75f, 65.9f, 11, 2, 1);
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.9f, 14, 2, 3);
		l[2] = new Lutador("Rodrigo", "Brasil", 33, 1.60f, 80.9f, 12, 2, 1);
		l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.9f, 13, 0, 2);
		l[4] = new Lutador("UFOCOBOL", "EUA", 37, 1.70f, 119.9f, 5, 4, 3);

		Luta UFC01 = new Luta();
		UFC01.marcarLutar(l[0], l[1]);
		UFC01.lutar();


	}

}
