
package proyecto3;
import java.util.Scanner;

public class Proyecto3 {
    // Funciones de las conversiones. 
    static double fahrenheit(int x){
        return (x * 9.0/5.0) + 32;
    }
    static double kelvin(int x){
        return x + 273.15;
    }
    static double kilometros(double x){
        return x / 1000;
    }
    static double centimetros(double x){
        return x * 100;
    }
    static double millas(double x){
        return x / 1609.34;
    }
    static double gramos(double x){
        return x * 1000;
    }
    static double toneladas(double x){
        return x / 1000;
    }
    static double libras(double x){
        return x * 2.205;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int select;

        System.out.println("¿Que conversion quieres hacer?\n"
                + "1. Temperatura\n"
                + "2. Distancia\n"
                + "3. Masa");
        
        select = sc.nextInt();

        switch (select){
            
            case 1: // TEMPERATURA
                System.out.println("Selecciona conversion:\n"
                        + "1. Celsius a Fahrenheit\n"
                        + "2. Celsius a Kelvin");
                int t = sc.nextInt();
                System.out.println("Introduce el valor en Celsius:");
                int c = sc.nextInt();
                
                switch(t){
                    case 1:
                        System.out.println("Resultado: " + fahrenheit(c) + " °F");
                        break;
                    case 2:
                        System.out.println("Resultado: " + kelvin(c) + " K");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
                break;
                
            case 2: // DISTANCIA
                System.out.println("Selecciona conversion:\n"
                        + "1. Metros a Kilometros\n"
                        + "2. Metros a Centimetros\n"
                        + "3. Metros a Millas");
                int d = sc.nextInt();
                System.out.println("Introduce el valor en metros:");
                double m = sc.nextDouble();
                
                switch(d){
                    case 1:
                        System.out.println("Resultado: " + kilometros(m) + " km");
                        break;
                    case 2:
                        System.out.println("Resultado: " + centimetros(m) + " cm");
                        break;
                    case 3:
                        System.out.println("Resultado: " + millas(m) + " millas");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
                break;
                
            case 3: // MASA
                System.out.println("Selecciona conversion:\n"
                        + "1. Kilogramos a Gramos\n"
                        + "2. Kilogramos a Toneladas\n"
                        + "3. Kilogramos a Libras");
                int ms = sc.nextInt();
                System.out.println("Introduce el valor en kilogramos:");
                double kg = sc.nextDouble();
                
                switch(ms){
                    case 1:
                        System.out.println("Resultado: " + gramos(kg) + " g");
                        break;
                    case 2:
                        System.out.println("Resultado: " + toneladas(kg) + " t");
                        break;
                    case 3:
                        System.out.println("Resultado: " + libras(kg) + " lb");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
                break;
                
            default:
                System.out.println("Opcion no valida.");
        }
    }
}
