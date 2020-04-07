package swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class CampoPassword {

	public static void main(String[] args) {

		MarcoPass m = new MarcoPass();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoPass extends JFrame {

	public MarcoPass() {

		setTitle("Validar Password Clase 89");

		setBounds(350, 200, 550, 400);

		LaminaPass p = new LaminaPass();

		add(p);

		setVisible(true);
	}
}

class LaminaPass extends JPanel {

	JPasswordField pass;

	public LaminaPass() {

		setLayout(new BorderLayout());

		JPanel lamina_superior = new JPanel();

		lamina_superior.setLayout(new GridLayout(2, 2));

		add(lamina_superior, BorderLayout.NORTH);

		JLabel etq1 = new JLabel("Usuario");

		JLabel etq2 = new JLabel("Contrseña");

		JTextField usuario = new JTextField(15);

		VerificarPass evento = new VerificarPass();

		pass = new JPasswordField(15);

		pass.getDocument().addDocumentListener(evento);

		lamina_superior.add(etq1);

		lamina_superior.add(usuario);

		lamina_superior.add(etq2);

		lamina_superior.add(pass);

		JButton enviar = new JButton("Enviar");

		add(enviar, BorderLayout.SOUTH);
	}

	class VerificarPass implements DocumentListener {

		@Override
		public void insertUpdate(DocumentEvent e) {

			char[] contrasena;

			contrasena = pass.getPassword();

			if (contrasena.length < 8 || contrasena.length > 12) {
				pass.setBackground(Color.red);
			} else {
				pass.setBackground(Color.white);
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {

			char[] contrasena;

			contrasena = pass.getPassword();

			if (contrasena.length < 8 || contrasena.length > 12) {
				pass.setBackground(Color.red);
			} else {
				pass.setBackground(Color.white);
			}
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
		}
	}
}
