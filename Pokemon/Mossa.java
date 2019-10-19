
public class Mossa {

	protected String nome;
	protected Tipo tipo;
	protected double dannoAttacco;
	
	public Mossa(String nome, Tipo tipo, double dannoAttacco) {
		this.nome=nome;
		this.tipo=tipo;
		this.dannoAttacco=dannoAttacco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public double getDannoAttacco() {
		return dannoAttacco;
	}

	public void setDannoAttacco(double dannoAttacco) {
		this.dannoAttacco = dannoAttacco;
	}

}
