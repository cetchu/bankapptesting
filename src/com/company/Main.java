package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("hello world");
	System.out.println("to test check");

        public class bankStuff{
            String name;
            String deposit;
            int passcode;
            int depositAmount;
            int withdrawlAmount;


            public bankStuff(String name,String deposit, int passcode, int depositAmount,
                             int withdrawlAmount){
                Scanner input = new Scanner(System.in);
                name = input.nextLine();

                Scanner pass = new Scanner(System.in);
                passcode = pass.nextInt();

                Scanner bankName = new Scanner(System.in);
                deposit = bankName.nextLine();

                Scanner depositA = new Scanner(System.in);
                depositAmount = depositA.nextInt();

                Scanner withdrawlA = new Scanner(System.in);
                withdrawlAmount = withdrawlA.nextInt();

            }
            public bankStuff() {
                // TODO Auto-generated constructor stub
            }
            public String getName(String name) {
                return name;
            }
            public int getPassCode(int passcode) {
                return passcode;
            }
            public String getDpstAcctName(String deposit) {
                return deposit;
            }
            public int getDepositNum(int depositAmount) {
                return depositAmount;
            }
            public int getWithdrawlAmount(int withdrawlAmount) {
                return withdrawlAmount;
            }

            public double setInterestRate() {
                double p,r,t, interestRate;
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the principal : ");
                p = scan.nextInt();
                System.out.println("Enter the rate of interest: ");
                r = scan.nextInt();
                System.out.println("Enter the time period : ");
                t = scan.nextInt();
                interestRate = (p * r * t) / 100;
                return interestRate;
            }

        }
    }
}
