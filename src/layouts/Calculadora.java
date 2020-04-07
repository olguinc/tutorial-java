package layouts;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {

		MarcoCalculadora marco = new MarcoCalculadora();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.setVisible(true);
	}
}

class MarcoCalculadora extends JFrame {

	public MarcoCalculadora() {

		setTitle("Calculadora Clase 83");

		setBounds(400, 200, 450, 300);

		PanelCalc p = new PanelCalc();

		add(p);
//		pack(); // Da el tamaño por defecto sin el setBounds

	}
}

class PanelCalc extends JPanel {

	private JPanel lamina2;

	private JButton display;

	private boolean principio;

	private double resultado;

	private String ultimaOperacion;

	public PanelCalc() {

		principio = true;

		setLayout(new BorderLayout());

		display = new JButton("0");

		display.setEnabled(false);

		add(display, BorderLayout.NORTH);

		lamina2 = new JPanel();

		lamina2.setLayout(new GridLayout(4, 4));

		ActionListener insertar = new InsertaNumero();

		ActionListener orden = new AccionOrden();

		agregarBoton("7", insertar);

		agregarBoton("8", insertar);

		agregarBoton("9", insertar);

		agregarBoton("/", orden);

		agregarBoton("4", insertar);

		agregarBoton("5", insertar);

		agregarBoton("6", insertar);

		agregarBoton("*", orden);

		agregarBoton("1", insertar);

		agregarBoton("2", insertar);

		agregarBoton("3", insertar);

		agregarBoton("-", orden);

		agregarBoton("0", insertar);

		agregarBoton(",", orden);

		agregarBoton("=", orden);

		agregarBoton("+", orden);

		add(lamina2, BorderLayout.CENTER);

		ultimaOperacion = "=";
	}

	private void agregarBoton(String rotulo, ActionListener oyente) {

		JButton btn = new JButton(rotulo);

		btn.addActionListener(oyente);

		lamina2.add(btn);
	}

	private class InsertaNumero implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String entrada = e.getActionCommand();

			if (principio) {

				display.setText("");

				principio = false;
			}

			display.setText(display.getText() + entrada);
		}

	}

	private class AccionOrden implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String operacion = e.getActionCommand();

			calcular(Double.parseDouble(display.getText()));

			ultimaOperacion = operacion;

			principio = true;

		}

		public void calcular(double x) {

			if (ultimaOperacion.equals("+")) {

				resultado += x;

			} else if (ultimaOperacion.equals("=")) {

				resultado = x;

			} else if (ultimaOperacion.equals("-")) {

				resultado -= x;
			} else if (ultimaOperacion.equals("*")) {

				resultado *= x;

			} else if (ultimaOperacion.equals("/")) {

				resultado /= x;
			}

			display.setText("" + resultado);
		}
	}
}
