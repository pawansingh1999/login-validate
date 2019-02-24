/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techdyanmics;

/**
 *
 * @author Pawan
 */
public class login {
    
    private String username,password,designation;
   /*void input()
   {
       System.out.println("enter username ");
       
   }*/
    public String validate(String usnm,String pass)
    {
        if(usnm.equals(username)&&pass.equals(password))
            return "SUCESS";
        else
            return "FAILURE";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    
}
