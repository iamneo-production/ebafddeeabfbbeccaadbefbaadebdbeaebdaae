// service/InterfaceClass.java

package service;

public interface InterfaceClass {
    // Abstract method to withdraw an amount
    abstract public double withdrawAmount(double withdrawAmount, double availableBalance);

    // Abstract method to deposit an amount
    abstract public double depositAmount(double depositAmount, double availableBalance);

    // Abstract method to get the account balance
    abstract public double accountBalance(double availableBalance);
}
