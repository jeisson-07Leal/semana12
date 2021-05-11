//Jeisson David Infante Leal
package sema12;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Vista extends JFrame{
    
    JPanel p1; 
    
    JLabel inf, torre, apto,nombres,apellidos,
            propietario,telefono,correo,
            infoMoto,placa,marca,color,modelo,linea,busca;
    JTextField torr,apt,nombrs,apllds,propi,tel,mail,
            plac,marc,col,mod,lin,busc;
    JButton registar,bus;
    JTextArea info;
   
  public Vista(){
      Font f = new Font("Arial",1,12);

      p1= new JPanel();
      p1.setLayout(null);
      
     
      //información de la persona que se postula
      inf = new JLabel("INFORMACIÓN DEL POSTULANTE");
      inf.setBounds(250, 6, 280, 20);
      inf.setFont(new Font("Calibri",3,20));
      inf.setBorder(BorderFactory.createLineBorder(Color.yellow));
      
      torre = new JLabel("Numero de la Torre:");
      torre.setBounds(20, 50, 200, 20);
      torre.setFont(f);
      torr = new JTextField();
      torr.setBounds(140, 50, 80, 25);
      
      apto = new JLabel("Numero del apartamento:");
      apto.setBounds(350, 50, 200, 20);
      apto.setFont(f);
      apt = new JTextField();
      apt.setBounds(500, 50, 80, 25);
      
      nombres = new JLabel("Nombres del postulante:");
      nombres.setBounds(20, 100, 200, 20);
      nombres.setFont(f);
      nombrs = new JTextField();
      nombrs.setBounds(160, 100, 120, 25);
      
      apellidos = new JLabel("Apellidos del postulante:");
      apellidos.setBounds(350, 100, 200, 20);
      apellidos.setFont(f);
      apllds = new JTextField();
      apllds.setBounds(490, 100, 120, 25);
      
      propietario = new JLabel("¿Es propietario? o ¿Es arrendatario?");
      propietario.setBounds(20, 150, 300, 20);
      propietario.setFont(f);
      propi = new JTextField();
      propi.setBounds(240, 150, 100, 25);
      
      telefono = new JLabel("Numero telefonico de contacto:");
      telefono.setBounds(20, 200, 300, 20);
      telefono.setFont(f);
      tel = new JTextField();
      tel.setBounds(210, 200, 100, 25);
      
      correo = new JLabel("Correo electronico de contacto:");
      correo.setBounds(350, 200, 300, 20);
      correo.setFont(f);
      mail = new JTextField();
      mail.setBounds(535, 200, 130, 25);
      
      //informacion de la moto
      infoMoto = new JLabel("INFORMACIÓN DE LA MOTO");
      infoMoto.setBounds(270, 250, 240, 20);
      infoMoto.setFont(f);
      infoMoto.setFont(new Font("Calibri",3,20));
      infoMoto.setBorder(BorderFactory.createLineBorder(Color.yellow));
      
      placa = new JLabel("Placa de la Moto:");
      placa.setBounds(20, 300, 200, 20);  
      placa.setFont(f);
      plac = new JTextField();
      plac.setBounds(120, 300, 80, 25);      
              
      marca = new JLabel("Marca de la Moto:");
      marca.setBounds(250, 300, 200, 20);
      marca.setFont(f);
      marc = new JTextField();
      marc.setBounds(360, 300, 80, 25);
              
      color = new JLabel("Color de la Moto:");
      color.setBounds(500, 300, 200, 20);
      color.setFont(f);
      col = new JTextField();
      col.setBounds(600, 300, 80, 25);
              
      modelo = new JLabel("Modelo de la Moto:"); 
      modelo.setBounds(20, 380, 200, 20);
      modelo.setFont(f);
      mod = new JTextField();
      mod.setBounds(130, 380, 80, 25);
              
      linea= new JLabel("Linea de la Moto:");
      linea.setBounds(300, 380, 200, 20);
      linea.setFont(f);
      lin = new JTextField();
      lin.setBounds(400, 380, 80, 25);
      
      //extras
      info = new JTextArea();
      info.setBounds(20, 480, 660, 60);
      
      busca = new JLabel("Para buscar información ingrese el numero de formulario:");
      busca.setBounds(20,540,390,40);
      busca.setFont(f);
      busc = new JTextField();
      busc.setBounds(360,550,80,25);
      bus = new JButton("Buscar");
      bus.setBounds(480,550,120,25);
      
      registar = new JButton("Terminar y Enviar");
      registar.setBounds(250, 430, 220, 40);
      registar.setFont(f);
      registar.setFont(new Font("Calibri",3,18));
      registar.setBackground(Color.green);
      
      
      
      //añadir al panel
      add(p1);
      p1.add(inf);
      p1.add(torre);
      p1.add(apto);
      p1.add(nombres);
      p1.add(apellidos);
      p1.add(propietario);
      p1.add(telefono);
      p1.add(correo);
      p1.add(infoMoto);
      p1.add(placa);
      p1.add(marca);
      p1.add(color);
      p1.add(modelo);
      p1.add(linea);
      p1.add(torr);
      p1.add(apt);
      p1.add(nombrs);
      p1.add(apllds);
      p1.add(propi);
      p1.add(tel);
      p1.add(mail);
      p1.add(plac);
      p1.add(marc);
      p1.add(col);
      p1.add(mod);
      p1.add(lin);
      p1.add(info);
      p1.add(registar);
      p1.add(busca);
      p1.add(busc);
      p1.add(bus);
  }
   
}
