/*
Charles Brown
CITC-1311-C01
Semester Project 2
November 24, 2023
*/
package semproject2;

public class Account {
    private String userName;
    private double ckBal;
    private double savBal;
    
    public Account() {
        userName = "";
        ckBal = 0.0;
        savBal = 0.0;
    }
    
    public Account(String userName, double ckBal, double savBal) {
        this.userName = userName;
        this.ckBal = ckBal;
        this.savBal = savBal;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void setCkBal(double ckBal) {
        this.ckBal = ckBal;
    }
    
    public void setSavBal(double savBal) {
        this.savBal = savBal;
    }
    
    public String getUserName() {return userName;}
    public double getCkBal() {return ckBal;}
    public double getSavBal() {return savBal;}
    
}
