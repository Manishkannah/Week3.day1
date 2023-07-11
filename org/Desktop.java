package week3.org;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop size from ------> Desktop");
	}
	public static void main(String[] args) {
		Desktop des = new Desktop();
		des.computerMode();
		des.desktopSize();
	}
	

}
