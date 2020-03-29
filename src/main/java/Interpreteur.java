
public interface Interpreteur {
    public  void execute() throws PileVideException, ErreurException;
    public void operation(char c) throws DivByZeroException, PileVideException, ErreurException, PilePleineException;
    public String execute(String s) throws SaisieVideException, ErreurException;
    public void operandes(double d) throws PilePleineException, DivByZeroException, PileVideException, ErreurException;
    public int getInt() throws PileVideException, ErreurException;
}