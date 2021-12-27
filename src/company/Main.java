package company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        String enter;
        double num,pay,mons,prosent;

        System.out.println("What do you want to calculate? \n" +
                "type \"n\" for number of monthly payments,  \n" +
                "type \"a\" for annuity monthly payment amount,  \n" +
                "type \"p\" for loan principal: \n");
        enter = scanner1.nextLine();

        if (enter.equals("n")){
            System.out.println("Enter the loan principal: ");
            num = scanner.nextDouble();
            System.out.println("Enter the monthly payment: ");
            pay = scanner.nextDouble();
            System.out.println("Enter the loan interest: ");
            prosent =scanner.nextDouble();
            double i;
            i = (0.1)/(12*1);

            double l = log(pay / (pay - (i * num)))/log(1+i);
            round(l);
            double months =l;
            double years = l/12;
            double remainingMonths = months % 12;
            System.out.println("Years: "+ round(years) + " mounths: "+ round(remainingMonths));

        }
        if (enter.equals("a")){
            System.out.println("Enter the loan principal: ");
            num = scanner.nextDouble();
            System.out.println("Enter the number of periods: ");
            mons = scanner.nextDouble();
            System.out.println("Enter the loan interest: ");
            prosent =scanner.nextDouble();

            double x =num*(0.01+(0.01/(pow(1+0.01,mons)-1)));

            System.out.println("Your months payment: "+round(x));

        }
        if (enter.equals("p")){
            System.out.println("Enter the annuity payment: ");
            num = scanner.nextDouble();
            System.out.println("Enter the number of periods: ");
            mons = scanner.nextDouble();
            System.out.println("Enter the loan interest: ");
            prosent =scanner.nextDouble();

            double d = num/((0.056*pow(1+0.056,mons))/pow(1+0.056,mons)-1);
            System.out.println(d);
        }
        if(enter.equals("d")){
            System.out.println("Annuity");
            double period,sum,proz,res;
            System.out.println("Dperiods: ");
            period = scanner.nextDouble();
            System.out.println("Dprincipal: ");
            sum = scanner.nextDouble();
            System.out.println("Dinterest: ");
            proz = scanner.nextDouble();
            res = sum*(0.1/(1+0.1)-period-1);
            System.out.println(res);


        }

    }
}


