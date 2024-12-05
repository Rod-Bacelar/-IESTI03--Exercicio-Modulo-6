package lista_alunos;

import java.util.ArrayList;

public class ControllerAlunos {
    private ArrayList<Aluno> alunos;

    public ControllerAlunos() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public ArrayList<Aluno> getListaAlunos() {
        return alunos;
    }

    public Aluno buscarPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public boolean deletarAluno(String matricula) {
        Aluno aluno = buscarPorMatricula(matricula);
        if (aluno != null) {
            alunos.remove(aluno);
            return true;
        }
        return false;
    }

    public boolean atualizarVertente(String matricula, String novaVertente) {
        Aluno aluno = buscarPorMatricula(matricula);
        if (aluno != null) {
            aluno.setVertente(novaVertente);
            return true;
        }
        return false;
    }
}
