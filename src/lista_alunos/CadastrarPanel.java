package lista_alunos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CadastrarPanel extends JPanel implements ActionListener{
    JTextField nomeInput = new JTextField(10);
    JTextField cpfInput = new JTextField(10);
    JTextField matriculaInput = new JTextField(10);
    JTextField poloInput = new JTextField(10);
    
    public CadastrarPanel() {
        setLayout(new GridLayout(5, 2, 10, 50));
        setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel nomeLabel = new JLabel("Nome: ");
        JLabel cpfLabel = new JLabel("CPF: ");
        JLabel matriculaLabel = new JLabel("Matrícula: ");
        JLabel poloLabel = new JLabel("Polo: ");
        JLabel nadaLabel = new JLabel();
        JButton cadastrarButton = new JButton("Cadastrar");

        add(nomeLabel);
        add(nomeInput);
        add(cpfLabel);
        add(cpfInput);
        add(matriculaLabel);
        add(matriculaInput);
        add(poloLabel);
        add(poloInput);
        add(nadaLabel);
        add(cadastrarButton);
    }


    public void actionPerformed(ActionEvent e) {
        return;
    }
}
