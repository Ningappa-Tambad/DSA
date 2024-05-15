package AdapterDesignPattern;

public class YesbankAPIAdapter implements BankAPIAdapter{


    private YesBankAPI yesBankAPI=new YesBankAPI();
    @Override
    public double checkBalance(User user) {
       long balance= yesBankAPI.getBalance(user.getUserName(),user.getPassword());
       return (double)balance;

    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {

        char result=yesBankAPI.doTransaction(fromUser.getUserName(),toUser.getUserName(),fromUser.getPassword(),amount);

        if(result=='y')
        {
            return 1;
        } else if (result=='n')
        {
           return 0;
        }
        else
        {
            return 2;
        }
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return false;
    }
}
