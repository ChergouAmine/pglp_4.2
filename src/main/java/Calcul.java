import java.util.ArrayList;

public class Calcul {
      
  
  //public static final int TAILLEMAX = 10;
  public ArrayList<Double> operande ;
  /**
   * constructeur
   */
  
  public Calcul () {
      operande = new ArrayList<Double>();
  }
  
  

  /**
   * undo la dernière action
   * @param c ce qu'a saisie l'user
   * @return new chaine
   */
  
  public String annuler(String c)throws SaisieVideException {
    
       if(c.equals("")) throw new SaisieVideException();
       
       String s = "";
      
       for(int i = 0; i < c.length()-2; i++ )
           s += c.charAt(i);
       
       
       return s;
  }
  
  /**
   * empiler un nombre
   * @param d : nombre à empiler
   */
  
  public void ajoutOperande(double d) throws PilePleineException {
    
        operande.add((Double) d);
        //System.out.println(d);
  }
  
  /**
   * supprimer le nombre element de la pile.
   */
  
  public void suppOperande() throws PileVideException{
      if (operande.size() == 0) throw new PileVideException();
      else
      {
         operande.remove(operande.size()-1);
      }
     
  }
  

  /**
   * check si l'opération est + ou - ou / ou *.
   * @param symbol charactère à vérifier 
   * @return renvoie la réponse
   */
  
  public boolean operationBinaire(char symbol) {
      if(operande.size()-2<0|| (symbol != '+' && symbol != '-' && symbol != '/' && symbol != '*'))
          return false;
      else
        return true; 
  }
  
  /**
   * effectue l'operation.
   * @param symbol operation à appliquer 
   */
  
  public void appliquerOperation(char symbol) throws DivByZeroException, PileVideException, PilePleineException {
      if(operationBinaire(symbol)) {
          double res = 0;
          if(symbol == '+') {
              res = Operation.PLUS.eval(operande.get(operande.size()-1) , operande.get(operande.size()-2));
          }
          else if(symbol == '-') {
              res = Operation.MOINS.eval(operande.get(operande.size()-1) , operande.get(operande.size()-2));
          }
          else if(symbol == '/') {
            res = Operation.DIV.eval(operande.get(operande.size()-1) , operande.get(operande.size()-2));
          }
        
          else if(symbol == '*') {
              res = Operation.MULT.eval(operande.get(operande.size()-1) , operande.get(operande.size()-2));
          }
         
          this.suppOperande();
          this.suppOperande();
          this.ajoutOperande(res);
      }
  }
  

  /**
   * retourne la liste des opérandes
   * @return liste de retour
   */
  
  public ArrayList<Double> ListeOperande() throws PileVideException {
      ArrayList<Double> l = new ArrayList<Double>();      
      
      if(operande.isEmpty()) throw new PileVideException();      
      
      int taille = operande.size();
      
      for (int i = taille-1 ; i>= 0; i--) l.add(operande.get(i));
      
      //for(int i  = 0; i<l.size(); i++) operande.set(i,  l.get(i)) ;
      
      return l;
  }
  
  /**
   * afficher la pile d'operande
   */
  
  public void afficherOperande() throws PileVideException{
    
      ArrayList<Double> l = this.ListeOperande();
      
      String s ="Pile: ";
      
      for (Double xx : l) {
          s+= " "+xx + " "   ;
      }
      
      System.out.println(s+".");
  }
  
  /**
   * nombre d'operandes
   * @return retourner le nombre d'opérandes 
   */
  
  public int getNbOperande() throws PileVideException {
      if(operande.isEmpty()) throw new PileVideException();
      else
        return this.operande.size();
  }
  
  
  public void arreter() {
    System.out.println("Fin de la saisie");
  }
}
