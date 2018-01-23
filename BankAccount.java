/**
 * The purpose of this program is to create a bank account with the following fields.
 * It will also use the following methods and constructors to manipulate the bank 
 * account in a variety of ways. For instance, it will withdraw a certain amount 
 * from an account depending on whether the option chequing or savings was selected.
 *
 * @author Chamera and Kash
 */
public class BankAccount {

  private int pin;         // 4 digit pin number 
  private String name;         // First and last name of the bank account owner
  private double chequingBal;   // The balance of the chequing account 
  private double savingsBal;    // The balance of the savings account 
  private int accountNum;       // Unique account number for the bank account. 
  static double lowestBalanceChequing;
  static double lowestBalanceSavings;
                                // used as the key for searching and sorting 
  private static int actNumGenerator = 123456;    // used to generate the unique                                                   
                                                 // act. Nums  
  private static String adminPassword ="lbpci2017";
  
    /** This method will set the fields of the bank account to the desired numbers, names, and amounts
   * @param pin integer input
   * @param name String input
   * @param chequingBal double input
   * @param savingsBal double input
   */
  public BankAccount (int pin, String name, double chequingBal,double savingsBal)
  {
   
    this.pin=pin;
    this.name=name;
    this.chequingBal= chequingBal;
    this.savingsBal= savingsBal;
    this.accountNum= actNumGenerator;
    actNumGenerator+=1;
    lowestBalanceChequing=0;
    lowestBalanceSavings=0;
  }
  /**This method will get the name of the bank account
   * @return name String input
   */
  public String getName ()
  {
   return name;   
  }
  /**This method will set the name of the bank account to the name that is inputed into the program
   * @param p String input
   */
  public void setName (String p)
  {
   name =p;   
  }
   /**This method will get the pin of the bank account
   * @return pin integer input
   */
  public int getPin ()
  {
   return pin;   
  }
   /**This method will set the pin of the bank account to the desired pin number
   * @param p integer input
   */
  public void setPin (int p)
  {
   pin =p;   
  }
   /*This method will get the account number of a bank account
   * @return accountNum interger input
   */
  public int getAcntNum ()
  {
   return accountNum;   
  }
   /**This method will get the amount in the chequing account
   * @return chequingBal interger input
   */
  public double getChequing ()
  {
   return chequingBal;   
  }
  /**This method will set the balance in the chequing account to the desired value
   * @param p double input
   */
  public void setChequing (double p)
  {
   chequingBal =p;   
  }
   /**This method will get the balance of the savings account of a specific bank account
   * @return savingsBal double input
   */
  public double getSaving ()
  {
   return savingsBal;   
  }
  /**This method will set the balance in the savings account to the desired value
   * @param p double input
   */
  public void setSaving (double p)
  {
   savingsBal =p;   
  }
    /**This method will determine if the administrator password is correct
   * @param n String input
   * @return will return true or false
   */
  public boolean checkAdPassword (String n)
  {
    if(n.equals(adminPassword))
      return true;
    return false;
   }
   /**This method will get the administrator password
   * @return adminPassword String input
   */
  public static String getAdminPassword ()
  {
      return adminPassword;
  }

  
    /**This method will withdraw the desired amount from the chequings account
   * @param amount integer input
   */ 
  public void withdrawChequing (int amount){
    
      this.chequingBal -= amount;
      if(this.chequingBal<lowestBalanceChequing)
      {
          lowestBalanceChequing= this.chequingBal;
      }
    }
  
      /**This method will withdraw the desired amount from the savings account
   * @param amount integer input
   */
    public void withdrawSavings (int amount){
      this.savingsBal -= amount;
      if(this.savingsBal<lowestBalanceSavings)
      {
          lowestBalanceSavings= this.savingsBal;
      }
    
  }
  
   /**This method will transfer the desired amount from one account to another
   * @param cOrS integer input
   * @param other BankAccount input
   * @param cOrS2 integer input
   * @param amount double input
   */
  public void transfer (int cOrS,BankAccount other,int cOrS2, double amount){
    if(cOrS==1)
    {
    if(amount <this.savingsBal){
        this.savingsBal -= amount;
        if(this.savingsBal<lowestBalanceSavings)
      {
          lowestBalanceSavings= this.savingsBal;
      }
        if(cOrS2==1)
        other.savingsBal += amount;
       
        else
            other.chequingBal+=amount;
        
      }
      else 
        throw new RuntimeException ("Insufficient funds. You cannot transfer that amount from your account.");
    }
    else 
    {
        if(amount < this.chequingBal){
        this.chequingBal -= amount;
        if(this.chequingBal<lowestBalanceChequing)
      {
          lowestBalanceChequing= this.chequingBal;
      }
        if(cOrS2==1)
        other.savingsBal += amount;
        else
            other.chequingBal+=amount;
        
      }
      else 
        throw new RuntimeException ("Insufficient funds. You cannot transfer that amount from your account.");
    }

    
  }
   /**This method will deposit the desired amount into the chequings account
   * @param amount integer input
   */
  
  public void depositChequing (int amount){
    if (amount < 0)
      throw new RuntimeException ("Invalid. You cannot deposit a negative amount of money.");
    else if (amount == 0)
      throw new RuntimeException ("Invalid. You cannot deposit $0.00");
    else
      this.chequingBal += amount;
  }
   /**This method will will desposit the desired amount into the savings account
   * @param amount integer input
   */
  public void depositSavings (int amount){
    if (amount < 0)
      throw new RuntimeException ("Invalid. You cannot deposit a negative amount of money.");
    else if (amount == 0)
      throw new RuntimeException ("Invalid. You cannot deposit $0.00");
    else
      this.savingsBal += amount;
  }
  
    
  /**This method will apply interest to a specific bank account
   */
  public void interest ()
  {
      this.chequingBal= this.chequingBal+ (lowestBalanceChequing*0.015);
      this.savingsBal= this.savingsBal+ (lowestBalanceSavings*0.025);
      lowestBalanceChequing=this.chequingBal;
      lowestBalanceSavings= this.savingsBal;
  }

      
    
    
 
    
    
}
