package Day0317.변수초기화;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g = new Game("러스트", 50000); //이름, 가격
		Game g2 = new Game("돈스타브", 10000); //이름, 가격
		Game g3 = new Game();
		System.out.println(g.toString());
		System.out.println(g2.toString());
		
		System.out.println(Game.cnt);
		Game.printCount();
	}
}
