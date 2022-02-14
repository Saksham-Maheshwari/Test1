import java.util.Scanner;

    class Customer{
        String name,address;
        int age;
    }

    class Account{
        String accType,branchType;
    }

    class RBI{
        int withLimit,n;
        double A,P,r;
        float t;
        long avg,tot,mb;

        int setWithdrawalLimit() {
            Scanner inp = new Scanner(System.in);
            String actype=inp.nextLine();
            String brtype=inp.nextLine();
            if(actype=="SAVINGS" && brtype=="METROPOLITAN") {
                withLimit = 5000;
            }else {
                withLimit = 4000;
            }
            return withLimit;
        }

        double InterestRate() {
            A=(P+r)/n*t;
            return A;
        }

        long setMAB() {
            mb=(avg*tot)/31;
            return mb;
        }
    }

    class SBI extends RBI{
        double setInterestRate() {
            A=P*(1+r/n)+n*t;
            return A;
        }
        long setMAB() {
            mb=(avg+tot)/30;
            return mb;
        }
    }

    class ICICI extends RBI{
        double InterestRate() {
            A=(P*r)/n+t;
            return A;
        }

        int setWithdrawalLimit() {
            withLimit=7000;
            return withLimit;
        }
    }

    class question2 {
        public static void main(String args[]) {
            SBI sbi = new SBI();
            ICICI icici = new ICICI();
            sbi.P=12.33;
            sbi.r=8.2;
            sbi.n=6;
            sbi.t=4;
            Double sbiInt=sbi.InterestRate();
            System.out.println("SBI interest rate is:"+sbiInt);
            int iciciWL= icici.setWithdrawalLimit();
            System.out.println("ICICI withdraw limit is:"+iciciWL);
        }
    }

