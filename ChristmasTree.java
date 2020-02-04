//ben duker
public abstract class ChristmasTree {
	protected String name;//lets name only be used by children
	
		public String getname() {
			return name;
		}
		public abstract double getCost();//forces children to take on a getcost
}
