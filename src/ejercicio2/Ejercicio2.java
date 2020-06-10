package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String palabra = getString();
        String palabraInversa = "";
        for(int i = palabra.length()-1; i>=0;i--){
            palabraInversa += palabra.charAt(i);
        }
        
        if (palabra.equals(palabraInversa)){
            System.out.println(String.format("La palabra %s es palindroma", palabra));
        }else{
            System.out.println(String.format("La palabra %s no es palindroma", palabra));
        }
    }
    
    public static String getString(){
        Scanner scan;
        scan = new Scanner(System.in);
        String palabra = "";
        while (true){
            System.out.println("Ingrese cantidad de numeros a mostrar");
            palabra = scan.nextLine();
            if (palabra != null && (!palabra.equals(""))){
                break;
            }else{
                System.err.println("¡Error! Palabra invalida");
            }
        }
        return palabra;
    }
    
}
