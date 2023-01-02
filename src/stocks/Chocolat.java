package stocks;

public class Chocolat extends Ingrédients {

	public Chocolat(String name, int quantite) {
		super(name, quantite);
	}

	@Override
	public double prixpargramme() {
		return 0.006;
	}

}
