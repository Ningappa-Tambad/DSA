package AdapterDesignPattern;



public class YesBankAPI {

    public long getBalance(String username,String password)
    {
        return 1000;
    }

    public char doTransaction(String fromUserName,String toUserName,String fromUserPassword,double amount)
    {
        return 'y';
    }

    public boolean chnagePin(String username,String password,int currentPin,int newPin)
    {
        return true;
    }


}
