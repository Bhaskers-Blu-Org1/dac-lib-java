package app;

import org.apache.milagro.amcl.FP256BN.BIG;

public class Index {
	int i;
	int j;
	Object attribute;
	
	public static Object ContainedIn(Index[] indices, int i, int j) {
		for (Index index : indices) {
			if (index.i == i && index.j == j) {
				return index.attribute;
			}
		}
		return null;
	}
}