import java.util.ArrayList;

public class Allenatore {
	
	protected String nome;
	protected ArrayList<Pokemon> pokedek;
	protected int punteggio;
	 
	public Allenatore (String nome, ArrayList<Pokemon> pokedek) {
		this.nome=nome;
		this.pokedek=pokedek;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Pokemon> getPokedek() {
		return pokedek;
	}
	public void setPokedek(ArrayList<Pokemon> pokedek) {
		this.pokedek = pokedek;
	}

	public int getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}
	
	
	
	
	 

}
