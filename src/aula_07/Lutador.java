package aula_07;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	/* Declarando o construtor */
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	/* GETTERS AND SETTER */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	/* setPeso foi declarado setCategoria */
	public void setPeso(float peso) {
		this.peso = peso;
		setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	/* Declarando a logica de peso no setCategoria */
	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Invalido";

		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		}

		else if (this.peso <= 83.9) {
			this.categoria = "M�dio";
		}

		else if (this.peso <= 120.2) {
			this.categoria = "Pesado";

		} else {
			this.categoria = "Invalido";
		}

	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	/* Declarando os metados */
	public void apresentar() {
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println(this.getIdade() + " anos");
		System.out.println(this.getAltura() + "m de altura");
		System.out.println("Pesando: " + this.getPeso() + ", 'KG'");
		System.out.println("Ganhou: " + this.getVitorias());
		System.out.println("Perdeu: " + this.getDerrotas());
		System.out.println("Empatou: " + this.getEmpates());

	}

	public void status() {
		System.out.println("------------------------------------");
		System.out.println("Lutador: " + this.getNome());
		System.out.println("E um peso " + this.getCategoria());
		System.out.println(this.getVitorias() + " vitorias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println(this.getEmpates() + " empates");
	}

	public void ganharLutar() {
		/* this.setVitorias(this.getVitorias() + 1);*/
		this.vitorias = this.vitorias + 1;

	}

	public void perderLutar() {
		this.setDerrotas(this.getDerrotas() + 1);

	}

	public void empatarLutar() {
		this.setEmpates(this.getEmpates() + 1);

	}

}
