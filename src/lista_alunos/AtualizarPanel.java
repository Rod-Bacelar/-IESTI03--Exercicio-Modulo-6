package lista_alunos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AtualizarPanel extends JPanel implements ActionListener{
    JTextField matriculaInput = new JTextField(10);
    JTextField poloInput = new JTextField(10);

    ControllerAlunos controller;
    
    public AtualizarPanel(ControllerAlunos controller) {
        this.controller = controller;

        setLayout(new GridLayout(5, 2, 10, 50));
        setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel matriculaLabel = new JLabel("Matrícula: ");
        JLabel poloLabel = new JLabel("Polo: ");
        JLabel nadaLabel = new JLabel();
        JButton atualizarButton = new JButton("Atualizar");
        atualizarButton.addActionListener(this);

        add(matriculaLabel);
        add(matriculaInput);
        add(poloLabel);
        add(poloInput);
        add(nadaLabel);
        add(atualizarButton);
    }

    public void actionPerformed(ActionEvent e) {
        String matricula = matriculaInput.getText();
        String polo = poloInput.getText();

        matriculaInput.setText("");
        poloInput.setText("");

        controller.atualizarVertente(matricula, polo);
    }
}
