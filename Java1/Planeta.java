public class Planeta extends CorpoCeleste{
    private int qtdLuas;
    private boolean temAneis;
    private boolean temVida;
    private String sistema;

    public Planeta(int qtdLuas, boolean temAneis, boolean temVida, String sistema,String nome, String localizacao, boolean produzLuz, double massa, double diametro, String composicao, String orbita) {
        super(nome, localizacao, produzLuz, massa, diametro, composicao, orbita);
        this.qtdLuas = qtdLuas;
        this.temAneis = temAneis;
        this.temVida = temVida;
        this.sistema = sistema;
    }
   
    public int getQtdLuas() {
        return this.qtdLuas;
    }

    public void setQtdLuas(int qtdLuas) {
        this.qtdLuas = qtdLuas;
    }

    public boolean isTemAneis() {
        return this.temAneis;
    }

    public boolean getTemAneis() {
        return this.temAneis;
    }

    public void setTemAneis(boolean temAneis){
            this.temAneis = temAneis;
    }
    
    public boolean isTemVida() {
        return this.temVida;
    }

    public boolean getTemVida() {
        return this.temVida;
    }

    public void setTemVida(boolean temVida) {
        this.temVida = temVida;
    }

    public String getSistema() {
        return this.sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

}
