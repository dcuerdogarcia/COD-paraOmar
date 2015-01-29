//examen omar ortiz de lejarazu martinez 1º DAM
package examencod;

public class ExamenCOD {
//Borja es un viciao y lo único que hace es jugar.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iN = 16;
        if (metodoMio(iN)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int x = 2; x < 1000; x++) {
            if (metodoMio(x)) {
                System.out.print(x + " ");
            }
        }
    }
/** la expresion aux es igual a FALSE con variable =16 y j=2
* la expresion (aux) && (j!=variable) variable=22 y para j=21 es TRUE
**/ 
    public static boolean metodoMio(int variable) {
        int j = 2;
        boolean aux = true;
        while ((aux) && (j != variable)) {
            if (variable % j == 0) {
                aux = false;
            }
            j++;
        }
        return aux;
    }

}
