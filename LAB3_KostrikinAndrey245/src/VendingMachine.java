public class VendingMachine {
    private int colaCount;
    private int chipsCount;
    private double moneyCollected;

    public VendingMachine(int cola, int chips) {
        this.colaCount = cola;
        this.chipsCount = chips;
        this.moneyCollected = 0;
    }

    public boolean buyCola(double money) {
        if (colaCount > 0 && money >= 2.0) {
            colaCount--;
            moneyCollected += 2.0;
            return true;
        }
        return false;
    }

    public boolean buyChips(double money) {
        if (chipsCount > 0 && money >= 1.5) {
            chipsCount--;
            moneyCollected += 1.5;
            return true;
        }
        return false;
    }

    public int getColaCount() { return colaCount; }
    public int getChipsCount() { return chipsCount; }
    public double getMoneyCollected() { return moneyCollected; }
}