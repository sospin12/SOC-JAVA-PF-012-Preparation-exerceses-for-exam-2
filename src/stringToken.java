public class stringToken {
    public static void main(String[] args) {
        // datos de entrada:
        String texto = "eafit es una muy buena universidad, eafit ha tenido una tradición importante durante su trayectoria, en eafit es un honor estudiar";
        String token = "eafit";
        int cont = contar(texto, token); // datos de salida.
        System.out.println("texto:\n" + texto);
        System.out.println("token: " + token);
        System.out.println("encontrado: " + cont + " veces");
    }
    public static int contar(String texto, String token) {
        int cont=0;
        for (int i = 0; i < texto.length()-token.length(); i++) {
            if (texto.substring(i,i+token.length()).equals(token)) cont++;
        }
        return cont;
    }
}
