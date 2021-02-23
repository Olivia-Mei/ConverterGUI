/**
 * Converter is the superclass with attribute for input of data type double.
 * Contains default constructor with no parameter that sets input to Double.NaN.
 * Contains overloaded constructor with input parameter that sets input value.
 * Contains get and set methods for input attribute.
 * Defines generic superclass convert method that returns input value.
 * 
 * File: TemperatureConverter.java
 * Course: CMIS 242/6382
 * @author  Olivia-Mei McDowell
 * @version 2020-09 (4.17.0)
 * Date: 2-23-2021
 * IDE: Eclipse
 */

public class Converter {
	
	// superclass attribute that holds input for GUI methods
	private double input;
	
	/** Default constructor with no arguments. */
	public Converter() {
		this.input = Double.NaN;
	}
	
	/** Overloaded constructor with input for parameter. */
	public Converter(double input) {
		this.input = input;
	}
	
	/** Gets input. */
	public double getInput() {
		return input;
	}
	
	/** Sets input. */
	public void setInput (double input) {
		this.input = input;
	}
	
	/** 
	 * Superclass convert method that returns the input value.
	 * Input is set to Double.Nan via default constructor when the instance has no input value.
	 * Gets overridden by subclasses' convert methods
	 * @return input value
	 */
	public double convert() {
		return input;
	}
}