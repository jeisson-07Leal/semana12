//Jeisson David Infante Leal 
package sema12;
import com.sun.jmx.snmp.BerDecoder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador implements  ActionListener{
    private Modelo modelo;
    private Vista vista;
   
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.registar.addActionListener(this);
        this.vista.bus.addActionListener(this);
    }
    
    public void ver(){
        vista.setTitle("FORMULARIO DE REGISTRO SORTEO Y ADJUDICACIÓN PARQUEADEROS COMUNALES");
        vista.setBounds(100, 100, 720, 640);
        vista.setVisible(true);
        vista.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (vista.registar == e.getSource()) {
            modelo.datos(vista.torr.getText(),vista.apt.getText(),vista.nombrs.getText()
                    ,vista.apllds.getText(),
                    vista.propi.getText(),vista.tel.getText(),vista.mail.getText()
                    ,vista.plac.getText(),
                    vista.marc.getText(),vista.col.getText(),vista.mod
                    .getText(),vista.lin.getText());
            modelo.base();
            vista.info.setText(modelo.exito());
            vista.torr.setText("");
            vista.apt.setText("");
            vista.nombrs.setText("");
            vista.apllds.setText("");
            vista.col.setText("");
            vista.lin.setText("");
            vista.mail.setText("");
            vista.marc.setText("");
            vista.mod.setText("");
            vista.plac.setText("");
            vista.tel.setText("");
            vista.propi.setText("");
        }
        
        if (vista.bus == e.getSource()) {
            modelo.buscar(vista.busc.getText());
           JOptionPane.showMessageDialog(null, modelo.traer());
        }
    }
 
    }
 
