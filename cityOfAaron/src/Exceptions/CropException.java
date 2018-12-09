/*
 * exceptions class for the exceptions package
 * CIT 260
 * Fall 2018
 * Team Members: Megan Hendrickson, McKell Painter, Wladamir Canar
 */
package Exceptions;


public class CropException extends Exception
{
    //Default constructor
    //Purpose: Initializeds data members to default values
    //Parameters: none
    //Returns: none
    public CropException(){}
    
    //Parameterized constructor
    //Purpose: Initializes data members to value passed as parameter
    //Parameters: A string containing the error message
    //Returns: none
    public CropException(String string)
    {
        super(string);
    }
}
