import bank.banks.account;

class ab {
    static int c;

    static void sum(int a, int b) {

        c = a + b;
        System.out.println(c);
    }

    static void sum(int a, int b, int c) {

        c = a + b + c;
        System.out.println(c);
    }

    public static void main(String[] args) {
        ab.sum(5, 7);
        ab.sum(6, 8, 8);
        bank.account account1 = new bank.account();
        account1.name = "customer1";

    }
}
