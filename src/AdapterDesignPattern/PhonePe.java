package AdapterDesignPattern;

public class PhonePe {

    private BankAPIAdapter bankAPIAdapter;

    public PhonePe(BankAPIAdapter bankAPIAdapter) {

        this.bankAPIAdapter = new YesbankAPIAdapter();
        this.bankAPIAdapter=new ICICIbankAPIAdapter();
    }

    public void checkBalance(User user)
    {
        double d=bankAPIAdapter.checkBalance(user);

        System.out.println("Balance is::"+d);
    }

        public void transferMoney(User fromUser,User toUser, double amount)
        {
            if(bankAPIAdapter.checkBalance(fromUser)<amount)
            {
                System.out.println("Transaction failed");
            }

            int status=bankAPIAdapter.doTransaction(fromUser,toUser,amount);

            switch (status)
            {
                case 1:
                    System.out.println("Transaction is successful");
                    break;
                case 0:
                    System.out.println("Transaction failed");
                    break;

                default:
                    System.out.println("In progress");
                    break;
            }
            {

            }
        }




}
