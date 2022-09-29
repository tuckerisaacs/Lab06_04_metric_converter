import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double meters = 0;

        System.out.println("enter the lenth in meters: ");
        if(in.hasNextDouble()){
            meters = in.nextDouble();}
        else{
            trash = in.nextLine();
            System.out.println("enter a valid number");
            }
        double feet = (meters*3.28084);
        double inch = (meters*39.3701);
        double miles = (meters/1609.344);

        System.out.println("enter the lenth in inches is: "+inch);
        System.out.println("enter the lenth in miles is: "+miles);
        System.out.println("enter the lenth in feet is: "+feet);





    }
    }
