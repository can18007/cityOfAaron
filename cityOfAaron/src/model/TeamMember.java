/*
 * The TeamMember enumeration class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 * Team members: Megan Hendrickson, McKell Painter, Wladimir Canar
 */
package model;


public enum TeamMember {
   //the members of the enumeration
    MEGAN("Megan","Corn Queen"),
    MCKELL("McKell","Potato Princess"),
    WLADIMIR("Wladimir","Tourist General");

    //data members
    private String name;
    private String title;

    TeamMember(String_name, String_title)
    {
        name = _name;
        title = _title;
    }

    public String getName()
    {
        return name;
    }

    public String getTitle()
    {
        return title;
    }
}
