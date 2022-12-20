package org.example;

public class Bitcoin {
    private final Kurs kurs;
    private final KryptoMiner kryptoMiner;
    private final Netzwerk netzwerk;
    private final Boerse boerse;

    public Bitcoin(Kurs kurs, KryptoMiner kryptoMiner, Netzwerk netzwerk, Boerse boerse) {
        this.kurs = kurs;
        this.kryptoMiner = kryptoMiner;
        this.netzwerk = netzwerk;
        this.boerse = boerse;
    }
}
