package br.ifpe.Zacademico.Web.model;
public class Professor extends User {
    private String siepe;
    private String nivel_instrucao;
    private String area_atuacao;

    public Professor(String nome, String cpf, int idade, String email_pessoal, String siepe, String nivel_instrucao, String area_atuacao){
        super(nome,  cpf,  idade, email_pessoal);
        this.siepe = siepe;
        this.nivel_instrucao = nivel_instrucao;
        this.area_atuacao = area_atuacao;
    }

    public String getSiepe() {
        return siepe;
    }

    public void setSiepe(String siepe) {
        this.siepe = siepe;
    }

    public String getNivel_instrucao() {
        return nivel_instrucao;
    }

    public void setNivel_instrucao(String nivel_instrucao) {
        this.nivel_instrucao = nivel_instrucao;
    }

    public String getArea_atuacao() {
        return area_atuacao;
    }

    public void setArea_atuacao(String area_atuacao) {
        this.area_atuacao = area_atuacao;
    }

    
}
