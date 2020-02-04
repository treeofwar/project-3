
public class Tinsel extends TreeDecorator {
	 ChristmasTree tree;
	public Tinsel(ChristmasTree tree) {
		this.tree = tree;
	}
	public String getnamed() {
		return tree.getname() + "plus tinsel all around";
	}
	public double getCost() {
		return tree.getCost() + 2;
	}
}
