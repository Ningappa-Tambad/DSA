package GitBasics;

public class SIPCalculator {
    public static double calculate(int amount,int noofsips,double rate,int time)
    {

        double monthlyRate = rate / 12 / 100;

        // Calculate total number of periods
        int totalPeriods = noofsips * time;

        // Calculate future value of the investment
        double futureValue1 = amount * ((Math.pow(1 + monthlyRate, totalPeriods) - 1) / monthlyRate);

        return futureValue1;

    }
}
