package stocks;

public class Sucre extends Ingrédients {

	public Sucre(String name, int quantite) {
		super(name, quantite);
	}

	@Override
	public double prixpargramme() {
		return 0.00139;
	}

}
