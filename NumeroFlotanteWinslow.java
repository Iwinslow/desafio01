package desafio01;

public class NumeroFlotanteWinslow {
    public static void main(String[] args) {
        // Declaracion de variable tipo float
        float numeroFlotante = 99.9f;

        // Imprime la parte entera y separado la parte decimal de numeroFlotante
        System.out.println("Parte entera : " + (int) numeroFlotante);
        System.out.println("Parte decimal utilizando type casting : " + (numeroFlotante - (int) numeroFlotante));

        // Declaracion de variable numeroFlotante en String
        String numeroFlotanteEnString = Float.toString(numeroFlotante);

        System.out.println("Parte decimal convirtiendo numeroFlotante en String : "
                + numeroFlotanteEnString.substring(numeroFlotanteEnString.length() - 1));
    }
}
