package net.idk.visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.idk.clases.Clave;

public class MiVentana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JFrame jf;
	private JTextField tf_entrada;
	private JTextField tf_salida;
	private JButton bt_ofuscar;
	
	
	public void ventana() 
	{ 		
        jf = new JFrame("Ofuscar Claves");        
        jf.setLayout(null);
        
        JLabel lb_entrada=new JLabel("Entrada:");
        lb_entrada.setBounds(10,10,100,20);
        tf_entrada = new JTextField();
        tf_entrada.setBounds(10,30,150,20);
        JLabel lb_salida=new JLabel("Salida:");
        lb_salida.setBounds(10,60,100,20);
        tf_salida = new JTextField();
        tf_salida.setBounds(10,80,150,20);
        bt_ofuscar = new JButton("OFUSCAR");
        bt_ofuscar.setBounds(10,110,150,20);
        bt_ofuscar.addActionListener(this);
        
        
        jf.add(lb_entrada);        
        jf.add(tf_entrada);
        jf.add(lb_salida);
        jf.add(tf_salida);        
        jf.add(bt_ofuscar);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(180, 170);
        jf.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String entrada = tf_entrada.getText();
		Clave clave=new Clave(entrada);
		String salida = clave.getClave();
		tf_salida.setText(salida);		
	}

}
