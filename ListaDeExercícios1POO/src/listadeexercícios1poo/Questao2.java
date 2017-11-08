
package listadeexercícios1poo;
import javax.swing.JOptionPane;
/**
 *
 * @author murilorcm
 */
public class Questao2 {
    public static void main(String[] args){
        String resposta;
        boolean estadoMotor = false;
        
        do{
            resposta = JOptionPane.showInputDialog("Deseja ligar o motor? S/N");
            switch (resposta) {
                case "S":
                case "s":
                    estadoMotor = ligaMotor();
                    break;
                case "N":
                case "n":
                    estadoMotor = desligaMotor();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Não entendemos a sua resposta, por favor utilize apenas S p/ Sim ou N p/ Não.");
                    break;
            }
            
            resposta = JOptionPane.showInputDialog("Deseja efetuar mais alguma operação? S/N");
            
        }while(resposta.equals("S") || resposta.equals("s"));
        if(estadoMotor){
            JOptionPane.showMessageDialog(null, "O motor está Ligado");
        }
        else{
            JOptionPane.showMessageDialog(null, "O motor está desligado!");
        }
    }
    public static boolean ligaMotor(){
        return true;
    }
    public static boolean desligaMotor(){
        return false;
    }
}
