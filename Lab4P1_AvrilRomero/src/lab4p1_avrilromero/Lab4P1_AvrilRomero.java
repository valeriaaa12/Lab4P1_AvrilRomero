/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_avrilromero;

import java.util.Scanner;

/**
 *
 * @author rodge
 */
public class Lab4P1_AvrilRomero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir) {
            Scanner Leer = new Scanner(System.in);
            Scanner num = new Scanner(System.in);
            System.out.println("1.Conjuntos");
            System.out.println("2.Contrasena Mejorada");
            System.out.println("3.Salir");
            System.out.println("Ingrese una opcion: ");
            int opcion = Leer.nextInt();
            switch (opcion) {
                case 1: {
                    String cadena1, cadena2;
                    System.out.println("Ingrese un conjunto: ");
                    cadena1 = Leer.next();
                    System.out.println("Ingrese un conjunto: ");
                    cadena2 = Leer.next();
                    boolean correcta = true;
                    int x = (int) cadena1.charAt(0);
                    if (x <= 90 && x >= 65) {

                    }else {
                        correcta = false;

                    }
                    x = (int) cadena2.charAt(0);
                    if (x <= 90 && x >= 65) {

                    } else {
                        correcta = false;
                    
                    }
                   
                    if (correcta) {
                        String cad1 = "";
                        for (int j = 2; j < cadena1.length(); j++) {
                            cad1 += cadena1.charAt(j);
                        }
                        String cad2 = "";
                        for (int j = 2; j < cadena2.length(); j++) {
                            cad2 += cadena2.charAt(j);
                        }
                        System.out.println(cad1);
                        System.out.println(cad2);
                        if (cad1.equals(cad2)) {
                            System.out.println("Ambos conjuntos son iguales");
                        } else {
                            System.out.println("Ambos conjuntos no son iguales");
                        }
                        String Union = "";
                        for (int i = 3; i < cadena1.length() - 1; i++) {
                            Union += cadena1.charAt(i);
                        }
                        Union += ",";
                        for (int i = 3; i < cadena2.length() - 1; i++) {
                            Union += cadena2.charAt(i);
                        }
                        System.out.println("Union: " + "{" + Union + "}");
                        String Inter = "";
                        for (int i = 1; i < cad1.length(); i++) {
                            char t = cad2.charAt(i);
                            for (int k = 1; k < cad2.length(); k += 2) {
                                char e = cad1.charAt(k);
                                if (t==e){
                                    Inter+=e;
                                }
                            }Inter+="";
                        }
                        System.out.println("La Interseccion: " + "{" + Inter + "}");

                    }

                }
                break;
                case 2: {
                    String contra;
                    System.out.println("Ingrese su contrasena: ");
                    contra = Leer.next().toLowerCase();
                    System.out.println("Ingrese un numero: ");
                    int num1 = num.nextInt();
                    boolean igual = true;
                    int acum = 0;
                    int acum2 = 0;
                    int acum3 = 0;
                    for (int j = 0; j < contra.length(); j++) {
                        char letra = contra.charAt(j);
                        if (letra >= 65 && letra <= 90 || letra >= 97 && letra <= 122) {
                            acum++;
                        }
                    }
                    for (int j = 0; j < contra.length(); j++) {
                        char letra = contra.charAt(j);
                        if (letra >= 48 && letra <= 57) {
                            acum2++;
                        }
                    }
                    if (acum < 1) {
                        System.out.println("La contrasena no es segura porque ocupa una letra");
                    } else {
                        acum3++;
                    }
                    if (contra.length() < 8) {
                        System.out.println("La contrasena no es segura porque tiene menos de 8 caracteres");
                    } else {
                        acum3++;
                    }
                    if (acum2 < 1) {
                        System.out.println("La contrasena no es segura porque ocupa un numero");
                    } else {
                        acum3++;
                    }
                    if (acum3 == 3) {
                        System.out.println("La contrasena es segura");
                        String nueva = "";
                        int cont = 1;
                        for (int i = 0; i < contra.length(); i++) {
                            char z = contra.charAt(i);
                            nueva += z;
                            if (i == cont) {
                                cont += 2;
                                nueva += num1;
                                num1++;
                            }

                        }
                        System.out.println("La nueva contrasena es: " + nueva);
                    }
                }//fin del case 2
                break;
                case 3: {
                    seguir = false;
                }
                break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }//fin del switch

        }//fin del while
    }

}
