package org.example;

public class KryptoMiner {
    private String GPU;
    private String CPU;
    private int hashRate;

    public KryptoMiner(String gpu, String cpu, int hashRate) {
        GPU = gpu;
        CPU = cpu;
        this.hashRate = hashRate;
    }
}
