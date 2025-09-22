public class Asteroide extends CorpoCeleste{
    private String TipoOrbital;
    private String grupoOrbital;
    private boolean perigoso;

    
    public Asteroide(String nome, String localizacao, boolean produzLuz,
             double massa, double diametro, String composicao, String orbita,
             String tipoOrbital, String grupoOrbital, boolean perigoso) {
    super(nome, localizacao, produzLuz, massa, diametro, composicao, orbita);
    this.TipoOrbital = tipoOrbital;
    this.grupoOrbital = grupoOrbital;
    this.perigoso = perigoso;
}

    public void verificarPerigo(){
        if (getDiametro() > 0.150 && getOrbita().equalsIgnoreCase("terra")){
            this.perigoso = true;
            System.out.println("Alerta:"+ getNome() + "é um asteriode perigoso para a terra");
        }else{
            this.perigoso = false;
             System.out.println(getNome() + " não representa risco significativo.");
        }
    }

    public String getTipoOrbital() {
        return this.TipoOrbital;
    }

    public void setTipoOrbital(String TipoOrbital) {
        this.TipoOrbital = TipoOrbital;
    }

    public String getGrupoOrbital() {
        return this.grupoOrbital;
    }

    public void setGrupoOrbital(String grupoOrbital) {
        this.grupoOrbital = grupoOrbital;
    }

    public boolean isPerigoso() {
        return this.perigoso;
    }

    public boolean getPerigoso() {
        return this.perigoso;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }

}