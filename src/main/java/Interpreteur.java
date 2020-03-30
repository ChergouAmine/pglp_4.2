import java.util.ArrayList;

/**
 * 
 * @author CHergou
 * Classe receiver
 * Classe interpréteur avec les commande quit et undo
 */
public class Interpreteur {
    
    ArrayList<Double> pile;
    
    public Interpreteur() {
        pile = new ArrayList<Double>();
    }
    
    
    /**
     * @param p : contient tout les inputs
     * si l'historique n'est pas vide, on vide la pile des operandes et on réexécute toutes 
     * les commandes de l'historique sans inclure celle qu'on veut undo
     */
    public void undo(ArrayList<Commande> p) throws ManqueOperandeException, DivByZeroException {
        if(pile.size() == 0)
            {
              return;
            }
        
        System.out.println("le dernier input a été supprimé \n");
        pile.clear();
        p.remove(p.size()-1);
        for(Commande c : p) {
            c.execute();
        }       
    }
    
    /**
     * Stop le programme 
     */
    public void quit() {
        System.out.println("FIN DU PROGRAMME.");
        System.exit(1);
    }

    
    /**
     * cette méthode affiche la pile après chaque input
     * *pour ne pas se perdre
     */
    public void afficher() {
      
        String c="";
        
        c+="Input : ";
        
        for(double d: pile)
        {
           c+=d + " ";
        }
        
        System.out.println(c);
        
    }
    
    
}