package Hometask;

import java.util.ArrayList;
import java.util.Scanner;

public class Candy implements Sweets {
    private String name;
    private int weight;
    private int quantity;

    Candy() {}
     Candy(String name, int weight, int quantity) {
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    void giftBoxWeight(ArrayList<Candy> candy, int no) {
        int total=0,i;
        int w,q;
        for(i=0;i<no;i++)
        {
            w = candy.get(i).getWeight();
            q = candy.get(i).getQuantity();
            total = total+(w*q);
        }
        if(total>=1000) {
            int kg = total/ 1000;
            int gm=total%1000;
            System.out.println("Total weight of the candyolate gift box is: " +kg+"kg "+gm+"g");
        }else {
            System.out.println("Total weight of the candyolate gift box is: " + total +"g");
        }
    }
    public void sortUsingQuanity(ArrayList<Candy> candy,int no) {
        int i,j;
        for(i=0;i<no;i++) {
            for(j=i+1;j<no;j++) {
                if(candy.get(i).getQuantity()>candy.get(j).getQuantity())
                {
                    Candy temp=candy.get(i);
                    candy.set(i,candy.get(j));
                    candy.set(j,temp);
                }
            }
        }
        System.out.println("**** SORTED ON THE BASIS OF QUANTITY ****");
        for(i=0;i<no;i++)
        {
            System.out.println("NAME: "+candy.get(i).getName()+" , QUANTITY: "+candy.get(i).getQuantity()+" WEIGHT: "+ candy.get(i).getWeight());
        }
    }
    public void sortUsingName(ArrayList<Candy> candy,int no) {
        int i,j;
        for(i=0;i<no;i++) {
            for(j=i+1;j<no;j++) {
                if(candy.get(i).getName().compareTo(candy.get(j).getName())>0)
                {
                    Candy temp=candy.get(i);
                    candy.set(i,candy.get(j));
                    candy.set(j,temp);
                }
            }
        }
        System.out.println("**** SORTED ON THE BASIS OF NAME ****");
        for(i=0;i<no;i++)
        {
            System.out.println("NAME: "+candy.get(i).getName()+" , QUANTITY: "+candy.get(i).getQuantity()+" WEIGHT: "+ candy.get(i).getWeight());
        }
    }
    public void sortUsingWeight(ArrayList<Candy> candy,int no) {
        int i,j;
        for(i=0;i<no;i++) {
            for(j=i+1;j<no;j++) {
                if(candy.get(i).getWeight()>candy.get(j).getWeight())
                {
                    Candy temp=candy.get(i);
                    candy.set(i,candy.get(j));
                    candy.set(j,temp);
                }
            }
        }
        System.out.println("**** SORTED ON THE BASIS OF WEIGHT ****");
        for(i=0;i<no;i++)
        {
            System.out.println("NAME: "+candy.get(i).getName()+" , QUANTITY: "+candy.get(i).getQuantity()+" WEIGHT: "+ candy.get(i).getWeight());
        }
    }
    public void findUsingName(ArrayList<Candy> candy,int no){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to be searched:");
        String s1 = sc.nextLine();
        for(int i=0;i<no;i++){
            if(candy.get(i).getName().equals(s1)){
                System.out.println("**** Chocolate found ****");
                System.out.println("NAME: "+candy.get(i).getName()+" , QUANTITY: "+candy.get(i).getQuantity()+" WEIGHT: "+ candy.get(i).getWeight());
            }
        }
    }
}
