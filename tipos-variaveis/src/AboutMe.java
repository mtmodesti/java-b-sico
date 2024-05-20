import java.util.Scanner;
import java.util.Locale;


public class AboutMe {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Nome: ");
        String name = scanner.next();

        System.out.println("Idade: ");
        String age = scanner.next();

        System.out.println("Altura: ");
        String heigth = scanner.next();

        System.out.println("Nome: " + name);
        System.out.println("Idade" + age);
        System.out.println("Altura" + heigth);




    }

}
