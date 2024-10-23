public class stringToken {
    public static void main(String[] args) {
        // INPUT DATA:
        String texto = "eafit es una muy buena universidad, eafit ha tenido una tradición importante durante su trayectoria, en eafit es un honor estudiar";
        String token = "eafit";

        // OUTPUT DATA:
        int cont = contar(texto, token); 
        System.out.println("texto:\n" + texto);
        System.out.println("token: " + token);
        System.out.println("encontrado: " + cont + " veces");
    }
    public static int contar(String texto, String token) { //INPUT: object from class Sting'texto',OUTPUT: object from class Sting'texto' 
        int cont=0;
        for (int i = 0; i < texto.length()-token.length(); i++) { //COMPARE ALL THE POSITION UNTIL THE LENGTH OF THE 'token' SON THE SPIT WRROR DOESN'T SHOW
            // CREATES A SUBSTRING FROM 'text' WITH THE LENGTH OF THE STRING 'token' 
            // AND COMPARE EVERY POSTION WITH 'token' IF TRUE CONT NUMBER 'cont';
            if (texto.substring(i,i+token.length()).equals(token)) cont++; 
        }
        return cont;
    }
}
