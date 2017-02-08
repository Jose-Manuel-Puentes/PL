import java.io.*;


class Token {

    public int fila;
    public int columna;
    
    public String lexema;

    public int tipo; // tipo es ID, ENTERO, REAL...

    public static final int
    ID=1,
    ENTERO=2,
    EOF=3;

    public Token()
    {
    	
    }
    public String toString(){
		return lexema; 
    }

}
