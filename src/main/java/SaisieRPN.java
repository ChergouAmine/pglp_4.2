import java.util.Scanner;

/**
 * 
 * @author chergou
 * Classe permettant la saisie des opérandes et opérands
 *
 */
public class SaisieRPN {
    
    Scanner sc;    
    MoteurRPN moteur;
    Switch sw;

    public SaisieRPN() throws DivByZeroException, ManqueOperandeException {
        
        sc = new Scanner(System.in);      
        sw = new Switch();        
        moteur = new MoteurRPN();
        
        
       
        sw.ajoutCommande("+", new Addition(moteur));
        sw.ajoutCommande("-", new Soustraction(moteur));
        sw.ajoutCommande("/", (Commande) new Division(moteur));
        sw.ajoutCommande("*", (Commande) new Multiplication(moteur));
        sw.ajoutCommande("undo", new Undo(moteur));
        sw.ajoutCommande("quit", new Quit(moteur));
        
        while(true) {
            
            String line = sc.nextLine();
            
            try {
              
                Double o = Double.parseDouble(line);
                AjouterOperande a= new AjouterOperande(moteur, o);
                
                sw.ajoutCommande(line, a);
                sw.verifCommande(line);//execute la commande
                moteur.afficher();
            }
            catch(Exception e) {
                if( sw.verifCommande(line)) {
                    moteur.afficher();
                }
                else {
                    System.out.println("Les seuls input acceptable sont: + , - , * , / , undo et quit");
                }
            }
        
        }
        
    }

}