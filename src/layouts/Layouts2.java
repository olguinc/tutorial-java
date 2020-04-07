package layouts;

import java.awt.*;
import javax.swing.*;

public class Layouts2 {

	public static void main(String[] args) {
		
		MarcoLayout2 m = new MarcoLayout2();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		m.setVisible(true);
	}
}

class MarcoLayout2 extends JFrame {

	public MarcoLayout2() {

		setVisible(true);

		setTitle("Layouts Clase 82");

		setBounds(350, 250, 500, 300);

		PanelLayout2 p = new PanelLayout2();
		
		PanelLayout3 p2 = new PanelLayout3();
		
		add(p, BorderLayout.NORTH);
		
		add(p2, BorderLayout.SOUTH);
	}
}

class PanelLayout2 extends JPanel {

	public PanelLayout2() {
		
//		setLayout(new FlowLayout(FlowLayout.CENTER,75,100));
		
		setLayout(new FlowLayout(FlowLayout.LEFT));

		add(new JButton("Amarillo"));

		add(new JButton("Rojo"));
	}
}

class PanelLayout3 extends JPanel {

	public PanelLayout3() {
				
		setLayout(new BorderLayout(5,5));
		
		add(new JButton("Azul"),BorderLayout.WEST);
		
		add(new JButton("Verde"),BorderLayout.EAST);
		
		add(new JButton("Blanco"),BorderLayout.CENTER);
	}
}
