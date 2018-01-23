/**
 *  This program contains all the methods used to manipulate a bank account. For instance, it contains methods such as
 * withdrawal, which will determine whether money is required to be withdrawn from the chequing or savings account, and will also
 * determine if the account has sufficient funds as well. This program will also check for the accuracy of the information
 * inputted from the user as well. For instance, it will check if the amount required to be withdrawn is less or equal to 0 as well. 
 * 
 *
 * @author Chamera and Kash
 */
public class ATM {
    static BankAccount [] accountInfo = new BankAccount[100]; 
    private static int i=0;
    private static int userAccount=0;
    
  /**This method will create an account with the following information
   * @param pin integer input
   * @param name String input
   * @param chequingBal double input
   * @param savingsBal double input
   */
     public static void createAcnt(int pin, String name, double chequingBal,double savingsBal)
     { 
         if(i==(accountInfo.length))
         {
             BankAccount [] temp;
             temp = new BankAccount[accountInfo.length*2];
             for(int j=0;j<i;j++)
             {
                 temp[j]=accountInfo[j];
             }
             accountInfo=temp;
         }
      accountInfo[i]= new BankAccount(pin,name,chequingBal, savingsBal);
      
      i+=1;
     }
 /**This method will determine whether a bank account with a certain account number exists
   * @param accountNum integer input
   * @return will return true or false, after it determines whether or not the account exists
   */
     public static boolean accountExist(int accountNum)
     {
         for(int j=0;j<(i);j++)
         {
             if(accountInfo[j].getAcntNum()==accountNum)
                 return true;
         }
        return false;
         
     }
 /** This method will determine if there is enough money to be transfered from one account to the other
   * @param cOrS integer input
   * @param amount double input
   * @return will return true or false after it determines if there are sufficient funds
   */
     public static boolean sufficientAmountTransfer(int cOrS,double amount)
     {
        if(cOrS==2)
        {
            if(accountInfo[userAccount].getChequing()>amount)
            {
                return true;
            }
        }
        else if(cOrS==1)
        {
          if(accountInfo[userAccount].getSaving()>amount)
            {
                return true;
            }  
        }
        
        return false;
         
     }
 /**This method will determine if there is a sufficient amount of money in a certain bank account
   * @param accountNum integer input
   * @param cOrS integer input
   * @param amount double input
   * @return will return true or false after it determines whether there is enough money
   */
     public static boolean sufficientAmount(int accountNum,int cOrS,double amount)
     {
        for(int j=0;j<(i);j++)
         {
             if(accountInfo[j].getAcntNum()==accountNum)
             {
                 if(cOrS==2)
                 {
                     if(accountInfo[j].getSaving()>amount)
                         return true;
                 }
                 else if(cOrS==1)
                     {
                     if(accountInfo[j].getChequing()>amount)
                         return true;
                 }
             }
                 
                 
             
         }
        return false;
         
     }
     public static double round (double a)
     {
      return Math.round(a*100.0)/100.0;  
     }
      /** This method will search for an account, when a specific account number is given
   * @param accountNum integer input
   * @return will return all the information about the account as a String
   */
     public static String searching (int accountNum)
     {
         for(int j=0;j<(i);j++)
         {
             if(accountInfo[j].getAcntNum()==accountNum)
                 return " Name: "+accountInfo[j].getName()+" Chequing Balance: "+round(accountInfo[j].getChequing())+"  Savings Balance : "+round(accountInfo[j].getSaving());
             
         }
         return "";
         }
  /** 
    * This method will transfer money from one account to another after it is given all the necessary information
    *@param accountNum integer input
    * @param cOrS inteRger input
    * @param trnsfrAcntNum integer input
    * @param cOrS2 integer input
    * @param amount double input
    */ 
    public static void transfer (int accountNum, int cOrS, int trnsfrAcntNum, int cOrS2, double amount)
    {
        int w = 0;
        int k=0;
        for(int j=0;j<(i);j++)
         {
             if(accountInfo[j].getAcntNum()==accountNum)
             {
                 w=j;
                 break;
             }
         }
        for(int j=0;j<(i);j++)
         {
             if(accountInfo[j].getAcntNum()==trnsfrAcntNum)
             {
                 k=j;
                 break;
             }
         }
        if(cOrS==1)
        {
            accountInfo[w].setChequing(accountInfo[w].getChequing()-amount);
            if(accountInfo[w].getChequing()<accountInfo[w].lowestBalanceChequing)
      {
          accountInfo[w].lowestBalanceChequing= accountInfo[w].getChequing();
      }
        }
        else if(cOrS==2)
        {
           accountInfo[w].setSaving(accountInfo[w].getSaving()-amount); 
            if(accountInfo[w].getSaving()<accountInfo[w].lowestBalanceSavings)
      {
          accountInfo[w].lowestBalanceSavings= accountInfo[w].getSaving();
      }
        }
        if(cOrS2==1)
        {
            accountInfo[k].setChequing(accountInfo[k].getChequing()+amount);
        }
        else  if(cOrS2==2)
           accountInfo[k].setSaving(accountInfo[k].getSaving()+amount); 
    }
      
