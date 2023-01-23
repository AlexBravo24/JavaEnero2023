package com;

public class Procesador {

    private String marca;
    private String modelo;
    private int cores;
    private int threads;
    private Double freq;
    
    public Procesador() {}

    public Procesador(String marca, String modelo, int cores, int threads, Double freq) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.cores = cores;
	this.threads = threads;
	this.freq = freq;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public Double getFreq() {
        return freq;
    }

    public void setFreq(Double freq) {
        this.freq = freq;
    }

    @Override
    public String toString() {
	return "Procesador [" + (marca != null ? "marca=" + marca + ", " : "")
		+ (modelo != null ? "modelo=" + modelo + ", " : "") + "cores=" + cores + ", threads=" + threads + ", "
		+ (freq != null ? "freq=" + freq : "") + "]";
    }

    
}
