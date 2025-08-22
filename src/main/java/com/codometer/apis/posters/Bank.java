package com.codometer.apis.posters;

public class Bank 
{ 
	
    public Bank(String cardExpire, String cardNumber, String cardType, String currency, String iban) {
		super();
		this.cardExpire = cardExpire;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.currency = currency;
		this.iban = iban;
	}
	String cardExpire;
    String cardNumber;
    String cardType;
    String currency;
    String iban;
    
	public String getCardExpire() {
		return cardExpire;
	}
	public void setCardExpire(String cardExpire) {
		this.cardExpire = cardExpire;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
//	@Override
//	public String toString() {
//		return "Bank [cardExpire=" + cardExpire + ", cardNumber=" + cardNumber + ", cardType=" + cardType
//				+ ", currency=" + currency + ", iban=" + iban + ", getCardExpire()=" + getCardExpire()
//				+ ", getCardNumber()=" + getCardNumber() + ", getCardType()=" + getCardType() + ", getCurrency()="
//				+ getCurrency() + ", getIban()=" + getIban() + ", getClass()=" + getClass() + ", hashCode()="
//				+ hashCode() + ", toString()=" + super.toString() + "]";
//	}
	@Override
	public String toString() {
		return "Bank [cardExpire=" + cardExpire + ", cardNumber=" + cardNumber + ", cardType=" + cardType
				+ ", currency=" + currency + ", iban=" + iban + "]";
	}
}