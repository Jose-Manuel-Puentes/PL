import java.io.*;


class Token {

    public int fila;
    public int columna;
    
    public String lexema;

    public int tipo; // tipo es ID, ENTERO, REAL...

    public static final int
    PARI=1,
    PARD=2,
    MULOP=3,
    ADDOP=4;



    public Token()
    {

    }
    public String toString(){
		return lexema; 
    }

}
