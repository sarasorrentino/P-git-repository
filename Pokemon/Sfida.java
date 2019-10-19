import java.util.Scanner;

public class Sfida {

	public static void battaglia(Allenatore a1, Allenatore a2) {
		
		Scanner scan = new Scanner (System.in);
	
		//scelta pokemon e creazione mazzo di bataglia
		System.out.println("Allenatore " + a1.nome + " Scegli i tuoi pokemon per la battaglia!!");
		int p1=scan.nextInt();
		int p2=scan.nextInt();
		int p3=scan.nextInt();
	
		Pokemon[] mazzoA1 = new Pokemon[3];
		mazzoA1[0]=a1.getPokedek().get(p1);
		mazzoA1[1]=a1.getPokedek().get(p2);
		mazzoA1[2]=a1.getPokedek().get(p3);
	
		System.out.println("Allenatore " + a2.nome + " Scegli i tuoi pokemon per la battaglia!!");
		int q1=scan.nextInt();
		int q2=scan.nextInt();
		int q3=scan.nextInt();
	
		Pokemon[] mazzoA2 = new Pokemon[3];
		mazzoA2[0]=a2.getPokedek().get(q1);
		mazzoA2[1]=a2.getPokedek().get(q2);
		mazzoA2[2]=a2.getPokedek().get(q3);
		
		int contatore1=0;
		int contatore2=0;
		
		for(int p=0; p<mazzoA1.length; p++) {
			for(int q=0; q<mazzoA2.length; q++) { //facendo così l'allenatore due vive finchè è vivo l'allenatore uno 
				
				int nMossa=0;
				double danno=0;
				
				Mossa[] m;
				
				if(mazzoA1[p].getPv()!= 0 && mazzoA2[q].getPv() != 0) {
					//Attacco allenatore 1
					System.out.println("Allenatore " + a1.nome + " Fai la tua mossa con " + mazzoA1[p].getNome()+" !!");
					nMossa=scan.nextInt();
					m = mazzoA1[p].getMosse();
					danno=mazzoA2[q].getDifesa()*m[nMossa].getDannoAttacco();
					mazzoA2[q].setPv(mazzoA2[q].getPv()-danno);
					
					//Attacco allenatore 2
					System.out.println("Allenatore " + a2.nome + " Fai la tua mossa con " + mazzoA2[q].getNome()+" !!");
					nMossa=scan.nextInt();
					m = mazzoA2[q].getMosse();
					danno=mazzoA1[p].getDifesa()*m[nMossa].getDannoAttacco();
					mazzoA1[p].setPv(mazzoA1[p].getPv()-danno);
				}
				
				if(mazzoA1[p].getPv()== 0) {
					System.out.println(mazzoA2[q].getNome() + " ("+ a2.getNome()+")"+ " ha sconfitto " + mazzoA1[p].getNome() + " ("+ a1.getNome()+").");
					contatore2++;
				}
				if(mazzoA2[q].getPv()== 0) {
					System.out.println(mazzoA1[p].getNome() + " ("+ a1.getNome()+")"+ " ha sconfitto " + mazzoA2[q].getNome() + " ("+ a2.getNome()+").");
					contatore1++;
				}
				
			}
			
		}
		
		if (contatore1==3) {
			a1.getPokedek().get(p1).setLivello(a1.getPokedek().get(p1).getLivello() + 1);
			a1.getPokedek().get(p2).setLivello(a1.getPokedek().get(p2).getLivello() + 1);
			a1.getPokedek().get(p3).setLivello(a1.getPokedek().get(p3).getLivello() + 1);
			
			if(a1.getPokedek().get(p3).getLivello()>=5) {
				a1.getPokedek().get(p3).setEvoluto(true);
				System.out.println(a1.getPokedek().get(p3).getNome() + " può evolversi!");
			}
				
			a1.setPunteggio(a1.getPunteggio()+100);
			System.out.println( a1.getNome()+" ha vinto la sfida! Il suo nuovo punteggio allenatore è "+a1.getPunteggio() +". "+ a1.getPokedek().get(p1).getNome() + ", " + a1.getPokedek().get(p2).getNome() +"e "+ a1.getPokedek().get(p3).getNome() + " sono saliti di livello!");
		}
		else {
			a2.getPokedek().get(p1).setLivello(a2.getPokedek().get(p1).getLivello() + 1);
			a2.getPokedek().get(p2).setLivello(a2.getPokedek().get(p2).getLivello() + 1);
			a2.getPokedek().get(p3).setLivello(a2.getPokedek().get(p3).getLivello() + 1);
			
			if(a2.getPokedek().get(p3).getLivello()>=5) {
				a2.getPokedek().get(p3).setEvoluto(true);
				System.out.println(a2.getPokedek().get(p3).getNome() + " può evolversi!");
			}
			
			a2.setPunteggio(a2.getPunteggio()+100);
			System.out.println(a2.getNome()+" ha vinto la sfida! Il suo nuovo punteggio allenatore è "+a2.getPunteggio() + ". " + a2.getPokedek().get(p1).getNome() + ", " + a2.getPokedek().get(p2).getNome() +"e "+ a2.getPokedek().get(p3).getNome() + " sono saliti di livello!");
		}
	}
}
