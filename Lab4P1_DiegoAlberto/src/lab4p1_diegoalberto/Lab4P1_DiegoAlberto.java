package lab4p1_diegoalberto;

import java.util.Scanner;

public class Lab4P1_DiegoAlberto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Conjuntos");
        System.out.println("2. Contraseña mejorada ");
        int opcion = sc.nextInt();

        while (opcion != 3) {
            switch (opcion) {

                case 1: {
                    System.out.println("Igrese valor de A");
                    String A = sc.next();
                    System.out.println("Ingrse valor de B");
                    String B = sc.next();
                    
                    String union;
                    for (int i = 0; i <= A.length(); i++) {
                        
                    }

                }
                break;
                case 2: {
                    boolean segu = true;
                    boolean nosegu = false;

                    int cont;
                    System.out.println("Ingrese su contraseña");
                    String contra = "";
                    contra = sc.next();
                    int letra = 0;
                    int num = 0;

                    if (contra.length() < 8) {
                        nosegu = true;
                        System.out.println("Su contraseña es incorrecta");

                    } else if (num >= 48 &&  <= 57) {
                    }
                    break;

                }

            }
        }
    }
}
