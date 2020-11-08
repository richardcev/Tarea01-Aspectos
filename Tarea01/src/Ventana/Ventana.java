package Ventana;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	JPanel panel;

	ActionListener rojo;
	public Ventana() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Tarea1");
		this.setLocationRelativeTo(null);
		//this.getContentPane().setBackground(Color.BLUE);
		iniciarComponentes();
		colocarBotones();
		fondoRojo();
		fondoVerde();
		fondoAzul();
		actividadUsuario();

		
	}
	
	public void iniciarComponentes() {
		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		JLabel etiqueta = new JLabel("Cambie de color");
		panel.add(etiqueta);
	
	}
	
	public void colocarBotones() {
		
		boton1= new JButton("Rojo");
		boton2= new JButton("Verde");
		boton3= new JButton("Azul");
		boton4= new JButton("Actividad del usuario");
		boton1.setBounds(50, 100, 100, 40);
		boton1.setForeground(Color.RED);
		boton2.setBounds(200, 100, 100, 40);
		boton2.setForeground(Color.GREEN);
		boton3.setBounds(350, 100, 100, 40);
		boton3.setForeground(Color.BLUE);
		boton4.setBounds(50, 300, 180, 40);
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
			
	}
	
	public void fondoRojo() {
		rojo= new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel.setBackground(Color.RED);
				
			}
			
		};
		boton1.addActionListener(rojo);
	}
	

	
	public void fondoVerde() {
		ActionListener verde= new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg1) {
				panel.setBackground(Color.GREEN);
				
			}
			
		};
		boton2.addActionListener(verde);
		
	}
	
	public void fondoAzul() {
		ActionListener azul= new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg2) {
				panel.setBackground(Color.BLUE);
				
			}			
		};
		boton3.addActionListener(azul);
		
	}
	
	public void actividadUsuario() {
		ActionListener actividad= new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg2) {
				System.out.println("Informacion");
				
				
			}			
		};
		boton4.addActionListener(actividad);
		
	}
	
	
	

}
