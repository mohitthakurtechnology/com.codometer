package com.codometer.apis.clients;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import javax.script.*;

/*
 * document javascript operations can be achieved from the nashorn engine
 * of java.
 */
public class JavaScriptOps 
{
	static ScriptEngineManager scriptenginemanager = new ScriptEngineManager();
	static ScriptEngine engine = scriptenginemanager.getEngineByName("graal.js");
	static List<ScriptEngineFactory> engineFactory = scriptenginemanager.getEngineFactories();
	
	public static void open() {		
		
				try {
					Reader reader;
						reader = new FileReader("C:\\Users\\mohit\\git\\com.codometer\\com.codometer\\src\\test\\java\\com\\codometer\\script.txt");
					engine.eval(reader);
				//	engine.eval("window.open(\"https://www.w3schools.com\");");
				} catch (ScriptException e) {
					e.printStackTrace();
				}catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}
	
	public static void getJSEngineName()
	{		
		for(ScriptEngineFactory factoryInstance : engineFactory)
		{
			System.out.println("factory Engine Name => " + factoryInstance.getEngineName());
		}
	}
	
	public static void getJSEngineVersion()
	{
		for(ScriptEngineFactory factoryInstance : engineFactory)
		{
			System.out.println("factory Engine Version => " + factoryInstance.getEngineVersion());
		}
	}
	
    public static void main( String[] args )
    {
    	RestAssured.open();
    	RestAssured.getJSEngineName();
    	RestAssured.getJSEngineVersion();
    }
}
