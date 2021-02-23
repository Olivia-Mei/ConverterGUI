/**
 * DistanceConverter is a subclass of Converter superclass.
 * Contains default constructor with no parameter that calls the superclass default constructor.
 * Contains overloaded constructor with input for parameter that calls the superclass' overloaded constructor.
 * Contains convert method specific to distance that overrides superclass convert method.
 * 
 * File: TemperatureConverter.java
 * Course: CMIS 242/6382
 * @author  Olivia-Mei McDowell
 * @version 2020-09 (4.17.0)
 * Date: 2-23-2021
 * IDE: Eclipse
 */

public class DistanceConverter extends Converter {

	/** Default constructor with no parameters and calls superclass constructor. */
	public DistanceConverter() {
		super();
	}
	
	/** Overloaded constructor with input for parameter and calls superclass constructor. */
	public DistanceConverter(double input) {
		super(input);
	}
	
	/** 
	 * Converts input distance in miles to kilometers and returns the value.
	 * Overrides Converter.java superclass convert method.
	 * If the instance has no input value, method returns Double.NaN.
	 * Distance conversion formula KM = M * 1.609
	 * @return convertedInput value - result after calculating conversion
	 * @Override
	 */
	public double convert() {
		if(getInput()==Double.NaN) {
			return Double.NaN;
		}
		else {
			double convertedInput = getInput() * 1.609;
			return convertedInput;
		}
	}
}