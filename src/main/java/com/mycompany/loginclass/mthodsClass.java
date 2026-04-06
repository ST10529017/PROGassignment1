
package com.mycompany.loginclass;

public class mthodsClass {
    
    
    
    public Boolean checkUserName(String userName){
        
    if(userName.length() < 6 && userName.contains("_")){
        System.out.println("Username successfully captured");
        
    }else{
         System.out.println("Username is not correclty formatted;please");
         System.out.println("ensure that your username contains an");
         System.out.println("undersore and is no more than five characters");
         System.out.println("in lenght");
    }
    
        return true;
    }
}
