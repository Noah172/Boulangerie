package stocks;
import java.util.Scanner;
public class Interaction {
	
	public static int SaisieClavier() {
		int nombre=0;
	    Scanner lectureClavier = new Scanner(System.in);
		nombre = lectureClavier.nextInt();
		return nombre;
	}
	
	public static void SaisieQuantite(Ingrédients ing) {
		int quantité=0;
	    System.out.println("Rentrez la quantité de "+ing.getName()+ ":");
	    Scanner lectureClavier = new Scanner(System.in);
		quantité = lectureClavier.nextInt();
	
	    ing.quantite=quantité;
	}
	
	public static void main(String[] args) {
		
	    Farine farine = new Farine("farine",0);
		Levure levure = new Levure("levure",0);
		Sel sel = new Sel("sel",0);
		Beurre beurre = new Beurre("beurre",0);
		Chocolat chocolat = new Chocolat("chocolat",0);
		Sucre sucre = new Sucre("sucre",0);
		
		SaisieQuantite(farine);
		SaisieQuantite(levure);
		SaisieQuantite(sel);
		SaisieQuantite(beurre);
		SaisieQuantite(chocolat);
		SaisieQuantite(sucre);
		
		System.out.println("Combien de pains voulez-vous faire?");
		farine.pain(farine, levure, sel, SaisieClavier());
		System.out.println("Combien de Chocolatine voulez-vous faire?");
		farine.chocolatine(beurre, chocolat, sucre, SaisieClavier());
		System.out.println("Combien de Croissant voulez-vous faire?");
		farine.croissant(farine, levure, sel, beurre, sucre, SaisieClavier());
		

		System.out.println();
		farine.annoncequantite(beurre);
		farine.annoncequantite(chocolat);
		farine.annoncequantite(sucre);
		farine.annoncequantite(farine);
		farine.annoncequantite(levure);
		farine.annoncequantite(sel);
	}
	
}
