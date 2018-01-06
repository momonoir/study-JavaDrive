import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SSample6 extends JFrame {
	public static void main(String[] args) {
		SSample6 frame = new SSample6("タイトル");
		frame.setVisible(true);
	}

	public SSample6(String title) {
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("ボタン");

		Container contentPane = getContentPane();
		contentPane.add(btn, BorderLayout.NORTH);
	}
}
