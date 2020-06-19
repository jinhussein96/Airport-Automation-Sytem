
import cse222.proje.BinarySearchTree;
import cse222.proje.CleanningPersonel;

public class DriverClass {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.add(new CleanningPersonel("omer","sayar",4,"123"));
		tree.add(new CleanningPersonel("sa","as",1,"1234"));
		tree.add(new CleanningPersonel("gh","fg",5,"12356"));
		tree.add(new CleanningPersonel("faruk","sgdf",2,"123456"));
		tree.add(new CleanningPersonel("sgkjsdf","scc",8,"1231123"));
		tree.add(new CleanningPersonel("fgfg","eqes",3,"123323"));

		tree.print();
	
	}
}
