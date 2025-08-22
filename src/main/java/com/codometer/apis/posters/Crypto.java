package com.codometer.apis.posters;

public class Crypto 
{ 
    public Crypto(String coin, String wallet, String network) {
		super();
		this.coin = coin;
		this.wallet = wallet;
		this.network = network;
	}
    
	String coin;
    String wallet;
    String network;
    
	public String getCoin() {
		return coin;
	}
	public void setCoin(String coin) {
		this.coin = coin;
	}
	public String getWallet() {
		return wallet;
	}
	public void setWallet(String wallet) {
		this.wallet = wallet;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
//	@Override
//	public String toString() {
//		return "Crypto [coin=" + coin + ", wallet=" + wallet + ", network=" + network + ", getCoin()=" + getCoin()
//				+ ", getWallet()=" + getWallet() + ", getNetwork()=" + getNetwork() + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
	@Override
	public String toString() {
		return "Crypto [coin=" + coin + ", wallet=" + wallet + ", network=" + network + "]";
	}
  
}
