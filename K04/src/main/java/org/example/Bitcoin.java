package org.example;

import java.util.List;

public class Bitcoin {
    private final Kurs kurs;
    private final KryptoMiner kryptoMiner;
    private final Netzwerk netzwerk;
    private final Boerse boerse;

    public Bitcoin(KryptoMiner kryptoMiner, Boerse boerse) {
        this.kurs = new Kurs(0,0);
        this.netzwerk = new Netzwerk();
        this.kryptoMiner = kryptoMiner;
        this.boerse = boerse;
    }
}
