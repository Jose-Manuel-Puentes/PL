import static Token.EOF;
import java.io.*;

class AnalizadorLexico {
        
   RandomAccessFile fichero;
	public AnalizadorLexico(RandomAccessFile entrada){

	}
        
        public char leerCaracter()
        {
            char currentChar;
            try {
                currentChar = (char)fichero.readByte();
                return currentChar;
            }
            catch (EOFException e) {
                return EOF; // constante estática de la clase
            }
            catch (IOException e) { // error lectura
            
            }
            return ' ' ;
        }


   	public static Token siguienteToken(){ 
   		Token resul=new Token();
                
   		return resul;
    }
}