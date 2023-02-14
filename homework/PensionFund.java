package homework;

import java.util.Objects;

public class PensionFund {

    Enum ThreeType;
    private static final double COEFFICIENT = 0.02;
    private String fundName;
    private TypeOfFund fundState;
    private int creationOfAFund;



    public PensionFund(String fundName, TypeOfFund fundState, int creationOfAFund) {
        this.fundName = fundName;
        this.fundState = fundState;
        this.creationOfAFund = creationOfAFund;
    }

    public double pensionCalculation(int yearWork, int minMoney, int maxMoney) {
        AverageUtils averageUtils = new AverageUtils();
        double answer;
        switch (fundState) {
            case STATE:
                answer = averageUtils.averageState(maxMoney, minMoney) * COEFFICIENT * yearWork;
            break;

            case NOT_STATE:
                answer = averageUtils.averageState(maxMoney, minMoney, 1500) * COEFFICIENT * yearWork;
            break;

            case SCAMMERS:
                answer = 0;
                break;

            default:
                answer = 0;
        }

//        if (fundState == true) {
//            AverageValue averageValue = new AverageValue();
//            result = averageValue.fundStateTrue(maxMoney, minMoney) * COEFFICIENT * yearWork;
//        }
//        if (fundState == false) {
//            AverageValue averageValue = new AverageValue();
//            result = averageValue.fundStateFalse(maxMoney, minMoney, 1500) * COEFFICIENT * yearWork;
//        }
//        return result;

        return answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return creationOfAFund == that.creationOfAFund && Objects.equals(ThreeType, that.ThreeType) && Objects.equals(fundName, that.fundName) && fundState == that.fundState;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ThreeType, fundName, fundState, creationOfAFund);
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "ThreeType=" + ThreeType +
                ", fundName='" + fundName + '\'' +
                ", fundState=" + fundState +
                ", creationOfAFund=" + creationOfAFund +
                '}';
    }
}




