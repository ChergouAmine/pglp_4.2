import java.util.ArrayList;

public class Calcul {
      
  
  //public static final int TAILLEMAX = 10;
  public ArrayList<Double> operande ;
  
  
  public Calcul () {
      operande = new ArrayList<Double>();
  }
  
  public String annuler(String chaine)throws SaisieVideException {
    
       if(chaine.equals("")) throw new SaisieVideException();
       
       String s = "";
      
       for(int i = 0; i < chaine.length()-2; i++ )
           s += chaine.charAt(i);
       
       
       return s;
  }
  
 
  
  public void ajoutOperande(double d) throws PilePleineException {
    
        operande.add((Double) d);
        System.out.println(d);
  }
  
  public void suppOperande() throws PileVideException{
      if (operande.size() == 0) throw new PileVideException();
      else
      {
         operande.remove(operande.size()-1);
      }
     
  }
  
  public boolean operationBinaire(char symbol) {
      if(operande.size()-2<0|| (symbol != '+' && symbol != '-' && symbol != '/' && symbol != '*'))
          return false;
      else
        return true; 
  }
  
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
  
  public ArrayList<Double> ListeOperande() throws PileVideException {
      ArrayList<Double> l = new ArrayList<Double>();      
      
      if(operande.isEmpty()) throw new PileVideException();      
      
      int taille = operande.size();
      
      for (int i = taille-1 ; i>= 0; i--) l.add(operande.get(i));
      
      //for(int i  = 0; i<l.size(); i++) operande.set(i,  l.get(i)) ;
      
      return l;
  }
  
  public void afficherOperande() throws PileVideException{
    
      ArrayList<Double> l = this.ListeOperande();
      
      String s ="Pile: ";
      
      for (Double xx : l) {
          s+= " "+xx + " "   ;
      }
      
      System.out.println(s+".");
  }
  
  public int getNbOperande() throws PileVideException {
      if(operande.isEmpty()) throw new PileVideException();
      else
        return this.operande.size();
  }
  
  
  public void arreter() {
    System.out.println("Fin de la saisie");
  }
}
