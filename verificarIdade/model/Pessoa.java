package model;

public class  Pessoa {
	private String nome;
	private int idade;

	public Pessoa() {
	}
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String maioridade() {
		String txt;
		if(idade > 17) {
			txt = "Maior de idade";
		}
		else {
			txt = "Menor de idade";
		}
		return txt;
	}
	
	@Override
	public String toString() {
		return nome + " - " + idade + " - "+ maioridade();
		
	}
}
