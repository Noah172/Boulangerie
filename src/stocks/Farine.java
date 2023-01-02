package stocks;

public class Farine extends Ingrédients {

	public Farine(String name, int quantite) {
		super(name, quantite);

	}

	@Override
	public double prixpargramme() {
		return 0.00165;
	}

}
