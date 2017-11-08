
package listadeexercícios1poo;
import javax.swing.JOptionPane;

/**
 *
 * @author murilorcm
 */
public class Questao7 {
    public static void main(String[] args){
        
        Questao7Participante participantes[] = new Questao7Participante[3];
        
        int qtdCadastro=0;
        
        for(qtdCadastro=0;qtdCadastro<participantes.length;qtdCadastro++){
            Questao7Participante p = new Questao7Participante();
            participantes[qtdCadastro] = p;
          
            participantes[qtdCadastro].setName(JOptionPane.showInputDialog("Nome: "));
            participantes[qtdCadastro].setCpf(JOptionPane.showInputDialog("CPF: "));
        }
        for(qtdCadastro=0;qtdCadastro<participantes.length;qtdCadastro++){
            JOptionPane.showMessageDialog(null, participantes[qtdCadastro].getName());
            JOptionPane.showMessageDialog(null, participantes[qtdCadastro].getCpf());
        }
        
    }
}