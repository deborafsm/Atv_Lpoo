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
public class formulaBaskara extends JFrame {

    JLabel lblValorA, lblValorB, lblValorC, lblXi, lblXii;
    JTextField txtValorA, txtValorB, txtValorC,txtXi,txtXii;
    JButton btnCalcular;

    public formulaBaskara() {
        super("Formula de Baskara");

        Container tela = getContentPane();
        setLayout(null);
        setResizable(false);
        lblValorA = new JLabel("Valor A :");
        lblValorA.setBounds(20, 30, 80, 20);//larg larg larg altura//Define Limites
        lblValorA.setForeground(Color.black);//plano de fundo 
        lblValorA.setFont(new Font("Arial", Font.PLAIN, 12)); //Define configurações da fonte
        tela.add(lblValorA);

        lblValorB = new JLabel("Valor B :");
        lblValorB.setBounds(20, 90, 80, 20);//larg larg larg altura//Define Limites
        lblValorB.setForeground(Color.black);//plano de fundo 
        lblValorB.setFont(new Font("Arial", Font.PLAIN, 12)); //Define configurações da fonte
        tela.add(lblValorB);

        lblValorC = new JLabel("Valor C :");
        lblValorC.setBounds(20, 150, 80, 20);//larg larg larg altura//Define Limites
        lblValorC.setForeground(Color.black);//plano de fundo 
        lblValorC.setFont(new Font("Arial", Font.PLAIN, 12)); //Define configurações da fonte
        tela.add(lblValorC);

        lblXi = new JLabel("Xi");
        lblXi.setBounds(150, 60, 80, 20);//larg larg larg altura//Define Limites
        lblXi.setForeground(Color.black);//plano de fundo 
        lblXi.setFont(new Font("Arial", Font.PLAIN, 12)); //Define configurações da fonte
        tela.add(lblXi);
        
        lblXii = new JLabel("Xii");
        lblXii.setBounds(150, 120, 80, 20);//larg larg larg altura//Define Limites
        lblXii.setForeground(Color.black);//plano de fundo 
        lblXii.setFont(new Font("Arial", Font.PLAIN, 12)); //Define configurações da fonte
        tela.add(lblXii);lblXi = new JLabel("Xii");
        
        txtXi = new JTextField();
        txtXi.setBounds(170, 60, 80, 20);//larg larg larg altura//Define Limites
        txtXi.setForeground(Color.black);//plano de fundo 
        txtXi.setFont(new Font("Arial", Font.PLAIN, 12)); //Define configurações da fonte
        tela.add(txtXi);
        
        txtXii = new JTextField();
        txtXii.setBounds(170, 120, 80, 20);//larg larg larg altura//Define Limites
        txtXii.setForeground(Color.black);//plano de fundo 
        txtXii.setFont(new Font("Arial", Font.PLAIN, 12)); //Define configurações da fonte
        tela.add(txtXii);
        

        txtValorA = new JTextField(); // Largura do campo de texto
        txtValorA.setBounds(20, 60, 100, 20);//>esq e direita< / >baixo e cima< larg/ altura 
        tela.add(txtValorA);

        txtValorB = new JTextField(); // Largura do campo de texto
        txtValorB.setBounds(20, 120, 100, 20);//>esq e direita< / >baixo e cima< larg/ altura 
        tela.add(txtValorB);

        txtValorC = new JTextField(); // Largura do campo de texto
        txtValorC.setBounds(20, 180, 100, 20);//>esq e direita< / >baixo e cima< larg/ altura 
        tela.add(txtValorC);

        btnCalcular = new JButton("Verificar");
        btnCalcular.setBounds(170, 170, 105, 30);
        tela.add(btnCalcular);

        //Tela
        setSize(350, 300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
