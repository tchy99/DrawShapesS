package core.view;

import java.util.Scanner;
public class DrawView {
	
	Scanner sc= new Scanner(System.in);
	
	public void bienvenue() {
		System.out.println(" Bienvenue. \n \n Ceci est un programme qui vous permettra de dessiner une figure.\n");
	}
	
	public String choix() {
		System.out.println(" a- Dessiner un triangle");
		System.out.println(" b- Dessiner un carre");
		System.out.println(" c- Dessiner un rectangle");
		System.out.println(" d- Dessiner un losange");
		System.out.println(" e- Dessiner un cercle");
		System.out.println(" f- Dessiner un parralelogramme");
		System.out.println(" g- Quitter le programme ");
		@SuppressWarnings("resource")
		Scanner ch = new Scanner(System.in);
		String a = ch.nextLine();
		return a;
	}
	public int dimTriangle() {
		System.out.println(" Dimension choisie ");
		int dim=sc.nextInt();
		return dim;
	}
	public int dimSquare() {
		System.out.println(" Dimension choisie ");
		int dim=sc.nextInt();
		return dim;
	}
	public int dimRec() {
		System.out.println(" Longueur choisie ");
		int L=sc.nextInt();
		return L;
	}
	
	public int LRectangle() {
		System.out.println(" Longueur choisie ");
		int L=sc.nextInt();
		return L;
	}
	
	public int lRectangle() {
		System.out.println(" Largeur choisie ");
		int l=sc.nextInt();
		return l;
	}
	
	public void bye() {
		System.out.println("End !! Thanks for using my program");
	}

		public int dimDiamond() {
		System.out.println(" Dimension choisie ");
		int dim=sc.nextInt();
		return dim;
	}
		
		public int dimCircle() {
			System.out.println(" Dimension choisie ");
			int dim=sc.nextInt();
			return dim;
		}
		
		public int line() {
			System.out.println(" hauteur choisie ");
			int l=sc.nextInt();
			return l;
		}
		public int column() {
			System.out.println(" base choisie ");
			int c=sc.nextInt();
			return c;
		}
		
		public void Display(){
			System.out.println("Voici votre dessin : ");
			
		}
		public void fichier() {
			try {
				Runtime.getRuntime().exec("clear");
			}catch(Exception e) {}
		}
		
		public String Demande() {
			System.out.println("Voulez-vous dessiner une autre figure (y/n): ");
			@SuppressWarnings("resource")
			Scanner dem = new Scanner(System.in);
			String a = dem.nextLine();
			return a;
		}
		
		
}
