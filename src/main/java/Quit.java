/**
 * 
 * @author chergou
 * Classe Quit qui permet d'utilise la fonction quit de dl'interpreteur
 *
 */
public class Quit implements Commande{

    Interpreteur interpreteur;
    

    public Quit(Interpreteur i) {
        interpreteur = i;
    }

    
    public void execute() {
      interpreteur.quit();
    }

}