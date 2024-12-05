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

    public ArrayList<Aluno> getLista() {
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
}
