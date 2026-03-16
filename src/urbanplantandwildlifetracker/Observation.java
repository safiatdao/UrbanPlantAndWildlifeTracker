/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urbanplantandwildlifetracker;

/**
 *
 * @author safia
 */
public class Observation {
    protected int id;
    protected String personsName;
    protected String location;
    protected String date;
    
     public Observation(int id, String personsName, String location, String date) {
        this.id = id;
        this.personsName = personsName;
        this.location = location;
        this.date = date;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonsName() {
        return personsName;
    }

    public void setPersonsName(String personsName) {
        this.personsName = personsName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String displayDetail(){
        return id + "" + personsName + "" + location + "" + date;  
    }
    
}
