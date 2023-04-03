import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

    //variables 
    private JLabel label1,label2;
    private JCheckBox     check1;
    private JButton boton1, boton2;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;    
    //FIN VARIBLES

//constructor
    public Licencia (){
        setLayout(null);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());//invocamos a la imagen

        label1 = new JLabel ("TERMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono", 1 , 14));
        label1.setForeground(new Color (0,0,0));
        add(label1);  // con todo esto, creamos el primer DIV

        textarea1 = new JTextArea();
        textarea1.setEditable(false);//con esta linea le prohibimos al usuario editar el texto adentro de este div
        textarea1.setFont(new Font("Andale Mono",0,9));
        textarea1.setText("Terminos y condiciones");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10,40,575,200);
        add(scrollpane1);//con esto temrinamos de crear el 2 DVI, con scroll

        check1 = new JCheckBox("Yo Acepto");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener(this);
        add(check1);//creamos el primer check

        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);//con esta liena le ponemos que el boton este inactivo cuando inicia el programa
        add(boton1);


        boton2 = new JButton("No Acepto");
        boton2.setBounds(120,290,100,30);
        boton2.addActionListener(this);
        boton1.setEnabled(true);//con esta liena le ponemos que el boton este activo cuando inicia el programa
        add (boton2);

        ImageIcon Imagen = new ImageIcon("images/coca-cola.png");
        label2 = new JLabel (Imagen);
        label2.setBounds(315,135,300,300);
        add(label2);
        


    }//constructor FIN

    //eventos
public void stateChange(ChangeEvent nahuel){



}//eventos fin ChangeEVENT

public void actionPerformed(ActionEvent mauro){

}//FIN ActionPermofmed


//main 
public static void main(String[] args) {
    Licencia Formulario1 = new Licencia();
        Formulario1.setBounds(0,0,600,350);
        Formulario1.setVisible(true);
        Formulario1.setResizable(false);
        Formulario1.setLocationRelativeTo(null);
}



}