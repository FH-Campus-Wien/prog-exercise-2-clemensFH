package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

    private static Scanner scanner;


    //todo Task 1
    public void largestNumber(){
        int counter = 1;
        double currentInput;
        ArrayList<Double> list = new ArrayList<>();
        scanner = new Scanner(System.in);

        do{
            System.out.print("Number " + counter + ": ");
            currentInput = scanner.nextDouble();
            counter++;
            if(currentInput > 0.0){
                list.add(currentInput);
            }
        }while(currentInput > 0.0);

        if(list.size() == 0){
            System.out.println("No number entered.");
        } else{
            Collections.sort(list, Collections.reverseOrder());
            double max = list.get(0);
            String output = String.format("The largest number is %.2f", max);
            System.out.println(output);
        }

    }

    //todo Task 2
    public void stairs(){
        scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        if(n < 1){
            System.out.println("Invalid number!");
        } else{
            int counter = 0;
            for(int i=1; i<=n; i++){
                for(int j=0; j<i; j++){
                    counter++;
                    System.out.print(counter + " ");
                }
                System.out.print(System.lineSeparator());
            }
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
            System.out.println(arr);
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
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
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