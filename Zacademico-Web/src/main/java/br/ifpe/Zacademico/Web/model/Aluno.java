package br.ifpe.Zacademico.Web.model;
public class Aluno extends User {
    private String matricula;
    private int ano_conclusao_fundamental;
    private Escola escola_origem;

   public Aluno(String nome, String cpf, int idade, String matricula, String email_pessoal){
        super( nome,  cpf,  idade, email_pessoal);
        this.matricula = matricula;

   }

   public int getAno_conclusao_fundamental() {
    return ano_conclusao_fundamental;
   }

   public void setAno_conclusao_fundamental(int ano_conclusao_fundamental) {
    this.ano_conclusao_fundamental = ano_conclusao_fundamental;
   }

   public String getMatricula() {
    return matricula;
   }

   public void setMatricula(String matricula) {
    this.matricula = matricula;
   }

   public Escola getEscola_origem() {
    return escola_origem;
   }

   public void setEscola_origem(Escola escola_origem) {
    this.escola_origem = escola_origem;
   }
   

}
