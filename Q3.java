class Bank{
        int getBalance()
        {
            return 0;
        }
    }
    class BankA extends Bank{
        int getBalance(int balance)
        {
            return balance;
        }
    }
    class BankB extends Bank{
        int getBalance(int balance)
        {
            return balance;
        }
    }
    class BankC extends Bank{
        int getBalance(int balance)
        {
            return balance;
        }
    }
    class question3{
        public static void main(String args[]) {
            BankA a = new BankA();
            BankB b = new BankB();
            BankC c = new BankC();
            System.out.println("$" +a.getBalance(1000));
            System.out.println("$" +b.getBalance(1500));
            System.out.println("$" +c.getBalance(2000));
        }
    }

