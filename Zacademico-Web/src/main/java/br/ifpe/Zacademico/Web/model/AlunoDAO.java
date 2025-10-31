package br.ifpe.Zacademico.Web.model;

import java.util.List;

public class AlunoDAO {
    private List <Aluno> cadastroAlunos;

    public AlunoDAO(List<Aluno> cadastrAlunos){
        this.cadastroAlunos = cadastrAlunos;
    }

    public void createAluno(Aluno aluno){
        this.cadastroAlunos.add(aluno);
    }

    public void deleteAluno(){
        
    }
}
