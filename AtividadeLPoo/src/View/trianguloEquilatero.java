/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DeboraDev
 */
public class trianguloEquilatero  extends JFrame{
    JLabel lblLado1,lblLado2,lblLado3,lblResp;
    JTextField txtLado1,txtLado2,txtLado3;
    JButton btnVerificar;

    public trianguloEquilatero() {
        super("Triangulo Equilatero");
        
        Container tela = getContentPane();
        setLayout(null);
        setResizable(false);
        lblLado1 = new JLabel("Lado 1:");
        lblLado1.setBounds(20, 30, 80, 20);//larg larg larg altura//Define Limites
        lblLado1.setForeground(Color.black);//plano de fundo 
        lblLado1.setFont(new Font("Arial", Font.PLAIN, 12)); //Define configurações da fonte
        tela.add(lblLado1);
        
        lblLado2 = new JLabel("Lado 2:");
        lblLado2.setBounds(20, 90, 80, 20);//larg larg larg altura//Define Limites
        lblLado2.setForeground(Color.black);//plano de fundo 
        lblLado2.setFont(new Font("Arial", Font.PLAIN, 12)); //Define configurações da fonte
        tela.add(lblLado2);
        
        lblLado3 = new JLabel("Lado 3:");
        lblLado3.setBounds(20, 150, 80, 20);//larg larg larg altura//Define Limites
        lblLado3.setForeground(Color.black);//plano de fundo 
        lblLado3.setFont(new Font("Arial", Font.PLAIN, 12)); //Define configurações da fonte
        tela.add(lblLado3);
        
        lblResp = new JLabel("Resposta");
        lblResp.setBounds(20, 250, 80, 20);//larg larg larg altura//Define Limites
        lblResp.setForeground(Color.black);//plano de fundo 
        lblResp.setFont(new Font("Arial", Font.PLAIN, 12)); //Define configurações da fonte
        tela.add(lblResp);
        
        txtLado1 = new JTextField(); // Largura do campo de texto
        txtLado1.setBounds(20, 60, 300, 20);//>esq e direita< / >baixo e cima< larg/ altura 
        tela.add(txtLado1);
        
        txtLado2= new JTextField(); // Largura do campo de texto
        txtLado2.setBounds(20, 120, 300, 20);//>esq e direita< / >baixo e cima< larg/ altura 
        tela.add(txtLado2);
        
        txtLado3 = new JTextField(); // Largura do campo de texto
        txtLado3.setBounds(20, 180, 300, 20);//>esq e direita< / >baixo e cima< larg/ altura 
        tela.add(txtLado3);
        
        btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(200, 250, 105, 30);
        tela.add(btnVerificar);
        
        //Tela
        setSize(400,350);
        setVisible(true);
        setLocationRelativeTo(null);
    
    }
    
    
        
}
