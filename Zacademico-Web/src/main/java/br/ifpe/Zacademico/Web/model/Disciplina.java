package br.ifpe.Zacademico.Web.model;
import java.util.List;

public class Disciplina {
    private int id;
    private int chTotal;
    private int chSem;
    private String tipo;
    private List<Professor> professores;

    public Disciplina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChTotal() {
        return chTotal;
    }

    public void setChTotal(int chTotal) {
        this.chTotal = chTotal;
    }

    public int getChSem() {
        return chSem;
    }

    public void setChSem(int chSem) {
        this.chSem = chSem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    

    
}
