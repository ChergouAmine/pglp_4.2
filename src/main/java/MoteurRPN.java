import java.util.ArrayList;

public class MoteurRPN {
    public Calcul calcul;
    public Commande commande;
    private ArrayList<Double> operande;
    
   
    public MoteurRPN() {
      calcul = new Calcul();
      commande = new Commande();
      operande = new ArrayList<Double>();   
    }
    
    
    public void associer() {
        Interpreteur retour = new Undo(calcul);
        Interpreteur quit = new Quit(calcul);
        Interpreteur ajouterOperande = new AjoutOperande(calcul);
        Interpreteur afficherOperande = new AfficherOperande(calcul);
        Interpreteur nbOperande = new GetNbOperandes(calcul);
        Interpreteur applyOperation = new OperationBinaire(calcul);
        
        
        commande.register("undo", retour);
        commande.register("quit", quit);
        commande.register("add", ajouterOperande);
        commande.register("afficher", afficherOperande);
        commande.register("operande", nbOperande);
        commande.register("op", applyOperation);

    }
    
    

}