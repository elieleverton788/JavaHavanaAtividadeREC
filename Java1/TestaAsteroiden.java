public class TestaAsteroiden{
    public static void main(String[] args) {
        
        Asteroide asteroide = new Asteroide(
            "sei la", "Sistema Solar", false, 
            2.2e10, 0.1, "Rochoso", "Terra", 
            "Apollo", "NEO", false
        );
    
     asteroide.verificarPerigo();
     System.out.println("Apophis é perigoso? " + asteroide.isPerigoso());
 }
}