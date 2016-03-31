package decisiontree;

public class Leaf extends Node {

	public Leaf() {
		super();
	}

	@Override
	public void setAttribute(Attribute bestAttribute) {
		assert (bestAttribute == null);
	}
}
