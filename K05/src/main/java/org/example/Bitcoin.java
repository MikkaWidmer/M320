package org.example;

public class Bitcoin extends Coin {

    protected Bitcoin(Kurs kurs, KryptoMiner kryptoMiner, Netzwerk netzwerk, Boerse boerse, int number) {
        super(kurs, kryptoMiner, netzwerk, boerse);
        number = 2;
    }

    @Override
    public void calculateCoinCourse() {
        //some logics
    }

    @Override
    public void changeCoinCourse() {

    }
}
