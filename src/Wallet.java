public class Wallet {

    private int fazCoin = 500;
    private double USDollars = 5;

    public Wallet(){
    }

    public Wallet(int fazCoin, double USDollars){
        this.fazCoin = fazCoin;
        this.USDollars = USDollars;
    }

    public void setFazCoin(int fazCoin){
        this.fazCoin = fazCoin;
    }

    public void setUSDollars(double USDollars){
        this.USDollars = USDollars;
    }

    public int getFazCoin(){
        return fazCoin;
    }
    public double getUSDollars(){
        return USDollars;
    }

}
