/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techdyanmics;

import java.util.Scanner;

/**
 *
 * @author Pawan
 */
public class techdyanmics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        login l=new login();
        l.setUsername("admin");
        l.setPassword("pass123");
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter username ");
        String u1=s.next();
        System.err.println("enter password ");
        String u2=s.next();
        
        String res=l.validate(u1, u2);
        if(res.equals("SUCESS"))
            System.out.println("authentication sucessful");
        else
            System.out.println("authentication failed");
    
    }
    
}
