package stocks;

public class Levure extends Ingrédients {

	public Levure(String name, int nombre) {
		super(name, nombre);
	}

	@Override
	public double prixpargramme() {
		return 0.0108;
	}

}
