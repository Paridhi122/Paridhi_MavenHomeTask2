package Hometask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chocolates implements Sweets {
    private String name;
    private int weight;
    private int quantity;

    Chocolates() {
    }

    Chocolates(String name, int weight, int quantity) {
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
     void giftBoxWeight(ArrayList<Chocolates> choc, int no) {
        int total=0,i;
        int w,q;
        for(i=0;i<no;i++) {
            w = choc.get(i).getWeight();
            q = choc.get(i).getQuantity();
            total = total+(w*q);
        }
         if(total>=1000) {
             int kg = total/ 1000;
             int gm=total%1000;
             System.out.println("Total weight of the chocolate gift box is: " +kg+"kg "+gm+"g");
         }else {
             System.out.println("Total weight of the chocolate gift box is: " + total +"g");
         }
    }
     void sortUsingQuanity(ArrayList<Chocolates> choc,int no) {
        int i,j;
        for(i=0;i<no;i++) {
            for(j=i+1;j<no;j++) {
                if(choc.get(i).getQuantity()>choc.get(j).getQuantity())
                {
                    Chocolates temp=choc.get(i);
                    choc.set(i,choc.get(j));
                    choc.set(j,temp);
                }
            }
        }
        System.out.println("**** SORTED ON THE BASIS OF QUANTITY ****");
        for(i=0;i<no;i++)
        {
            System.out.println("NAME: "+choc.get(i).getName()+" , QUANTITY: "+choc.get(i).getQuantity()+" WEIGHT: "+ choc.get(i).getWeight());
        }
    }
    public void sortUsingName(ArrayList<Chocolates> choc,int no) {
        int i,j;
        for(i=0;i<no;i++) {
            for(j=i+1;j<no;j++) {
                if(choc.get(i).getName().compareTo(choc.get(j).getName())>0)
                {
                    Chocolates temp=choc.get(i);
                    choc.set(i,choc.get(j));
                    choc.set(j,temp);
                }
            }
        }
        System.out.println("**** SORTED ON THE BASIS OF NAME ****");
        for(i=0;i<no;i++)
        {
            System.out.println("NAME: "+choc.get(i).getName()+" , QUANTITY: "+choc.get(i).getQuantity()+" WEIGHT: "+ choc.get(i).getWeight());
        }
    }
    public void sortUsingWeight(ArrayList<Chocolates> choc,int no) {
        int i,j;
        for(i=0;i<no;i++) {
            for(j=i+1;j<no;j++) {
                if(choc.get(i).getWeight()>choc.get(j).getWeight())
                {
                    Chocolates temp=choc.get(i);
                    choc.set(i,choc.get(j));
                    choc.set(j,temp);
                }
            }
        }
        System.out.println("**** SORTED ON THE BASIS OF WEIGHT ****");
        for(i=0;i<no;i++)
        {
            System.out.println("NAME: "+choc.get(i).getName()+" , QUANTITY: "+choc.get(i).getQuantity()+" WEIGHT: "+ choc.get(i).getWeight());
        }
    }
    public void findUsingName(ArrayList<Chocolates> choc,int no){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to be searched:");
        String s1 = sc.nextLine();
        for(int i=0;i<no;i++){
            if(choc.get(i).getName().equals(s1)){
                System.out.println("**** Chocolate found ****");
                System.out.println("NAME: "+choc.get(i).getName()+" , QUANTITY: "+choc.get(i).getQuantity()+" WEIGHT: "+ choc.get(i).getWeight());
            }
        }
    }
}
