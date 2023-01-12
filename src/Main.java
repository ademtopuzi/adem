public class Main {
    public static void main(String[] args) {

        Bank bank= new Bank("Bkt",1202,1202,10000,0,5);
        bank.commision(500);
        bank.commision(100);
        bank.commision(80);
    }
}