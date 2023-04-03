import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{
    //variables
    private JTextField texto1;
    private JLabel label1, label2, label3, label4;
    private JButton boton1;
    
    //fin variabels

    //constructores

    public Bienvenida(){
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());  //con esto buscamos la imagen y la cargamos. Recordar que solo es el icono

        ImageIcon imagen = new ImageIcon("images/logo-coca.png"); //al cargar una imagen adentro de un label es ams facil. Con esta linea lo invocamos
        label1 = new JLabel(imagen);// y aca colocamos IMAGEN, osea la vaiable con la imagen, adentro del label1
        label1.setBounds(25,15,300,150); 
        add(label1);

        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono", 3,18));// esta linea  se da todos los atributos al texto, primero se coloca la Font, despues con los numeros del 1 al 3 se elejige(0 el texto sale normal, con 1 el tecto sale en negrita, con 2 el texto sale en cursiva, con el 3 el teto sale con negrita y en cursiva); en tercer lugar elegijos el tamaño del texto en px;
        label2.setForeground(new Color(255,255,255)); // con este codigo le damos color a las letras
        add(label2);

        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Andale Mono", 1,12));// esta linea  se da todos los atributos al texto, primero se coloca la Font, despues con los numeros del 1 al 3 se elejige(0 el texto sale normal, con 1 el tecto sale en negrita, con 2 el texto sale en cursiva, con el 3 el teto sale con negrita y en cursiva); en tercer lugar elegijos el tamaño del texto en px;
        label3.setForeground(new Color(255,255,255)); // con este codigo le damos color a las letras
        add(label3);

        label4 = new JLabel("© 2017 the Coca-Cola Company");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono", 1,12));// esta linea  se da todos los atributos al texto, primero se coloca la Font, despues con los numeros del 1 al 3 se elejige(0 el texto sale normal, con 1 el tecto sale en negrita, con 2 el texto sale en cursiva, con el 3 el teto sale con negrita y en cursiva); en tercer lugar elegijos el tamaño del texto en px;
        label4.setForeground(new Color(255,255,255)); // con este codigo le damos color a las letras
        add(label4);


        texto1 = new JTextField ();
        texto1.setBounds(45,240,255,25);
        texto1.setBackground(new Color(224,224,224));
        texto1.setFont(new Font("Andale Mono", 1,14));//cambiar el txt 1 por label4
        texto1.setForeground(new Color(255,0,0));//cambiar el txt 1 por label4, si me preguntan a priori esto esta mal
        add(texto1);

        boton1 = new JButton("Ingresar");
        boton1.setBounds(125,280,100,30);
        boton1.setBackground(new Color(255,255,255));
        boton1.setFont(new Font("Andale Mono",1,14));
        boton1.setForeground(new Color(255,0,0));
        boton1.addActionListener(this);
        add(boton1);

    }

    // FIN constructores

    //eventos

public void actionPerformed(ActionEvent nahuel){

    if(nahuel.getSource() == boton1){

    }

    }
    //FIN eventos

    //inicio de main, el main es el recuadro de nuestras variables y eventos, sin este recuadro, todo lo que codeamos estaria flotando en el aire.

    public static void main(String[] args) {

        Bienvenida Formulario1 = new Bienvenida();
        Formulario1.setBounds(0,0,350,450);
        Formulario1.setVisible(true);
        Formulario1.setResizable(false);
        Formulario1.setLocationRelativeTo(null);
        //
    
    }

    //Finalizacion de main


}