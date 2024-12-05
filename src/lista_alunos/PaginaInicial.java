package lista_alunos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.CardLayout;

public class PaginaInicial extends JFrame implements ActionListener{
    JPanel northPanel = new JPanel();
    JPanel centerPanel = new JPanel();
    CardLayout cardLayout;
    ControllerAlunos controller;

    CadastrarPanel painelCadastro;
    ListarPanel painelListar;
    AtualizarPanel painelAtualizar;
    DeletarPanel painelDeletar;
    
    
    public PaginaInicial() {
        setLayout(new BorderLayout());

        // Criando o controller
        controller = new ControllerAlunos();

        // Adicionando as opções no painel norte

        northPanel.add(criarButton("Cadastrar"));
        northPanel.add(criarButton("Listar"));
        northPanel.add(criarButton("Atualizar"));
        northPanel.add(criarButton("Deletar"));

        // Adicionando os paineis do painel centro utilizando CardLayout
        painelCadastro = new CadastrarPanel(controller);
        painelListar = new ListarPanel(controller);
        painelAtualizar = new AtualizarPanel(controller);
        painelDeletar = new DeletarPanel(controller);

        centerPanel.setLayout(new CardLayout());
        centerPanel.add(new JPanel(), "Vazio");
        centerPanel.add(painelCadastro, "Cadastrar");
        centerPanel.add(painelListar, "Listar");
        centerPanel.add(painelAtualizar, "Atualizar");
        centerPanel.add(painelDeletar, "Deletar");

        // Criando o cardLayout
        cardLayout = (CardLayout) centerPanel.getLayout();

        //Adicionando os paineis no frame
        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        
        // Exibindo a Tela
        setTitle("Listagem de Alunos");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JButton criarButton(String text) {
        JButton button = new JButton(text);
        button.addActionListener(this);

        return button;
    }

    public void actionPerformed(ActionEvent e) {
        JButton sourceButton = (JButton) e.getSource();
        String buttonText = sourceButton.getText();

        if (buttonText.equals("Listar")) {
            painelListar.atualizarTable();
        }

        cardLayout.show(centerPanel, buttonText);
    }
}
