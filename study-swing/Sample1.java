import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Sample1 extends JFrame implements ActionListener {
	public static void main(String[] args) {
		Sample1 frame = new Sample1("title");
		frame.setVisible(true);

	}

	public Sample1(String title) {
		setTitle(title);
		setBounds(100, 100, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		JButton btn = new JButton("Push");
		btn.addActionListener(this);

		p.add(btn);
		getContentPane().add(p, BorderLayout.CENTER);

	}

	public void actionPerformed(ActionEvent e) {
		JLabel label = new JLabel("Push A Button");
		JOptionPane.showMessageDialog(this, label);
	}

}
