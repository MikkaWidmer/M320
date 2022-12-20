package org.example;

import java.util.List;

public class Netzwerk {
    private List<KryptoMiner> miners;
    private int timeToMine;
    private String name;

    public Netzwerk(List<KryptoMiner> miners, int timeToMine, String name) {
        this.miners = miners;
        this.timeToMine = timeToMine;
        this.name = name;
    }
}
