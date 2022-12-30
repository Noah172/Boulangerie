package stocks;

public class Recette {
	
//	RECETTE DU PAIN
	public void pain(Farine farine,Levure levure,Sel sel,int nombredefois) {
		if ((farine.quantite>=50*nombredefois) && (levure.quantite>=2*nombredefois) && (sel.quantite>=1*nombredefois)) {
			for (int i = 0; i < nombredefois; i++) {
			farine.quantite-=50;
			levure.quantite-=2;
			sel.quantite-=1;
				}			
		} else {
			System.out.println("Si vous faites "+nombredefois+" pains, il n'y aura pas assez d'ingrédients. Veuiller changer le nombre de pain ou acheter de nouveaux ingrédients.");
		}
	}	
	public void chocolatine(Beurre beurre,Chocolat chocolat,Sucre sucre,int nombredefois) {
		if ((beurre.quantite>=2*nombredefois) && (chocolat.quantite>=5*nombredefois) && (sucre.quantite>=2*nombredefois)) {
			for (int i = 0; i < nombredefois; i++) {
			beurre.quantite-=2;
			chocolat.quantite-=5;
			sucre.quantite-=2;
				}			
		} else {
			System.out.println("Si vous faites "+nombredefois+" Chocolatines, il n'y aura pas assez d'ingrédients. Veuiller changer le nombre de pain ou acheter de nouveaux ingrédients.");
			
		}		
	}
	public void croissant(Farine farine,Levure levure,Sel sel,Beurre beurre,Sucre sucre,int nombredefois) {
		if ((farine.quantite>=27*nombredefois) && (levure.quantite>=1*nombredefois) && (beurre.quantite>=10*nombredefois) && (sel.quantite>=1*nombredefois) && (sucre.quantite>=3*nombredefois)) {
			for (int i = 0; i < nombredefois; i++) {
			farine.quantite-=27;
			levure.quantite-=1;
			sel.quantite-=1;
			beurre.quantite-=10;
			sucre.quantite-=3;
				}			
		} else {
			System.out.println("Si vous faites "+nombredefois+" Croissants, il n'y aura pas assez d'ingrédients. Veuiller changer le nombre de pain ou acheter de nouveaux ingrédients.");
		}		
	}
}

