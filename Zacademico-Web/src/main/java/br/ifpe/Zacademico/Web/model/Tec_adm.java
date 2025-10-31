package br.ifpe.Zacademico.Web.model;
public class Tec_adm extends User {
    private String siepe;
    private String nivel_instrucao;

    public Tec_adm(String nome, String cpf, int idade, String email_pessoal, String siepe, String nivel_instrucao){
        super(nome,  cpf,  idade, email_pessoal);
        this.siepe = siepe;
        this.nivel_instrucao = nivel_instrucao;
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

}
