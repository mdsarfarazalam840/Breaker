
import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		JFrame obj1 = new JFrame();
		Gameplay gamePlay = new Gameplay();
		obj1.setBounds(10 , 10 , 700 , 600);
		obj1.setTitle("Breaking Break");
		obj1.setResizable(false);
		obj1.setVisible(true);
		obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj1.add(gamePlay);

	}

}
