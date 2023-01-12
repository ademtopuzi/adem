public class Bank extends ATM{

    private String name ;
    private int employeNumber;
    private int  clientNumber;
    private double totalCapital;
    private double totalCommision;
    private double commisionRate;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public int getEmployeNumber() {
        return employeNumber;
    }

    public void setEmployeNumber(int employeNumber) {
        this.employeNumber = employeNumber;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public double getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(double totalCapital) {
        this.totalCapital = totalCapital;
    }

    public double getTotalCommision() {
        return totalCommision;
    }

    public void setTotalCommision(double totalCommision) {
        this.totalCommision = totalCommision;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    public Bank(String name, int employeNumber, int clientNumber, double totalCapital, double totalCommision, double commisionRate) {
        this.name = name;
        this.employeNumber = employeNumber;
        this.clientNumber = clientNumber;
        this.totalCapital = totalCapital;
        this.totalCommision = totalCommision;
        this.commisionRate = commisionRate;
    }

    @Override
    public double withdraw(double sasi) {
        System.out.println("Gjendja Totale e llogarise eshte "+this.totalCapital);
        return this.totalCapital-=sasi;


    }

    @Override
    public double commision(double terheqje) {
        withdraw(terheqje);
        System.out.println("Gjendja e mbetur eshte "+this.totalCapital);
        if (terheqje<100) {
            this.commisionRate = 0.02;
        }else if (terheqje<500) {
            this.commisionRate = 0.04;
        }else {
            this.commisionRate = 0.06;
        }
        System.out.println("Comisioni i mbajtur eshte " + this.commisionRate*terheqje);
        this.totalCommision += (this.commisionRate*terheqje);
        System.out.println("Comisioni i mbajtur deri me tani eshte " + this.totalCommision);

        return totalCommision;




    }

}
