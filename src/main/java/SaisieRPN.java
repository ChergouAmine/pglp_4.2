import java.util.ArrayList;
import java.util.Scanner;

public class SaisieRPN {
    public Scanner sc; 
    private String c; 
    ArrayList<Character> operateur;
    MoteurRPN moteur;
    
    
  
    public SaisieRPN() {
        super();
        moteur = new MoteurRPN();
        moteur.associer();
        operateur = new ArrayList<Character>();
    }
    
    
    public void Saisie() throws PileVideException, SaisieVideException, ErreurException {
        sc = new Scanner(System.in);
        String saisie = "";
        c = "";
        System.out.print("Entrez chaque opération individuellement en appuyant sur entrée à chaque opération \n\n 'undo' pour annuler la dernière saisie et 'quit' pour arrêter le programme. ");
        
        do {
             saisie = sc.nextLine();
             
             if(saisie.equals("undo"))
                 c = moteur.commande.execute("undo", c);
             
             else if(!saisie.equals("quit")) 
                 c = c+ " " + saisie; //il faut un espace entre 2 saisies
            
             System.out.println("état avant saisie : "+c);
             System.out.println("état après saisie: "+c+" ");
        }while(!saisie.equals("quit"));
        
        moteur.commande.execute("quit"); 
    }
    
    
    public String getChaine() {
        return this.c;
    }
    
   
    public void empiler() throws ErreurSaisieException, PilePleineException, DivByZeroException, PileVideException, ErreurException {
        
      for(int i = 0; i < c.length(); i++) {
        
        if(c.charAt(i) == '+' || c.charAt(i) == '-' || c.charAt(i) == '/' || c.charAt(i) == '*'){
          operateur.add(c.charAt(i));
        }
        else if(c.charAt(i) <= 47 && c.charAt(i) >= 58 && c.charAt(i) != ' ') {
          throw new ErreurSaisieException();
        }
          else if((c.charAt(i) != '+') && (c.charAt(i) != '-') && (c.charAt(i) != '/') && (c.charAt(i) != '*') && (c.charAt(i) != ' ')) {
            
            String s = "";
            s +=c.charAt(i);
            double d = Double.parseDouble(s);
            moteur.commande.operande("add",d);
            
        }
      }     
    }
    
 
    public void Calculer() throws PileVideException, PilePleineException, DivByZeroException, ErreurException {
      
      
        if(operateur.size() != moteur.commande.getInteger("operande") - 1) {         
            throw new ErreurException();
        } 
        else {
         
            int nbOperateur = operateur.size();
           
            for(int i = 0; i < nbOperateur; i++) {
                moteur.commande.operation("op", operateur.get(0));
                operateur.remove(0);
            }
            moteur.commande.execute("afficher");
        }
    }   
}