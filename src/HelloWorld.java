import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String name_ = "João Samuel";
        int age_ = 5;
        double height_ = 1.10;
        System.out.printf("Name_: %s, Age_: %d, Heigth_: %.2f", name_, age_, height_);

        System.out.println();
        System.out.println("De acordo com exemplo acima, informe seus dados");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your heigth: ");
        String heigthString = scanner.nextLine();

        //Substituição do (.) pela (,)
        String correctedHeigth = heigthString.replace(',', '.');
        double heigth = Double.parseDouble(correctedHeigth);

        System.out.printf("Name: %s, Age: %d, heigth : %.2f", name, age, heigth);

    }

    @Override
    public String toString() {
        return "HelloWorld []";
    }

}
