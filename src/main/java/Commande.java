import java.util.HashMap;

public class Commande {
  
    private HashMap<String, Interpreteur> commandeHashMap = new HashMap<String, Interpreteur>();
    
    
    public void register(String commande, Interpreteur interpretation) {
      commandeHashMap.put(commande, interpretation);
    }
    
    
  
    public void execute(String commande) throws PileVideException, ErreurException {
        Interpreteur i = commandeHashMap.get(commande);
        
        if (i == null) 
            throw new IllegalStateException("Je ne connais pas cette commande");
        
            i.execute();     
    }
    

    public void operation(String commande, char c) throws PilePleineException, DivByZeroException, PileVideException, ErreurException {
        Interpreteur i = commandeHashMap.get(commande);
        
        if (i == null) 
            throw new IllegalStateException("Je ne connais pas cette commande");
        
        
        i.operation(c);
        
    }
    
    
    public String execute(String commande, String chaine) throws PileVideException, ErreurException,  SaisieVideException {
        Interpreteur i = commandeHashMap.get(commande);
        
        if (i == null) 
            throw new IllegalStateException("Je ne connais pas cette commande");
        
        return i.execute(chaine);
               
    }
    
    
    public void operande(String commande, double d) throws PilePleineException, DivByZeroException, PileVideException, ErreurException {
        Interpreteur i = commandeHashMap.get(commande);
        
        if (i == null) 
            throw new IllegalStateException("Je ne connais pas cette commande");
        
        i.operandes(d);
        
    }
    
   
    
    public int getInteger(String commande) throws PileVideException, ErreurException {
        Interpreteur i = commandeHashMap.get(commande);
        if (i == null) {
            throw new IllegalStateException("Je ne connais pas cette commande");
        }
        return i.getInt();
        
    }
    
}