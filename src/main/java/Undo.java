import java.util.ArrayList;

/**
 * 
 * @author chergou
 * Classe undo qui permet d'utilise la fonction undo de dl'interpreteur
 *
 */
public class Undo implements Commande{
    
    
    Interpreteur interpreteur;
    

    public Undo(Interpreteur i) { 
      interpreteur = i;
    }
    
   
    
    public void execute(ArrayList<Commande> pile) throws ManqueOperandeException, DivByZeroException {
        interpreteur.undo(pile);
    }



    public void execute() {
      // TODO Auto-generated method stub
      
    } 
    
}