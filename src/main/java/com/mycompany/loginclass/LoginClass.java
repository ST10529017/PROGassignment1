

package com.mycompany.loginclass;
import java.util.Scanner;
public class LoginClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a valid Userame");
        String userName = scan.nextLine();
        mthodsClass Objectname = new mthodsClass();
        Objectname.checkUserName(userName);
        
    }
}