  /**
   * This method will close the account of the account number given
   * @param accountNum integer input
   */
    public static void closeAnAccount (int accountNum)
    {
        BankAccount [] temp= new BankAccount [accountInfo.length-1];
        for(int j=0;j<(i);j++)
         {
             if(accountInfo[j].getAcntNum()==accountNum)
             {
                 int l=0;
                 for( l=0;l<j;l++)
                 {
                     temp[l]=accountInfo[l];
                 }
                 for(int k=(j+1);k<accountInfo.length;k++,l++)
                 {
                   temp[l]=accountInfo[k];
                     
                 }
                 
             break;
             }
             
             
                 
                 
         }
        i=i-1;
        accountInfo= temp;
         }
 /**
   * This method will determine whether the account number matches with the pin number given
   * @param pin integer input
   * @param accountNum integer input
   * @return will return true or false after it determines whether or not the two pieces of information matches
   */
    public static boolean userPassword (int accountNum, int pin)
    {
        for(int j=0;j<(i);j++)
         {
             if(accountInfo[j].getAcntNum()==accountNum)
             {
                 if(accountInfo[j].getPin()==pin)
                 {
                     userAccount=j;
                     return true;
                 }
             }
         }
         
        return false;
    }
    /** This method will withdraw money from the savings account
   * @param withdrawlAmount integer input
   */
    public static void withdrawlSavings(int withdrawlAmount)
    {
       accountInfo[userAccount].withdrawSavings(withdrawlAmount);
    }
 /** This method will withdraw money from the chequing account
   * @param withdrawlAmount integer input
   */
    public static void withdrawlChequing(int withdrawlAmount)
    {
       accountInfo[userAccount].withdrawChequing(withdrawlAmount);
    }
 /**This method will determine if there is enough money to withdraw from the chequing account
   * @param withdrawAmount integer input
   * @return will return true or false 
   */
    public static boolean sufficientFundsChequing(int withdrawAmount)
    {
        if(accountInfo[userAccount].getChequing()>=withdrawAmount)
        {
            return true;
        }
        return false;
    }
    /** This method will determine if there is enough money to withdraw from the savings account
   * @param withdrawAmount integer input
   * @return will return true or false
   */
    public static boolean sufficientFundsSavings(int withdrawAmount)
    {
        if(accountInfo[userAccount].getSaving()>=withdrawAmount)
        {
            return true;
        }
        return false;
    }

 /** This method will deposit money into the savings account
   * @param depositAmount integer input
   */   
    public static void depositSavings(int depositAmount)
    {
       accountInfo[userAccount].depositSavings(depositAmount);
    }
 /** This method will deposit money into the chequing account
   * @param depositAmount integer input
   */
    public static void depositChequing(int depositAmount)
    {
       accountInfo[userAccount].depositChequing(depositAmount);
    }
 /** This method will transfer money from a specific account into another
   * @param cOrS integer input
   * @param accountNum integer input
   * @param cOrS2 integer input
   * @param amount double input
   */
    public static void transfer(int cOrS,int accountNum, int cOrS2, double amount )
    {
        int j=0;
        for(j=0;j<(i);j++)
         {
             if(accountInfo[j].getAcntNum()==accountNum)
             {
                 break;
             }
         }
        accountInfo[userAccount].transfer(cOrS,accountInfo[j],cOrS2,amount);
        }
    /** This method will determine the amount of interest charges that will apply to a specific bank account
   * @param accountNum integer input
   */
    public static void interestApply (int accountNum) 
                {
                 int j=0;
            for(j=0;j<(i);j++)
             {
                 if(accountInfo[j].getAcntNum()==accountNum)
                 {
                     break;
                 }
             }
            accountInfo[userAccount].interest();    
                }
    }


    
    
    

