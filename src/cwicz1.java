import java.util.InputMismatchException;
import java.util.Scanner;
// kalkulator
// dodatkowo wypadaloby zrobic try/catch
public class cwicz1 {
    public static void main(String[] args) {

        System.out.println("Hello from main");
        int number = input("Podaj liczbę: ");
        System.out.println(number);
        int secondNumber = input("Podaj kwotę zakupu: ");
        System.out.println(secondNumber);
//        System.out.println("KALKULATOR - Podaj liczby a następnie wybierz działanie");
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Podaj pierwszą liczbę: ");
//        double FirstNumber = input.nextDouble();
//        input.nextLine();
//        System.out.println("Podaj drugą liczbę: ");
//        double SecondNumber = input.nextDouble();
//        input.nextLine();
//
//        System.out.println("Wybierz działanie:");
//        System.out.println("1. Dodawanie");
//        System.out.println("2. Odejmowanie");
//        System.out.println("3. Mnożenie");
//        System.out.println("4. Dzielenie");
//        System.out.println("------------------");
//        int choice = input.nextInt();
//        input.close();
//
//        double result = 0;
//        switch (choice) {
//            case 1:
//                result = (FirstNumber + SecondNumber);
//                break;
//            case 2:
//                result = FirstNumber - SecondNumber;
//                break;
//            case 3:
//                result = FirstNumber * SecondNumber;
//                break;
//            case 4:
//                if (SecondNumber == 0) {
//                    System.out.println("Nie można dzielić przez 0.");
//                } else {
//                    result = FirstNumber / SecondNumber;
//                }
//                break;
//            default:
//                System.out.println("Nieprawidłowy wybór działania.");
//
//        }
//        if (choice >= 1 && choice <= 4) {
//            System.out.println("Wynik: " + result);
//        }
//    }
    }

    static int input(String message) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print(message);
           return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podano złą wartość.");
            return input(message);
        }

    }
}





//        switch(expression)
//        case x:
//        break;
//        case y:
//            break;
//            case ...)




