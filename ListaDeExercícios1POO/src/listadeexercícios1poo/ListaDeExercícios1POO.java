
package listadeexercícios1poo;
import javax.swing.JOptionPane;

/**
 *
 * @author murilorcm
 */
public class ListaDeExercícios1POO {

    public static void main(String[] args) {
        int opcao;
        
        do{
            JOptionPane.showMessageDialog(null, "1 - Questão 1\n2 - Questão 2\n3 - Questão 3\n4 - Questão 4\n5 - Questão 5\n6 - Questão 6\n7 - Questão 7\n8 - Questão 8");
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Opção: "));
            switch (opcao){
                case 1:
                    Questao1.main(args);
                    break;
                case 2:
                    Questao2.main(args);
                    break;
                case 3:
                    Questao3.main(args);
                    break;
                case 4:
                    Questao4.main(args);
                    break;
                case 5:
                    Questao5.main(args);
                    break;
                case 6:
                    Questao6.main(args);
                    break;
                case 7:
                    Questao7.main(args);
                    break;
                case 8:
                    Questao8.main(args);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção não encontrada!");
                    break;
            }
        }while(true);
    }    
}
