//Jeisson David Infante Leal 
package sema12;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Modelo {
    private String torre,apto,nombres;
    private String apellidos,propietario, telefono;
    private String correo,placa,marca;
    private String color,modelo,linea,mensaje,i,tra;
    private int form;
    
    public void datos(String torr, String apt, String nombrs, String apllds, String propi, String tel, String mail, String plac, String marc, String col, String mod, String lin) {
        this.torre = torr ;
        this.apto = apt ;
        this.nombres = nombrs;
        this.apellidos = apllds;
        this.propietario = propi;
        this.telefono = tel;
        this.correo = mail;
        this.placa = plac;
        this.marca = marc;
        this.color = col;
        this.modelo = mod;
        this.linea = lin;
    }
    
    public void base() {
        String url = "jdbc:mysql://localhost/motos";
        String usuario = "root";
        String pass = "root";
        //establecer la conexion de la primera forma con jdbc
        try {
            Connection cn = DriverManager.getConnection(url,usuario,pass);
            PreparedStatement pst = cn.prepareStatement("insert into motos values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, "0");//id autoincrementable
            pst.setString(2, this.torre);
            pst.setString(3, this.apto);
            pst.setString(4, this.nombres);
            pst.setString(5, this.apellidos);
            pst.setString(6, this.propietario);
            pst.setString(7, this.telefono);
            pst.setString(8, this.correo);
            pst.setString(9, this.placa);
            pst.setString(10, this.marca);
            pst.setString(11, this.color);
            pst.setString(12, this.modelo);
            pst.setString(13, this.linea);
            pst.executeUpdate();
            dato(1);
            //obtener el id que mostrare en pantalla
            Statement stmt =  cn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX(ID) AS ID FROM motos");
            while (rs.next()) {                
                this.form = Integer.parseInt(rs.getString("ID"));
                JOptionPane.showMessageDialog(null, "Importante: Su Formulario es el numero: "+form+" .¡POR FAVOR RECUERDELO!");
            }
        } catch (Exception ei) {
            ei.printStackTrace();
           dato(0);
        }
    }
      
    //llamar los datos 
    public void buscar(String ids) {
        String i = ids;
        String url = "jdbc:mysql://localhost/motos";
        String usuario = "root";
        String pass = "root";
        try {
             Connection cn = DriverManager.getConnection(url,usuario,pass);
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM motos WHERE ID = ? ");
            pst.setString(1, i.trim());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                tra = "ID"+rs.getString("ID")+" Nombres:"+rs.getString("nombres")+" Placa:"+rs.getString("placa");
            }else{
                JOptionPane.showMessageDialog(null,"El postulante no se a registrado, o escribio mal el numero de formulario");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public String traer(){
        return this.tra;
    }
    
    public String  exito() {
        return mensaje;
    }
    
    public  void dato(int i) {
        if(i == 1){
            mensaje = "Su registro se realizo bien, se revisaran los datos"
                    + "y nos comunicaremos con usted.";
        }else{
            mensaje = "Ocurrio un error, por favor tenganos paciencia.";
        }
    }   
    
}
