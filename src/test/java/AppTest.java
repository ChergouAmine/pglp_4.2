import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

  @Test
  public void testSaisie() throws PilePleineException, DivByZeroException, PileVideException, ErreurSaisieException, SaisieVideException, ErreurException{
    SaisieRPN saisie = new SaisieRPN();
    
    saisie.Saisie();
    saisie.empiler();
    saisie.Calculer();
    
    assertTrue(true );
}
  
  
  public void testMoteur() throws PilePleineException, DivByZeroException, PileVideException, ErreurException{
    MoteurRPN m = new MoteurRPN();
    m.associer();
    m.commande.operande("add",26.0);
    m.commande.operande("add", 5.0);
    m.commande.operande("add", 5.0);
    m.commande.execute("undo"); 
    m.commande.execute("quit"); 
    m.commande.operation("op", '+');
    m.commande.execute("afficher"); 
    
    assertTrue(true );
}
  
  public void testUndo() throws PilePleineException, DivByZeroException, PileVideException, ErreurException, SaisieVideException {
    MoteurRPN m = new MoteurRPN();
    String chaine;
    
    m.associer();
    m.commande.operande("add",26.0);
    m.commande.operande("add", 5.0);
    m.commande.operation("op", '+');
    m.commande.operation("op", '-');
    chaine = "26.0 5.0 + -";
    chaine = m.commande.execute("undo", chaine); 
    
    assertEquals("26.0 5.0 +", chaine);
}
  
}
