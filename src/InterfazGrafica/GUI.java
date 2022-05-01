package InterfazGrafica;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	
	private static JLabel titlelabel;
	private static JLabel namelabel;
	private static JTextField nameText;
	private static JLabel emaillabel;
	private static JTextField emailText;
	private static JButton button;
	private static JLabel success;
	private static JButton button2;
	private static JButton button3;
	private static JButton button4;
	private static JLabel titlelabel2;
	private static JLabel correolabel;
	private static JTextField correoText;
	private static JLabel nombrelabel;
	private static JTextField nombreText;
	private static JButton button5;
	private static JLabel titlelabel3;
	private static JLabel correodlabel;
	private static JTextField correodText;
	private static JLabel nombredlabel;
	private static JTextField nombredText;
	private static JLabel nombrealabel;
	private static JTextField nombreaText;
	private static JLabel descripcionlabel;
	private static JTextField descripcionText;
	private static JLabel tactividadlabel;
	private static JTextField tactividadText;
	private static JLabel fechalabel;
	private static JTextField fechaText;
	private static JLabel horalabel;
	private static JTextField horaText;
	private static JButton button6;
	private static JLabel titlelabel4;
	private static JLabel nuevalabel;
	private static JTextField nuevaText;
	private static JButton button7;
	
	public static void main(String[] args) {
		
		/*Ventana Busca tu proyecto*/
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		panel.setBackground(Color.black);
		frame.setSize(500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		titlelabel = new JLabel("Busca tu proyecto");
		titlelabel.setBounds(150, 10, 130, 25);
		titlelabel.setForeground(Color.white);
		panel.add(titlelabel);
		
		namelabel = new JLabel("Nombre del proyecto");
		namelabel.setBounds(10, 40, 130, 25);
		namelabel.setForeground(Color.white);
		panel.add(namelabel);
		
		nameText = new JTextField(20);
		nameText.setBounds(150, 40, 165, 25);
		nameText.setBackground(Color.black);
		nameText.setForeground(Color.white);
		panel.add(nameText);
		
		emaillabel = new JLabel("Correo del dueño");
		emaillabel.setBounds(10, 70, 130, 25);
		emaillabel.setForeground(Color.white);
		panel.add(emaillabel);
		
		emailText = new JTextField(20);
		emailText.setBounds(150, 70, 165, 25);
		emailText.setBackground(Color.black);
		emailText.setForeground(Color.white);
		panel.add(emailText);
		
		button = new JButton("Buscar");
		button.setBounds(150, 110, 80, 25);
		button.addActionListener(new GUI());
		button.setBackground(Color.green);
		button.setForeground(Color.darkGray);
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(150, 140, 300, 25);
		success.setForeground(Color.white);
		panel.add(success);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = nameText.getText();
		String email = emailText.getText();
		success.setText("Buscando el proyecto...");
		System.out.println(name + ", " + email);
		
		/*Ventana opciones*/
		
		JFrame frame2 = new JFrame();
		JPanel panel2 = new JPanel();

		panel2.setBackground(Color.black);
		frame2.setSize(310, 130);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.add(panel2);
		
		button2 = new JButton("Añadir participantes");
		button2.setBounds(150, 110, 80, 25);
		button2.setBackground(Color.darkGray);
		button2.setForeground(Color.white);
		panel2.add(button2);
		
		button3 = new JButton("Añadir actividad");
		button3.setBounds(150, 110, 80, 25);
		button3.setBackground(Color.darkGray);
		button3.setForeground(Color.white);
		panel2.add(button3);
		
		button4 = new JButton("Modificar actividad");
		button4.setBounds(150, 110, 80, 25);
		button4.setBackground(Color.darkGray);
		button4.setForeground(Color.white);
		panel2.add(button4);
		
		frame2.setVisible(true);
		
		/*Ventana Añadir participantes*/
		
		JPanel panel3 = new JPanel();
		JFrame frame3 = new JFrame();
		panel3.setBackground(Color.black);
		frame3.setSize(500, 250);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.add(panel3);
		
		panel3.setLayout(null);
		
		titlelabel2 = new JLabel("Añadir participante");
		titlelabel2.setBounds(150, 10, 130, 25);
		titlelabel2.setForeground(Color.white);
		panel3.add(titlelabel2);
		
		correolabel = new JLabel("Correo participante");
		correolabel.setBounds(10, 40, 130, 25);
		correolabel.setForeground(Color.white);
		panel3.add(correolabel);
		
		correoText = new JTextField(20);
		correoText.setBounds(150, 40, 165, 25);
		correoText.setBackground(Color.black);
		correoText.setForeground(Color.white);
		panel3.add(correoText);
		
		nombrelabel = new JLabel("Nombre");
		nombrelabel.setBounds(10, 70, 130, 25);
		nombrelabel.setForeground(Color.white);
		panel3.add(nombrelabel);
		
		nombreText = new JTextField(20);
		nombreText.setBounds(150, 70, 165, 25);
		nombreText.setBackground(Color.black);
		nombreText.setForeground(Color.white);
		panel3.add(nombreText);
		
		button5 = new JButton("Añadir");
		button5.setBounds(150, 110, 80, 25);
		button5.setBackground(Color.green);
		button5.setForeground(Color.darkGray);
		panel3.add(button5);
		
		frame3.setVisible(true);
		
		/*Ventana Añadir actividad*/
		
		JPanel panel4 = new JPanel();
		JFrame frame4 = new JFrame();
		panel4.setBackground(Color.black);
		frame4.setSize(500, 400);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.add(panel4);
		
		panel4.setLayout(null);
		
		titlelabel3 = new JLabel("Añadir actividad");
		titlelabel3.setBounds(150, 10, 130, 25);
		titlelabel3.setForeground(Color.white);
		panel4.add(titlelabel3);
		
		correodlabel = new JLabel("Correo del dueño");
		correodlabel.setBounds(10, 40, 130, 25);
		correodlabel.setForeground(Color.white);
		panel4.add(correodlabel);
		
		correodText = new JTextField(20);
		correodText.setBounds(150, 40, 165, 25);
		correodText.setBackground(Color.black);
		correodText.setForeground(Color.white);
		panel4.add(correodText);
		
		nombredlabel = new JLabel("Nombre");
		nombredlabel.setBounds(10, 70, 130, 25);
		nombredlabel.setForeground(Color.white);
		panel4.add(nombredlabel);
		
		nombredText = new JTextField(20);
		nombredText.setBounds(150, 70, 165, 25);
		nombredText.setBackground(Color.black);
		nombredText.setForeground(Color.white);
		panel4.add(nombredText);
		
		nombrealabel = new JLabel("Nombre Actividad");
		nombrealabel.setBounds(10, 100, 130, 25);
		nombrealabel.setForeground(Color.white);
		panel4.add(nombrealabel);
		
		nombreaText = new JTextField(20);
		nombreaText.setBounds(150, 100, 165, 25);
		nombreaText.setBackground(Color.black);
		nombreaText.setForeground(Color.white);
		panel4.add(nombreaText);
		
		descripcionlabel = new JLabel("Descripción");
		descripcionlabel.setBounds(10, 130, 130, 25);
		descripcionlabel.setForeground(Color.white);
		panel4.add(descripcionlabel);
		
		descripcionText = new JTextField(20);
		descripcionText.setBounds(150, 130, 165, 65);
		descripcionText.setBackground(Color.black);
		descripcionText.setForeground(Color.white);
		panel4.add(descripcionText);
		
		tactividadlabel = new JLabel("Tipo de actividad");
		tactividadlabel.setBounds(10, 200, 130, 25);
		tactividadlabel.setForeground(Color.white);
		panel4.add(tactividadlabel);
		
		tactividadText = new JTextField(20);
		tactividadText.setBounds(150, 200, 165, 25);
		tactividadText.setBackground(Color.black);
		tactividadText.setForeground(Color.white);
		panel4.add(tactividadText);
		
		fechalabel = new JLabel("Fecha");
		fechalabel.setBounds(10, 230, 130, 25);
		fechalabel.setForeground(Color.white);
		panel4.add(fechalabel);
		
		fechaText = new JTextField(20);
		fechaText.setBounds(150, 230, 165, 25);
		fechaText.setBackground(Color.black);
		fechaText.setForeground(Color.white);
		panel4.add(fechaText);
		
		horalabel = new JLabel("Hora");
		horalabel.setBounds(10, 260, 130, 25);
		horalabel.setForeground(Color.white);
		panel4.add(horalabel);
		
		horaText = new JTextField(20);
		horaText.setBounds(150, 260, 165, 25);
		horaText.setBackground(Color.black);
		horaText.setForeground(Color.white);
		panel4.add(horaText);
		
		button6 = new JButton("Añadir");
		button6.setBounds(150, 310, 80, 25);
		button6.setBackground(Color.green);
		button6.setForeground(Color.darkGray);
		panel4.add(button6);
		
		frame4.setVisible(true);
		
		/*Ventana modificar actividad*/
		
		JPanel panel5 = new JPanel();
		JFrame frame5 = new JFrame();
		panel5.setBackground(Color.black);
		frame5.setSize(500, 200);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.add(panel5);
		
		panel5.setLayout(null);
		
		titlelabel4 = new JLabel("Modificar fecha");
		titlelabel4.setBounds(150, 10, 130, 25);
		titlelabel4.setForeground(Color.white);
		panel5.add(titlelabel4);
		
		nuevalabel = new JLabel("Nueva fecha");
		nuevalabel.setBounds(10, 40, 130, 25);
		nuevalabel.setForeground(Color.white);
		panel5.add(nuevalabel);
		
		nuevaText = new JTextField(20);
		nuevaText.setBounds(150, 40, 165, 25);
		nuevaText.setBackground(Color.black);
		nuevaText.setForeground(Color.white);
		panel5.add(nuevaText);
		
		button7 = new JButton("Modificar");
		button7.setBounds(150, 90, 90, 25);
		button7.setBackground(Color.green);
		button7.setForeground(Color.darkGray);
		panel5.add(button7);
		
		frame5.setVisible(true);
		
	}

}
