package br.ifpe.Zacademico.Web.model;
import java.util.ArrayList;
import java.util.List;


public class Escola {
    private int id_mec;
    private String nome;
    private String endereco;
    private String tipo;
    private String tipo_local;
    private List<Aluno> alunos;

    public Escola(int id_mec, String nome, String endereco){
        this.id_mec = id_mec;
        this.nome = nome;
        this.endereco = endereco;
        this.alunos = new ArrayList<>();
    }

    public int getId_mec() {
        return id_mec;
    }

    public void setId_mec(int id_mec) {
        this.id_mec = id_mec;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo_local() {
        return tipo_local;
    }

    public void setTipo_local(String tipo_local) {
        this.tipo_local = tipo_local;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void imprimirDados(){
        System.out.println("Id_Mec: " + getId_mec());
        System.out.println("Nome da Instituição: " + getNome());
        System.out.println("Endereço: " + getId_mec());
        
    }
}
