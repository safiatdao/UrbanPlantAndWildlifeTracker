/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urbanplantandwildlifetracker;

/**
 *
 * @author safia
 */
public class AnimalObservation extends Observation{
    String animalSpecies;

    //Constructor
    public AnimalObservation(int id, String personsName, String location, String date, String animalSpecies) {
        super(id, personsName, location, date);
        this.animalSpecies = animalSpecies;
    }
    
    @Override
    public String displayDetail(){
        return super.displayDetail() + "Plant Id" + id + "Name"+ personsName + "location" + location + "date" + date + "" + animalSpecies; 
    }
}
