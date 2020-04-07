package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AreaTexto2 {

	public static void main(String[] args) {

		MarcoArea2 m = new MarcoArea2();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		m.setVisible(true);
	}
}

class MarcoArea2 extends JFrame {

	private JPanel lamina_botones;
	private JButton btn1, btn2;
	private JTextArea area;
	private JScrollPane lamina_barras;

	public MarcoArea2() {

		setTitle("Areas de Texto Clase 91");

		setBounds(350, 250, 500, 350);

		setLayout(new BorderLayout());

		lamina_botones = new JPanel();

		btn1 = new JButton("Insertar");

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.append("Texto agregado con la funcion append.");
			}
		});

		lamina_botones.add(btn1);

		btn2 = new JButton("Salto Línea");

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				boolean saltar = !area.getLineWrap();

				area.setLineWrap(saltar);
				
				btn2.setText(saltar ? "Quitar salto" : "Salto de linea");

//				if (saltar) {
//					btn2.setText("Quitar salto");
//				} else {
//					btn2.setText("Salto de linea");
//				}
			}
		});

		lamina_botones.add(btn2);

		add(lamina_botones, BorderLayout.SOUTH);

		area = new JTextArea(8, 20);

		lamina_barras = new JScrollPane(area);

		add(lamina_barras, BorderLayout.CENTER);
	}
}
