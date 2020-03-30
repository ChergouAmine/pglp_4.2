import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
  
  MoteurRPN moteur;
  Switch sw;
  
  @Before
  public void testInitMoteurRPN(){
    sw = new Switch();        
    moteur = new MoteurRPN();
      
      sw.ajoutCommande("+", new Addition(moteur));
      sw.ajoutCommande("-", new Soustraction(moteur));
      sw.ajoutCommande("/", (Commande) new Division(moteur));
      sw.ajoutCommande("*", (Commande) new Multiplication(moteur));
      sw.ajoutCommande("undo", new Undo(moteur));
      sw.ajoutCommande("quit", new Quit(moteur));
  }
  
  @Test
  public void testUndo() throws DivByZeroException, ManqueOperandeException{
      moteur = new MoteurRPN();
      sw = new Switch();
      
      sw.ajoutCommande("+", new Addition(moteur));
      
      Double o1 = 10.0;
      Double o2 = 10.0;
      
      sw.ajoutCommande(o1.toString(), new AjouterOperande(moteur, o1));
      sw.verifCommande(o1.toString());  
      
      sw.ajoutCommande(o2.toString(), new AjouterOperande(moteur, o2));
      sw.verifCommande(o2.toString());  
      
      sw.verifCommande("+");
      
      sw.ajoutCommande("undo", new Undo(moteur));
      sw.verifCommande("undo");
      
      assertTrue(moteur.getOperandes().get(1)==10.0); 
  }


}
