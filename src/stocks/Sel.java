package stocks;

public class Sel extends Ingrédients {

	public Sel(String name, int nombre) {
		super(name, nombre);
	}

	@Override
	public double prixpargramme() {
		return 0.0006;
	}

}
