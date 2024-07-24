package Date_20_07_24;

import java.util.Scanner;

public class lab093_Switch_Browser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name!!, where you want to execute the program!");
        String browser_name=sc.next();
        browser_name = browser_name.toLowerCase();

        switch (browser_name){
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "firefox":
                System.out.println("Statrting the FireFox browser ");
                break;
            case "operamini":
                System.out.println("Starting the Opera Mini Browser");
                break;
            case "mozila":
                System.out.println("Starting the Mozila browser");
                break;
            default:
                System.out.println("I have no idea which browser it is");

        }
    }
}
