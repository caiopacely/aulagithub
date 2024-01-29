import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double s,imposto;
        System.out.print("Salary: ");
        s = sc.nextDouble();
        imposto = 0;

        if (s<=2000){
            System.out.print("Isento");
        }
        else if (s<=3000){
            imposto = ((s-2000)*0.08);
            System.out.printf("R$ %.2f",imposto);
        }
        else if (s<=4500){
            imposto = (1000*0.08) + ((s-3000)*0.18);
            System.out.printf("R$ %.2f",imposto);
        }
        else {
            imposto = (1000*0.08) + (1500*0.18) + ((s-4500)*0.28);
            System.out.printf("R$ %.2f",imposto);

        }
        sc.close();

    }
}
