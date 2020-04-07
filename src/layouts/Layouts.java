package layouts;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts {

	public static void main(String[] args) {

		MarcoLayout1 m = new MarcoLayout1();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		m.setVisible(true);
	}
}

class MarcoLayout1 extends JFrame {

	public MarcoLayout1() {

		setVisible(true);

		setTitle("Layout clase 81");

		setBounds(350, 250, 300, 200);

		PanelLayout1 p = new PanelLayout1();

		p.setLayout(new FlowLayout(FlowLayout.LEFT));

		add(p);
	}
}

class PanelLayout1 extends JPanel {

	public PanelLayout1() {

		add(new JButton("Amarillo"));

		add(new JButton("Rojo"));
	}
}