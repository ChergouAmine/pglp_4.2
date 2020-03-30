/**
 * 
 * @author chergou
 * l'interface Commande
 *
 */
public interface Commande {
   public abstract void execute() throws ManqueOperandeException, DivByZeroException;    
}