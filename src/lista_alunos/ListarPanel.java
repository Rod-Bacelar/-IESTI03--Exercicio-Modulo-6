package lista_alunos;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ListarPanel extends JPanel {
    ControllerAlunos controller;
    
    public ListarPanel(ControllerAlunos controller) {
        this.controller = controller;
        setBorder(new EmptyBorder(20, 20, 20, 20));
        atualizarTable();
    }

    public void atualizarTable() {
        removeAll();

        // Cabeçalhos das colunas
        String[] colunas = {"Nome", "CPF", "Matrícula", "Vertente"};
        
        // Dados da tabela
        List<Aluno> alunos = controller.getListaAlunos();
        String[][] dados = new String[alunos.size()][4];
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            dados[i][0] = aluno.getNome();
            dados[i][1] = aluno.getCpf();
            dados[i][2] = aluno.getMatricula();
            dados[i][3] = aluno.getVertente();
        }

        DefaultTableModel model = new DefaultTableModel(dados, colunas);
        JTable tabela = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tabela);

        add(scrollPane);
    }
}
