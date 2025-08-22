package com.codometer.apis.w3c.posters;

/**
 * 
 */
public class FirstMatch 
{
	
	String browserName;
	String browserVersion;
	String platformName;
	boolean acceptInsecureCerts;
	String pageLoadStrategy;
	Proxy proxy;
	boolean setWindowRect;
	Timeouts timeouts;
	boolean strictFileInteractability;
	String unhandledPromptBehavior;
	
	public String getBrowserName() {
		return browserName;
	}
	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}
	public String getBrowserVersion() {
		return browserVersion;
	}
	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}
	public String getPlatformName() {
		return platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
	public boolean isAcceptInsecureCerts() {
		return acceptInsecureCerts;
	}
	public void setAcceptInsecureCerts(boolean acceptInsecureCerts) {
		this.acceptInsecureCerts = acceptInsecureCerts;
	}
	public String getPageLoadStrategy() {
		return pageLoadStrategy;
	}
	public void setPageLoadStrategy(String pageLoadStrategy) {
		this.pageLoadStrategy = pageLoadStrategy;
	}
	public Proxy getProxy() {
		return proxy;
	}
	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}
	public boolean isSetWindowRect() {
		return setWindowRect;
	}
	public void setSetWindowRect(boolean setWindowRect) {
		this.setWindowRect = setWindowRect;
	}
	public Timeouts getTimeouts() {
		return timeouts;
	}
	public void setTimeouts(Timeouts timeouts) {
		this.timeouts = timeouts;
	}
	public boolean isStrictFileInteractability() {
		return strictFileInteractability;
	}
	public void setStrictFileInteractability(boolean strictFileInteractability) {
		this.strictFileInteractability = strictFileInteractability;
	}
	public String getUnhandledPromptBehavior() {
		return unhandledPromptBehavior;
	}
	public void setUnhandledPromptBehavior(String unhandledPromptBehavior) {
		this.unhandledPromptBehavior = unhandledPromptBehavior;
	}
}
