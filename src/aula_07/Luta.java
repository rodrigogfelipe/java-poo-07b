package aula_07;

import java.util.Random;

public class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	/* Declarando o construtor */
	public Luta() {
		this.desafiado = desafiado;
		this.desafiante = desafiante;
		this.rounds = rounds;
		this.aprovada = aprovada;
	}

	/* GETTERS AND SETTERS */
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	/* Declarando metado marcarLutar recebera parametro OBJ Lutador L1 , L2 */
	public void marcarLutar(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			System.out.println("Luta marcada");
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}

	}

	public void lutar() {
		if (this.aprovada) {
			System.out.println("###DESAFIADO###");
			this.desafiado.apresentar();
			System.out.println("###DESAFIANTE###");
			this.desafiante.apresentar();
			/* Gerando números aleatorios */
			Random random = new Random();
			int vencedor = random.nextInt(3);
			System.out.println("=========VENCEDOR=============");
			switch (vencedor) {
			case 0:
				System.out.println("Empatou!");
				this.desafiado.empatarLutar();
				this.desafiante.empatarLutar();

			case 1:
				System.out.println("Ganhou desafiador " + this.desafiado.getNome());
				this.desafiado.ganharLutar();
				this.desafiante.perderLutar();

			case 2:
				System.out.println("Ganhou desafiante " + this.desafiante.getNome());
				this.desafiado.perderLutar();
				this.desafiante.ganharLutar();
				break;
			} 
			
		} else {
			System.out.println("A luta não pode acontecer");
			}

		}

	}


