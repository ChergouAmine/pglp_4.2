import java.util.ArrayList;

/**
 * 
 * @author chergou
 * La classe receiver qui reçoit les appels des commandes
 *
 */

public class MoteurRPN extends Interpreteur{
    
    /**
     * @param o : opérande à empiler
     */
    public void empiler(Double o) {
        pile.add(o);
    }
    
    
    public Double depiler() { 
      
      double o = pile.get(pile.size()-1);
       
      pile.remove(pile.size()-1);
      
      return o;

    }
    

    public Boolean verif() throws ManqueOperandeException {
      
        if(pile.size() >= 2)
        {
          return true;
        }else
        {
          //throw new ManqueOperandeException("Pas assez d'operandes.");  
          System.out.println("Pas assez d'operandes.");
          return false;
        }
        
    }
    
    public void addition() throws ManqueOperandeException {
        
        if(verif()) {
            pile.add(depiler()+depiler());
        }   
    }
    
    public void soustraction() throws ManqueOperandeException {
        
        if(verif()) {
            double o2 = depiler();
            
            double o1= depiler();

            pile.add(o1-o2);
        }   
    }
    
    public void division() throws ManqueOperandeException, DivByZeroException {
      
      if(verif()) {
        double o2 = depiler();
        
        double o1= depiler();
         
        if(o2==0)
        {
          throw new DivByZeroException();
        }
        
        pile.add(o1/o2);
    } 
    }
    
    public void multiplication() throws ManqueOperandeException {
        
        if(verif()) {
            pile.add(depiler()*depiler());
        }
    }

    
    public ArrayList<Double> getOperandes(){
        return pile;
    }
        
}