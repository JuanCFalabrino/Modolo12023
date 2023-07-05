import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio20 extends JFrame{
int n1 = 0, n2 = 0,n3=0, pro;
JLabel p1,p2,p3,p4,promedio;
JTextField nota1,nota2,nota3;
JButton boton; 

public Ejercicio20() { 
p1 = new JLabel("Ingrese la nota del primer examen");
p1.setBounds(50,25,210,70);

nota1 = new JTextField(10);
nota1.setBounds(280,45,80,25);
p2 = new JLabel("Ingrese la nota del segundo examen");

p2.setBounds(50,65,210,70);
nota2 = new JTextField(10);
nota2.setBounds(280,85,80,25);
p3 = new JLabel("Ingrese la nota del tercer examen");
p3.setBounds(50,105,210,70);



nota3 = new JTextField(10);
nota3.setBounds(280,125,80,25);
boton = new JButton("Promediar");

boton.setBounds(100, 160, 100, 30);
p4 = new JLabel("Su promedio es :");
p4.setBounds(50,195,200,100);


promedio = new JLabel();
promedio.setBounds(250,195,200,100);


Container panel = getContentPane();
panel.setLayout(null);
panel.add(p1);
panel.add(p2);
panel.add(p3);
panel.add(p4);
panel.add(nota1);
panel.add(nota2);
panel.add(nota3);
panel.add(boton);
panel.add(promedio);
panel.setBackground(Color.pink);

boton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
n1 = Integer.parseInt(nota1.getText());
n2 = Integer.parseInt(nota2.getText());
n3 = Integer.parseInt(nota3.getText());
pro = (n1+n2+n3)/3;
promedio.setText(""+ pro);
}
});
} 

public static void main(String args[]) {
Ejercicio20 pro= new Ejercicio20();
pro.setVisible(true);
pro.setSize(450, 400);
pro.setLocation(250, 100);
pro.setTitle("Promedio de ");
} 
}
