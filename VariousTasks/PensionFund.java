package VariousTasks;

public class PensionFund {

    private static final double COEFFICIENT = 0.02;
    private String fundName;
    private boolean fundState;
    private static final int creationOfAFund = 25;
    private double result;


    public PensionFund(String fundName, boolean fundState) {
        this.fundName = fundName;
        this.fundState = fundState;
    }

    public double pensionCalculation(int yearWork, int minMoney, int maxMoney) {

        if (fundState == true) {
            AverageValue averageValue = new AverageValue();
            result = averageValue.fundStateTrue(maxMoney, minMoney) * COEFFICIENT * yearWork;
        }
        if (fundState == false) {
            AverageValue averageValue = new AverageValue();
            result = averageValue.fundStateFalse(maxMoney, minMoney, 1500) * COEFFICIENT * yearWork;
        }
        return result;

    }


}




