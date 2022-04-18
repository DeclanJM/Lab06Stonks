import java.util.Random;

public class StonkMarket {

    private double exchangeRate = 1;
    private static final Random RANDY = new Random();

public double getExchangeRate(){
    return exchangeRate;
}

public double changeExchangeRate(){
    exchangeRate += (RANDY.nextDouble() - 0.5);
    return exchangeRate;
}

public double fazCoinToUSD(int fazCoin){
    return (fazCoin * getExchangeRate()) / 100.0;
}

public static void main(String args[]){         //Tester main method
    StonkMarket test = new StonkMarket();
    test.changeExchangeRate();
    System.out.println(test.getExchangeRate());
}

}
