import java.io.*;


class Token {

    public int fila;
    public int columna;
    
    public String lexema;

    public int tipo; // tipo es ID, ENTERO, REAL...

    public static final int
    PARI        =1,
    PARD        =2,
    MULOP       =3,
    ADDOP       =4,
    PYC         =5,
    DOSP        =6,
    COMA        =7,
    ASIG        =8,
    LLAVEI      =9,
    LLAVED      =10,
    CLASS       =11,
    PUBLIC      =12,
    PRIVATE     =13,
    FLOAT       =14,
    INT         =15,
    RETURN      =16,
    ENTERO      =17,
    ID          =18,
    REAL        =19,
    EOF         =20;

    public Token()
    {
        
    }
    public String toString(){
        String resul="";
        switch(tipo)
        {
            case PARI       :resul="(";
                    break;      
            case PARD       :resul=")";
                    break;
            case MULOP      :resul="* /";
                    break;
            case ADDOP      :resul="+ -";
                    break;
            case PYC        :resul=";";
                    break;
            case DOSP       :resul=":";
                    break;
            case COMA       :resul=",";
                    break;
            case ASIG       :resul="=";
                    break;
            case LLAVEI     :resul="{";
                    break;
            case LLAVED     :resul="}";
                    break;
            case CLASS      :resul="'class'";
                    break;
            case PUBLIC     :resul="'public'";
                    break;
            case PRIVATE    :resul="'private'";
                    break;
            case FLOAT      :resul="float'";
                    break;
            case INT        :resul="'int'";
                    break;
            case RETURN     :resul="'return'";
                    break;
            case ENTERO     :resul="numero entero";
                    break;
            case ID         :resul="identificador";
                    break;
            case REAL       :resul="numero real";
                    break;
            case EOF :resul="EOF";
                    break;

        }

		return resul; 
    }

}
