import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author chergou
 * La classe invoker où sont stockées les commandes à executer
 *
 */

public class Switch {
    
    private ArrayList<Commande> inputs;   
    Map<String, Commande> commandeHashMap;
    
    public Switch() {
      inputs = new ArrayList<Commande>();
       commandeHashMap  = new HashMap<String, Commande>();
    }
    
    
    /**
     * @param nom : le nom de la commande (+,-,/,*), c : l'instance d'objet de cette commande
     */
    public void ajoutCommande(String nom, Commande c) {
      commandeHashMap.put(nom, c);
    }
    
    
    /**
     * @param nom : le nom de la commande (+,-,/,*)
     * cette classe vérifie si la commande existe ou pas et elle l'execute si elle existe
     */
    public boolean verifCommande(String nom) throws ManqueOperandeException, DivByZeroException {
      
        if(commandeHashMap.containsKey(nom)) {
          
            if(nom.equals("undo")) 
            {
                ((Undo)commandeHashMap.get(nom)).execute(inputs); // soit c'est undo 
            }else 
            {
                commandeHashMap.get(nom).execute(); //soit elle exécute l'opération et empile le résultat
                inputs.add(commandeHashMap.get(nom));
            }           
            return true;

        }else
        {
          return false;
        }
    }
    


}