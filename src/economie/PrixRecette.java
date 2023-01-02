package economie;

import stocks.*;

public class PrixRecette {
	private static int loyer=1200;
	private static int salaire=5100;
	private static int publicite=100;
	
	public static double PrixIngrédients(Ingrédients ing) {
		return ing.getNombre()*ing.prixpargramme();
	}
	public static double PrixPain(Farine farine,Levure levure,Sel sel) {
		return farine.prixpargramme()*50+levure.prixpargramme()*2+sel.prixpargramme();
	}	
	public static double PrixChocolatine(Beurre beurre,Chocolat chocolat,Sucre sucre) {
		return beurre.prixpargramme()*2+chocolat.prixpargramme()*5+sucre.prixpargramme()*2;
	}
	public static double PrixCroissant(Farine farine,Levure levure,Sel sel,Beurre beurre,Sucre sucre) {
		return farine.prixpargramme()*27+levure.prixpargramme()+sel.prixpargramme()+sucre.prixpargramme()*3+beurre.prixpargramme()*10;
	}
	public static String beneficesParMois(int nbdepains,int nbdechocolatines,int nbdecroissants) {
	    Farine farine = new Farine("farine",0);
		Levure levure = new Levure("levure",0);
		Sel sel = new Sel("sel",0);
		Beurre beurre = new Beurre("beurre",0);
		Chocolat chocolat = new Chocolat("chocolat",0);
		Sucre sucre = new Sucre("sucre",0);
		
		double depenses=loyer+salaire+publicite;
		double gain=nbdechocolatines*PrixChocolatine(beurre, chocolat, sucre)+nbdecroissants*PrixCroissant(farine, levure, sel, beurre, sucre)+nbdepains+PrixPain(farine, levure, sel);
		double benefices=gain-depenses;
		return ("Le recette pour ce mois est de "+benefices+" euros.");
	}
	public static void main(String[] args) {
	    Farine farine = new Farine("farine",0);
		Levure levure = new Levure("levure",0);
		Sel sel = new Sel("sel",0);
		Beurre beurre = new Beurre("beurre",0);
		Chocolat chocolat = new Chocolat("chocolat",0);
		Sucre sucre = new Sucre("sucre",0);
		System.out.println("Le prix d'un pain est actuellement d'environ "+PrixPain(farine, levure,sel)+" euros");
		System.out.println("Le prix d'une chocolatine est actuellement d'environ "+PrixChocolatine(beurre, chocolat, sucre)+" euros");
		System.out.println("Le prix d'un croissant est actuellement d'environ "+PrixCroissant(farine, levure, sel, beurre, sucre)+" euros");
		System.out.println(beneficesParMois(10000, 1000, 1000));
	}
}
