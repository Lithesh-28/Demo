package exceptionDemo;

import java.util.Scanner;

public class AgeValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        try{
            if(age>18){
                System.out.println("You are eligible to vote");
            }
            else{
                throw new CustomExceptionDemo("You are not eligible to vote");
            }
        }catch (CustomExceptionDemo e){
            System.out.println(e.message);
        }catch (Exception e){
            e.getMessage();
        }
    }
}
