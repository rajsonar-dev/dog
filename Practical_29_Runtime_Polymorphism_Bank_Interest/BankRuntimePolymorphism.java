class Bank {
    double getInterestRate() { return 0; }
}
class SBI extends Bank {
    @Override double getInterestRate() { return 6.5; }
}
class HDFC extends Bank {
    @Override double getInterestRate() { return 7.0; }
}
class ICICI extends Bank {
    @Override double getInterestRate() { return 7.2; }
}
public class BankRuntimePolymorphism {
    public static void main(String[] args) {
        Bank b;
        b = new SBI(); System.out.println("SBI rate: " + b.getInterestRate() + "%");
        b = new HDFC(); System.out.println("HDFC rate: " + b.getInterestRate() + "%");
        b = new ICICI(); System.out.println("ICICI rate: " + b.getInterestRate() + "%");
    }
}
