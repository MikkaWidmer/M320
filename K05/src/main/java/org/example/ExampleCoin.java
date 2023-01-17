package org.example;

public class ExampleCoin extends Coin{
    String specialName;

    protected ExampleCoin(Kurs kurs, KryptoMiner kryptoMiner, Netzwerk netzwerk, Boerse boerse, String specialName) {
        super(kurs, kryptoMiner, netzwerk, boerse);
        this.specialName = specialName;
    }

    @Override
    public void calculateCoinCourse() {

    }

    @Override
    public void changeCoinCourse() {

    }
}
