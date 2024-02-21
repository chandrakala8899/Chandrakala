package Interest;

public class SbiService extends Schedule{
        public double calculateAmt(int principalAmt){
            double totalAmt=0;

            if(principalAmt<=500000){
                int duration =3;
                double intrest = principalAmt*duration/12*0.024;
                System.out.println("Below 500000");
                return intrest;
            }if (principalAmt>500001 && principalAmt<=1000000){
                int duration =3;
                double intrest = principalAmt*duration/12*0.015;
                System.out.println("Above 500001");
                return intrest;
            }if (principalAmt>=1000001){
                int duration =3;
                double intrest = principalAmt*duration/12*2;
                System.out.println("Above 100001 ");
                return intrest;

            }

            return totalAmt+principalAmt;
        }
        @Override
        public double calculateloanSchedule(double loanAmount, double annualInterestRate, int loanTenureYears) {
            return super.calculateloanSchedule(loanAmount, annualInterestRate, loanTenureYears);
        }
    }

