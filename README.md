# Converter GUI

## Introduction
This application implements a converter GUI that has 3 buttons (“Distance Converter,” “Temperature Converter,” and “Exit”), which execute corresponding unit conversion functionality upon user button click.

+ Converter is the superclass that contains the attribute and methods that are foundation of converter objects.
    * Contains attribute for input of data type double.
    * Contains default constructor with no parameter that sets input to Double.NaN.
    * Contains overloaded constructor with input parameter that sets input value.
    * Contains get and set methods for input attribute.
    * Defines generic superclass convert method that returns input value.

+ DistanceConverter is a subclass of Converter superclass.
    * Contains default constructor with no parameter that calls the superclass default constructor.
    * Contains overloaded constructor with input for parameter that calls the superclass' overloaded constructor.
    * Contains convert method specific to distance that overrides superclass convert method.

+ TemperatureConverter is a subclass of Converter superclass.
    * Contains default constructor with no parameter that calls the superclass default constructor.
    * Contains overloaded constructor with input for parameter that calls the superclass' overloaded constructor.
    * Contains convert method specific to temperature that overrides superclass convert method.



+ GUIConverter class contains a method that constructs and shows a GUI, as well as event handler methods that react to user's interaction with GUI.
    * Main method creates instance of GUIConverter and calls constructAndShowGUI method.

---
## Technologies
Java  version 2020-09 (4.17.0)

---
## Install & Setup
To run this project, install the following files locally, as you would normally install a new Java project.
1. Converter.java
2. DistanceConverter.java
3. TemperatureConverter.java
4. ConverterGUI.java

---
## Guidelines
1. Install the four files (listed in install section) locally
2. Compile all files from the command line
3. Run ConverterGUI.java from the command line and proceed as user, following on-screen prompts

---
## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

---
## To-Do
1. Restructure loop that handles combination of null user input and (cancel button or exit button).

---
## Project Status
Active development paused

