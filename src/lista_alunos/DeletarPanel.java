package lista_alunos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DeletarPanel extends JPanel implements ActionListener{
    JTextField matriculaInput = new JTextField(10);

    ControllerAlunos controller;
    
    public DeletarPanel(ControllerAlunos controller) {
        this.controller = controller;

        setLayout(new GridLayout(5, 2, 10, 50));
        setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel matriculaLabel = new JLabel("Matrícula: ");
        JLabel nadaLabel = new JLabel();
        JButton deletarButton = new JButton("Deletar");
        deletarButton.addActionListener(this);

        add(matriculaLabel);
        add(matriculaInput);
        add(nadaLabel);
        add(deletarButton);
        add(new JLabel());
        add(new JLabel());
    }

    public void actionPerformed(ActionEvent e) {
        String matricula = matriculaInput.getText();
        boolean status;

        matriculaInput.setText("");

        status = controller.deletarAluno(matricula);

        if (status) {
            JOptionPane.showMessageDialog(null, "Aluno deletado com sucesso!", "Deletar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado!", "Deletar", JOptionPane.ERROR_MESSAGE);
        }
    }
}
