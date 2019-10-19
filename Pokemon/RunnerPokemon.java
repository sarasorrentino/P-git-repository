import java.util.ArrayList;

public class RunnerPokemon {

	public static void main(String[] args) {
		
		Mossa frustata = new Mossa("Frustata", Tipo.Erba, - 2.5);
		Mossa solarraggio = new Mossa("Solarraggio", Tipo.Erba, -2.5);
		Mossa semitraglia = new Mossa ("Semitraglia", Tipo.Erba, - 2.5);
		Mossa pistolacqua = new Mossa("Pistolacqua", Tipo.Acqua, - 1);
		Mossa idrondata = new Mossa("Idrondata", Tipo.Acqua, -1);
		Mossa splash = new Mossa("Splash" , Tipo.Acqua, -1);
		Mossa lanciafiamme = new Mossa("Lanciafiamme", Tipo.Fuoco, - 5);
		Mossa braciere = new Mossa("Braciere", Tipo.Fuoco, - 5);
		Mossa fuocopugno = new Mossa("Fuocopugno", Tipo.Fuoco, - 5);
		
		Mossa[] elencoMosse1 = new Mossa[4] ;
		elencoMosse1[0]=frustata;
		elencoMosse1[1]=solarraggio;
		elencoMosse1[2]=semitraglia;
		elencoMosse1[3]=splash;
		
		Mossa[] elencoMosse2 = new Mossa[4];
		elencoMosse2[0]=pistolacqua;
		elencoMosse2[1]=idrondata;
		elencoMosse2[2]=splash;
		
		Mossa[] elencoMosse3 = new Mossa[4];
		elencoMosse3[0]=fuocopugno;
		elencoMosse3[1]=lanciafiamme;
		elencoMosse3[2]=braciere;
	
		
		Pokemon bulbasaur = new Pokemon ("Bulbasaur", Tipo.Erba, 672, 3.67, 1, false, elencoMosse1);	
		Pokemon chikorita = new Pokemon ("Chikorita", Tipo.Erba, 750, 5.67, 1, false, elencoMosse1);
		Pokemon magikarp = new Pokemon ("Magikarp", Tipo.Acqua, 144, 12.39, 1, false, elencoMosse2);
		Pokemon piplup = new Pokemon ("Piplup", Tipo.Acqua, 577, 5.63, 1, false, elencoMosse2);
		Pokemon charmander = new Pokemon ("Charmander", Tipo.Fuoco, 944, 27.92, 1, false, elencoMosse3);
		Pokemon ponyta = new Pokemon ("Ponyta", Tipo.Fuoco, 1373, 31.16, 1, false, elencoMosse3);
		
		
		ArrayList<Pokemon> mazzo1 = new ArrayList<Pokemon> ();
		mazzo1.add(charmander);
		mazzo1.add(piplup);
		mazzo1.add(magikarp);
		
		ArrayList<Pokemon> mazzo2 = new ArrayList<Pokemon> ();
		mazzo2.add(ponyta);
		mazzo2.add(chikorita);
		mazzo2.add(bulbasaur);
		
		
		Allenatore sara = new Allenatore ("Sara", mazzo2);
		Allenatore elia = new Allenatore ("Elia", mazzo1);
		
		Sfida.battaglia(sara, elia);
		
		
	}

}
