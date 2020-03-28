
public class Undo implements Interpreteur {
    private final Calcul calcul;

    public Undo(Calcul c) {
        calcul = c;
    }

   
    public void execute()throws ErreurException {
        throw new ErreurException();
    }
    
    
    public String execute(String s) throws SaisieVideException {
        return calcul.annuler(s);
    }
    
    public void operandes(double d)throws ErreurException {
        throw new ErreurException();
    }
    
   
    public int getInt()throws ErreurException {
        throw new ErreurException();
    } 
}