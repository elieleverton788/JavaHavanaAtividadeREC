
package br.ifpe.Zacademico.Web.model;
public class User {
    private String nome;
    private String cpf;
    private int idade;
    private String email_pessoal;


    public User(String nome, String cpf, int idade, String email_pessoal ){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.email_pessoal = email_pessoal;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEmail_pessoal() {
        return email_pessoal;
    }
    public void setEmail_pessoal(String email_pessoal) {
        this.email_pessoal = email_pessoal;
    }


    public void imprimirDados(){
        System.out.println("Nome: " + getNome() );
        System.out.println("idade: " + getIdade() );
        System.out.println("CPF: " + getCpf() );
        System.out.println("Email Pessoal: " + getEmail_pessoal() );
    }


    
}
