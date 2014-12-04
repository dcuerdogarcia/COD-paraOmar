/** examen omar ortiz de lejarazu martinez 1º DAM

* [FORMATEO EL CODIGO] - Selecciono el texto y presiono alt + mayus + F

* [CAMBIO DE NOMBRES DE VARIABLES Y METODOS] - Selecciono la variable, clico el boton
* derecho del ratón, pulso refactor y seguido rename.
* ///variables\\\\
* iN -> variableUno
* x -> a
* j -> jota
* aux -> auja
* variable ->variableCinco
* ///Metodos\\\
* metodoMio -> metodoTuyo
* **/
package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int variableUno = 11;
        if (metodoTuyo(variableUno)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int a = 2; a < 1000; a++) {
            if (metodoTuyo(a)) {
                System.out.print(a + " ");
            }
        }
    }

    public static boolean metodoTuyo(int variableCinco) {
        int jota = 2;
        boolean auja = true;
        while ((auja) && (jota != variableCinco)) {
            if (variableCinco % jota == 0) {
                auja = false;
            }
            jota++;
        }
        return auja;
    }

}
