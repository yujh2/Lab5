import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    private BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    private double interestRate;
    private double interestEarned;
    private static int numbersOfAccount = 0;
    private Random random = new Random();

    public BankAccount(final String name, final BankAccountType accountCategory) {
        accountType = accountCategory;
        //validation for name
        if (name == null) {
            ownerName = "";
        } else {
            ownerName = name;
        }
        this.accountNumber = random.nextInt();
        numbersOfAccount++;
    }
    public BankAccount() {
        this.accountBalance = 0.0;
        this.accountType = null;
        this.interestEarned = 0.0;
        this.interestEarned = 0.0;
        this.ownerName = "";
        this.accountNumber = random.nextInt();
      //  numbersOfAccount++;
    }


    public static int getNumbersOfAccount() {
        return numbersOfAccount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(final double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(final BankAccountType accountType) {
        this.accountType = accountType;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void setInterestEarned(final double interestEarned) {
        this.interestEarned = interestEarned;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(final String ownerName) {
        this.ownerName = ownerName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(final double interestRate) {
        this.interestRate = interestRate;
    }


    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
