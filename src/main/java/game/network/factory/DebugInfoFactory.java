package game.network.factory;

public class DebugInfoFactory {

	private int id = 0;

	public String nextId() {
		String string = "" + id;
		id++;
		return string;
	}

}
