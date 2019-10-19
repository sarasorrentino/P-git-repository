
public class Pokemon {

	protected String nome;
	protected Tipo tipo;
	protected double pv;
	protected double peso;
	protected int livello;
	protected boolean evoluto;
	Mossa[] mosse = new Mossa[4];
	protected double difesa;
	
	public Pokemon (String nome, Tipo tipo, double pv, double peso, int livello, boolean evoluto,  Mossa[] mosse){
		this.nome=nome;
		this.tipo=tipo;
		this.pv=pv;
		this.peso=peso;
		this.livello=livello;
		this.evoluto=evoluto;
		this.mosse=mosse;
	}
	
	public void setDifesa() {
		if(tipo==Tipo.Acqua)
			difesa=2;
		if(tipo==Tipo.Fuoco)
			difesa=10;
		if(tipo==Tipo.Erba)
			difesa=5;
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

	public double getPv() {
		return pv;
	}

	public void setPv(double pv) {
		this.pv = pv;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}

	public boolean isEvoluto() {
		return evoluto;
	}

	public void setEvoluto(boolean evoluto) {
		this.evoluto = evoluto;
	}

	public double getDifesa() {
		return difesa;
	}

	public void setDifesa(double difesa) {
		this.difesa = difesa;
	}

	public Mossa[] getMosse() {
		return mosse;
	}

	public void setMosse(Mossa[] mosse) {
		this.mosse = mosse;
	}
	
	
	
}
