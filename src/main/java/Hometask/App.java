package Hometask;

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        String name;
        int weight,quantity,no,ch;
        ArrayList<Candy> candies = new ArrayList<>();
        ArrayList<Chocolates> chocolates = new ArrayList<>();
        Chocolates c = new Chocolates();
        Candy candy = new Candy();
        Scanner sc=new Scanner(System.in);
        System.out.println("Which one you want to make gift box of?");
        System.out.println("1. Chocolates ");
        System.out.println("2. Candy ");
        int choice = sc.nextInt();
        System.out.println("Enter number of chocolates/candies in gift box:");
        no=sc.nextInt();
        switch(choice) {
            case 1: for(int i=0;i<no;i++){
                        System.out.println("Enter chocolate name:");
                        name=sc.next();
                        System.out.println("Enter chocolate weight(gm):");
                        weight=sc.nextInt();
                        System.out.println("Enter chocolate quantity:");
                        quantity=sc.nextInt();
                        chocolates.add(new Chocolates(name,weight,quantity));
                    }
                    break;
            case 2: for(int i=0; i<no ;i++) {
                        System.out.println("Enter candy name:");
                        name=sc.nextLine();
                        System.out.println("Enter candy weight(gm):");
                        weight=sc.nextInt();
                        System.out.println("Enter candy quantity:");
                        quantity=sc.nextInt();
                        candies.add(new Candy(name,weight,quantity));
                    }
                    break;
            default: System.out.println("Wrong choice!!");
        }
        System.out.println( "**** MENU ****" );
        System.out.println("1. Calculate total weight of gift box");
        System.out.println("2. Sort the contents of gift box");
        System.out.println("3. Find candy/chocolate in the gift box");
        System.out.println("4. Exit");
        do {
            ch = sc.nextInt();
            switch(ch) {
                case 1: if(choice==1) {
                            c.giftBoxWeight(chocolates,no);
                        }else{
                            candy.giftBoxWeight(candies, no);
                        }
                    break;

                case 2: System.out.println("Sort the gift box on the basis:");
                        System.out.println("1. Name");
                        System.out.println("2. Weight");
                        System.out.println("3. Quantity");
                        int sort = sc.nextInt();
                        if(choice == 1) {
                            if(sort == 1){
                                c.sortUsingName(chocolates,no);
                            } else if(sort == 2){
                                c.sortUsingWeight(chocolates,no);
                            }
                            else {
                                c.sortUsingQuanity(chocolates,no);
                            }
                        }else{
                            if(sort == 1){
                                candy.sortUsingName(candies,no);
                            } else if(sort == 2){
                                candy.sortUsingWeight(candies,no);
                            }
                            else {
                                candy.sortUsingQuanity(candies,no);
                            }
                        }
                        break;
                case 3: System.out.println("Find from the gift box on the basis:");
                        if(choice == 1){
                            c.findUsingName(chocolates,no);
                        } else {
                            candy.findUsingName(candies,no);
                        }
                        break;
                case 4: System.out.print("Program terminated!!");
                        System.exit(0);
                        break;
                default: System.out.print("Wrong choice!!!");
            }

        }while(ch!=4);

    }
}
