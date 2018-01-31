package cifrador;

import java.util.Scanner;

public class Cifrador {

    static Scanner sc = new Scanner(System.in);
    static int k = 53; //actuador
    static String mensaje;

    /**
     * Encriptador por actuador El codigo ascii para las mayusculas va del 65 al
     * 90 minusculas 97 al 122
     *
     * @param args
     */
    public static void main(String[] args) {

        //mensaje = "abc";
        System.out.println("Por favor digite el mensaje a encriptar:");
        mensaje = sc.nextLine();

        mensaje = mensaje.toUpperCase();//cambia los caracteres a mayuscula
        
        encriptar();
    }

    public static String encriptar() {
        char array[] = mensaje.toCharArray();
        int size = array.length;

        int resultado;

        for (int i = 0; i < size; i++) {
            if (array[i] + (char) k > (char)90) {
                //System.out.println("se paso");
                resultado = array[i] + (char) k;
                do {
                    resultado = 64 + (resultado - 90);// 65 es la primera letra
                } while (resultado > 90);
                array[i] = (char)resultado;
            } else {
                //System.out.println("caso normal");
                array[i] = (char) (array[i] + (char) k);
            }

        }

        String encriptado = String.valueOf(array);
        System.out.println("Mensaje encriptado:");
        System.out.println(encriptado);

        return encriptado;
    }
    
    /**
     * Por ahora no funciona con codigos ascii 
     * que se pasen 90 al encriptar.
     * @param encriptado 
     */
    public static void desencriptar(String encriptado) {
        char arrayD[] = encriptado.toCharArray();
        int sizeD = arrayD.length;

        for (int i = 0; i < sizeD; i++) {
            if (true) {

            }
            arrayD[i] = (char) (arrayD[i] - (char) k);
        }

        String desencriptado = String.valueOf(arrayD);
        System.out.println("Mensaje desencriptado:");
        System.out.println(desencriptado);
    }
}
