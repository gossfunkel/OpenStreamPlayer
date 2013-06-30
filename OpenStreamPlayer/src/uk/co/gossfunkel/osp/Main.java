package uk.co.gossfunkel.osp;

public class Main {
	
	private static Player player;
	private static GUI gui;
	
	private static Thread playerThread;
	private static Thread guiThread;
	
	public static void main(String[] args) {
		// show splash
		// log in
		// go through friend list checking who's online
		// populate lists
		player = new Player();
		gui = new GUI();
		playerThread = new Thread(player);
		guiThread = new Thread(gui);
	}

}
