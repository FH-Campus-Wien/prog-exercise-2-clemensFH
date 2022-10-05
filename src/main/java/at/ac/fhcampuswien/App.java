package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

    private static Scanner scanner;


    //todo Task 1
    public void largestNumber(){
        int counter = 1;
        double currentInput, max = 0.0;
        scanner = new Scanner(System.in);

        do{
            System.out.print("Number " + counter + ": ");
            currentInput = scanner.nextDouble();
            if(currentInput <= 0.0 && counter == 1){
                System.out.println("No number entered.");
                return;
            }
            counter++;

            if(currentInput > max){
                max = currentInput;
            }
        }while(currentInput > 0.0);

        String output = String.format("The largest number is %.2f", max);
        System.out.println(output);

    }

    //todo Task 2
    public void stairs(){
        scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        if(n < 1){
            System.out.println("Invalid number!");
            return;
        }
        int counter = 0;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                counter++;
                System.out.print(counter + " ");
            }
            System.out.print(System.lineSeparator());
        }
    }

    //todo Task 3
    public void printPyramid(){
        final int i = 6;
        int length = i*2-1;

        String line = "           "; // length Abstände
        char[] arr = line.toCharArray();

        int l = i-1, r = i-1;
        for(int j=0; j<i; j++){
            arr[l] = '*';
            arr[r] = '*';
            l--;
            r++;
            String output = new String(arr).substring(0, r);
            System.out.println(output);
        }
    }

    //todo Task 4
    public void printRhombus(){
        scanner = new Scanner(System.in);
        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);
        if(h % 2 == 0){
            System.out.println("Invalid number!");
            return;
        }

        String line = "";
        for(int i=0; i<h; i++){
            line += " ";
        }
        char[] arr = line.toCharArray();

        int l = h/2, r = h/2;
        char current;
        for(int i=0; i<h; i++){
            if(i <= h/2){
                current = (char)((int)c - i);
                arr[l] = current;
                arr[r] = current;
                l--;
                r++;
                String output = new String(arr).substring(0, r);
                System.out.println(output);
            } else{
                l++;
                r--;
                arr[l] = ' ';
                arr[r] = ' ';
                String output = new String(arr).substring(0, r);
                System.out.println(output);
            }
        }
    }

    //todo Task 5
    public void marks(){
        scanner = new Scanner(System.in);
        double sum = 0.0;
        int counter = 1, negatives = 0, input;

        do{
            System.out.print("Mark " + counter +": ");
            input = scanner.nextInt();
            if(input > 0 && input < 6){
                sum += input;
                counter++;
            } else if(input > 6){
                System.out.println("Invalid mark!");
            }
            if(input == 5){
                negatives++;
            }
        }while(input != 0);

        double avg = sum/(counter-1);
        if(sum == 0){
            avg = 0.0;
        }
        System.out.printf("Average: %.2f" + System.lineSeparator(), avg);
        System.out.println("Negative marks: " + negatives);
    }

    //todo Task 6
    public void happyNumbers(){
        scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt(), sum=0;
        int current = n;

        do{
            while(current > 0){
                int h = current % 10;
                sum += h*h;
                current /= 10;
            }
            current = sum;
            sum = 0;
        }while(current != 1 && current != 4);

        if(current == 1){
            System.out.println("Happy number!");
        } else {
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}