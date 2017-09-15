package convertidordolarexamen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ventana extends JFrame implements ActionListener{
   
    JTextField pNum = new JTextField();
    JButton convertidor = new JButton("Convertir");
    JButton clean = new JButton("Limpiar");
    JButton n0 = new JButton("0");
    JButton n1 = new JButton("1");
    JButton n2 = new JButton("2");
    JButton n3 = new JButton("3");
    JButton n4 = new JButton("4");
    JButton n5 = new JButton("5");
    JButton n6 = new JButton("6");
    JButton n7 = new JButton("7");
    JButton n8 = new JButton("8");
    JButton n9 = new JButton("9");
    JButton punto = new JButton(".");
    float resul = 0;
    float num = 0;
    
public void ventana(){
    setSize(1000, 1000);
    setTitle("Convertidor de Dolares a Pesos");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(true);
    setVisible(true);
    setLayout(null);
    elementos();
    
}

public void elementos(){
    JLabel titu = new JLabel("Convertidor a dolares");
    titu.setBounds(10, 10, 150, 25);
    add(titu);
    
    
    pNum.setBounds(10, 45, 650, 30);
    add(pNum);
    
    convertidor.setBounds(120, 100, 100, 30);
    convertidor.addActionListener(this);
    add(convertidor);
    
    clean.setBounds(120, 200, 100, 30);
    clean.addActionListener(this);
    add(clean);
   
    n0.setBounds(10, 220, 30, 20);
    n0.addActionListener(this);
    add(n0);
    
    n1.setBounds(10, 100, 30, 20);
    n1.addActionListener(this);
    add(n1);
    
    n2.setBounds(40, 100, 30, 20);
    n2.addActionListener(this);
    add(n2);
    
    n3.setBounds(70, 100, 30, 20);
    n3.addActionListener(this);
    add(n3);
    
    n4.setBounds(10, 140, 30, 20);
    n4.addActionListener(this);
    add(n4);
    
    n5.setBounds(40, 140, 30, 20);
    n5.addActionListener(this);
    add(n5);
    
    n6.setBounds(70, 140, 30, 20);
    n6.addActionListener(this);
    add(n6);
    
    n7.setBounds(10, 180, 30, 20);
    n7.addActionListener(this);
    add(n7);
    
    n8.setBounds(40, 180, 30, 20);
    n8.addActionListener(this);
    add(n8);
    
    n9.setBounds(70, 180, 30, 20);
    n9.addActionListener(this);
    add(n9);
    
    punto.setBounds(40, 220, 30, 20);
    punto.addActionListener(this);
    add(punto);
    
    setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(n0)){
            num = 0;
            pNum.setText(String.valueOf(num));
        }
        else
            if(e.getSource().equals(n1)){
                num = 1;
                pNum.setText(String.valueOf(num));
            }
        else
            if(e.getSource().equals(n2)){
                num = 2;
                pNum.setText(String.valueOf(num));
            }
        else
            if(e.getSource().equals(n3)){
                num = 3;
                pNum.setText(String.valueOf(num));
            }
        else
            if(e.getSource().equals(n4)){
                num = 4;
                pNum.setText(String.valueOf(num));
            }
        else
            if(e.getSource().equals(n5)){
                num = 5;
                pNum.setText(String.valueOf(num));
            }
        else
            if(e.getSource().equals(n6)){
                num = 6;
                pNum.setText(String.valueOf(num));
            }
        else
            if(e.getSource().equals(n7)){
                num = 7;
                pNum.setText(String.valueOf(num));
            }
        else
            if(e.getSource().equals(n8)){
                num = 8;
                pNum.setText(String.valueOf(num));
            }
        else
            if(e.getSource().equals(n9)){
                num = 9;
                pNum.setText(String.valueOf(num));
            }
        if(e.getSource().equals(convertidor)){
            resul = Integer.parseInt(pNum.getText())/17;
            JOptionPane.showMessageDialog(this, "La conversion es: " + resul);
        }
        }
            
    }
