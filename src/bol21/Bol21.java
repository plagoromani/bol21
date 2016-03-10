
package bol21;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Bol21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
       Metodos obx = new Metodos();
       int res;
        do{
         res = Integer.parseInt(JOptionPane.showInputDialog("Elige la opción que desees: \n1.Introducir \n2.ordenar  \n 3.-Leer fichero \n 4.-Salir de la ejecución"));
          switch (res){
            case 1:
                obx.cargarArray();
               obx.ordenar();
              break;
            case 2:
              
                obx.leerEscribir("src/bol21/palabras.txt");
                break;
            case 3:
               obx.lerFich("src/bol21/palabras.txt");
                break;
            case 4:
                break;
                     
                      
          }
        }while(res<4);
    }
    
}
