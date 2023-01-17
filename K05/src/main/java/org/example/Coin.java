package org.example;

public abstract class Coin implements CoinCalculator {
    private final Kurs kurs;
    private final KryptoMiner kryptoMiner;
    private final Netzwerk netzwerk;
    private final Boerse boerse;

    protected Coin(Kurs kurs, KryptoMiner kryptoMiner, Netzwerk netzwerk, Boerse boerse) {
        this.kurs = kurs;
        this.kryptoMiner = kryptoMiner;
        this.netzwerk = netzwerk;
        this.boerse = boerse;
    }

    public Kurs getKurs() {
        return kurs;
    }


    public Boerse getBoerse() {
        return boerse;
    }

    public Netzwerk getNetzwerk() {
        return netzwerk;
    }

    public KryptoMiner getKryptoMiner() {
        return kryptoMiner;
    }
}
