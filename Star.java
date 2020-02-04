
public class Star extends TreeDecorator {
	 ChristmasTree tree;//creates instance of a tree
	
		public Star(ChristmasTree tree) {
			this.tree = tree;
		}
		public String getnamed() {//gets the name of the tree that you are on and adds the description of the decoration
			return tree.getname() + "plus a star on top";
		}
		public double getCost() {//returns the cost of the decoration added to the tree after getting the trees cost
			return tree.getCost() + 6;
		}
}
