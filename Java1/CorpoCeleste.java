public class CorpoCeleste {
    private String nome;
    private String localizacao;
    private boolean produzLuz;
    private double massa;
    private double diametro;
    private String composicao;
    private String orbita;


    public CorpoCeleste(String nome, String localizacao, boolean produzLuz, double massa, double diametro, String composicao, String orbita) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.produzLuz = produzLuz;
        this.massa = massa;
        this.diametro = diametro;
        this.composicao = composicao;
        this.orbita = orbita;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean isProduzLuz() {
        return this.produzLuz;
    }

    public boolean getProduzLuz() {
        return this.produzLuz;
    }

    public void setProduzLuz(boolean produzLuz) {
        this.produzLuz = produzLuz;
    }

    public double getMassa() {
        return this.massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getDiametro() {
        return this.diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getComposicao() {
        return this.composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public String getOrbita() {
        return this.orbita;
    }

    public void setOrbita(String orbita) {
        this.orbita = orbita;
    }

}
