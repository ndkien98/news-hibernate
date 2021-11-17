package buoi14.factory;

public class Main {

    public static void main(String[] args) {
        BankFactory bankFactory = BankFactory.getINSTANCE();
        Bank bank = bankFactory.getBank(BankType.TPBANK);
        System.out.printf(bank.getBankName());
    }


}
