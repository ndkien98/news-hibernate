package buoi14.factory;

public class BankFactory {
    private BankFactory(){

    }
    private final static BankFactory INSTANCE = new BankFactory();

    public static BankFactory getINSTANCE(){
        return INSTANCE;
    }

    Bank getBank(BankType type){
        switch (type) {
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new VietcomBank();
        }
        return null;
    }

}
