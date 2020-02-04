
public class Lights extends TreeDecorator {
	 ChristmasTree tree;//creates an instance of a tree
	public Lights(ChristmasTree tree) {
		this.tree = tree;
	}
	public String getnamed() {//gets the name of the tree that you are on and adds the description of the decoration
		return tree.getname() + "" + "plus strings of lights";
	}
	public double getCost() {//returns the cost of the decoration added to the tree after getting the trees cost
		return tree.getCost() + 2;
	}
}
