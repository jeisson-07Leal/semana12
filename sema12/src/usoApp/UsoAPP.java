
package usoApp;

import sema12.Controlador;
import sema12.Modelo;
import sema12.Vista;

public class UsoAPP {
        public static void main(String[] args) {
           Vista vista=new Vista();
           Modelo modelo=new Modelo();
          Controlador controlador=new Controlador(modelo,vista);
          controlador.ver();
    }
}
