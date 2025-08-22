package com.codometer.apis.w3c.posters;

import java.util.List;

/**
 * 
 */
public class Proxy 
{
	String proxyType;
	String proxyAutoconfigUrl;
	String ftpProxy;
	String httpProxy;
	String pageLoadStrategy;
	List<String> noProxy;
	
	public String getProxyType() {
		return proxyType;
	}
	public void setProxyType(String proxyType) {
		this.proxyType = proxyType;
	}
	public String getProxyAutoconfigUrl() {
		return proxyAutoconfigUrl;
	}
	public void setProxyAutoconfigUrl(String proxyAutoconfigUrl) {
		this.proxyAutoconfigUrl = proxyAutoconfigUrl;
	}
	public String getFtpProxy() {
		return ftpProxy;
	}
	public void setFtpProxy(String ftpProxy) {
		this.ftpProxy = ftpProxy;
	}
	public String getHttpProxy() {
		return httpProxy;
	}
	public void setHttpProxy(String httpProxy) {
		this.httpProxy = httpProxy;
	}
	public String getPageLoadStrategy() {
		return pageLoadStrategy;
	}
	public void setPageLoadStrategy(String pageLoadStrategy) {
		this.pageLoadStrategy = pageLoadStrategy;
	}
	public List<String> getNoProxy() {
		return noProxy;
	}
	public void setNoProxy(List<String> noProxy) {
		this.noProxy = noProxy;
	}
	public String getSslProxy() {
		return sslProxy;
	}
	public void setSslProxy(String sslProxy) {
		this.sslProxy = sslProxy;
	}
	public String getSocksProxy() {
		return socksProxy;
	}
	public void setSocksProxy(String socksProxy) {
		this.socksProxy = socksProxy;
	}
	public Integer getSocksVersion() {
		return socksVersion;
	}
	public void setSocksVersion(Integer socksVersion) {
		this.socksVersion = socksVersion;
	}
	public String getUnhandledPromptBehavior() {
		return unhandledPromptBehavior;
	}
	public void setUnhandledPromptBehavior(String unhandledPromptBehavior) {
		this.unhandledPromptBehavior = unhandledPromptBehavior;
	}
	String sslProxy;
	String socksProxy;
	Integer socksVersion;
	String unhandledPromptBehavior;
}
