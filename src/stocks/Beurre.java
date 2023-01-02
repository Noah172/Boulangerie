package stocks;

public class Beurre extends Ingrédients {

	public Beurre(String name, int quantite) {
		super(name, quantite);

	}

	@Override
	public double prixpargramme() {
		return 0.01132;
	}



}
