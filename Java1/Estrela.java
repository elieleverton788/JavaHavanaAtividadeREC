public class Estrela extends CorpoCeleste{
    private String tipoEspectral;
    private Double luminosidade;
    private String estagioEvol;
    private String tipo;
    private double temperatura;


    public Estrela(String tipoEspectral, Double luminosidade, String estagioEvol, String tipo, double temperatura, String nome, String localizacao, boolean produzLuz, double massa, double diametro, String composicao, String orbita){
        super(nome, localizacao, produzLuz, massa, diametro, composicao, orbita);
        this.tipoEspectral = tipoEspectral;
        this.luminosidade = luminosidade;
        this.estagioEvol = estagioEvol;
        this.tipo = tipo;
        this.temperatura = temperatura;
    }

     public void atualizarTipo() {
        double massa = getMassa();

        if (massa > 10) {
            this.tipo = "Supergigante";
        } else if (massa >= 0.5 && massa <= 10) {
            this.tipo = "Sequência Principal";
        } else {
            this.tipo = "Anã Vermelha";
        }

        System.out.println("estrela " + getNome() + " classificada como: " + this.tipo);
    }
    
     public void tempoDeVida() {
        double massa = getMassa();
        double vidaRestante = 1e10 / Math.pow(massa, 2.5);

        System.out.printf(" A estrela %s tem vida restante de aproximadamente %.2e anos.%n",
            getNome(), vidaRestante);
    }


    public String getTipoEspectral() {
        return this.tipoEspectral;
    }

    public void setTipoEspectral(String tipoEspectral) {
        this.tipoEspectral = tipoEspectral;
    }

    public Double getLuminosidade() {
        return this.luminosidade;
    }

    public void setLuminosidade(Double luminosidade) {
        this.luminosidade = luminosidade;
    }

    public String getEstagioEvol() {
        return this.estagioEvol;
    }

    public void setEstagioEvol(String estagioEvol) {
        this.estagioEvol = estagioEvol;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }


}
