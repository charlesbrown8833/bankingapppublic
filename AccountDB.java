/*
Charles Brown
CITC-1311-C01
Semester Project 2
November 24, 2023
*/
package semproject2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AccountDB {
    private static final String FILENAME = "accounts.txt";
    private static final String C_SEP = "\t";
    
    public static ArrayList<Account> getAccount() {
        var accounts = new ArrayList<Account>();
        try (BufferedReader in = new BufferedReader(
                                 new FileReader(FILENAME))) {
            String line = in.readLine();
            while (line != null) {
                String[] columns = line.split(C_SEP);
                String userName = columns[0];
                String ckBal = columns[1];
                String savBal = columns[2];
                
                Account aNew = new Account(userName, Double.parseDouble(ckBal), Double.parseDouble(savBal));
                accounts.add(aNew);
                
                line = in.readLine();
            }
            return accounts;
        }
        catch (FileNotFoundException e) {
            System.out.println(FILENAME + "does not exist.");
            return null;
        }
        catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }
    
    public static void saveAccount(Account account) {
        try(PrintWriter out = new PrintWriter(
                              new BufferedWriter(
                              new FileWriter(FILENAME, true)))){
        out.print(account.getUserName() + C_SEP);
        out.print(account.getCkBal() + C_SEP);
        out.print(account.getSavBal() + C_SEP);
        out.print("\n\n");
        out.close();
        }
        catch (IOException e)
        {
         System.out.println(e);
        }
    }
    
}
