/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlantAndAnimalApp;

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
        return "Animal Id-  " + id + "\n" + "Name-  "+ personsName + "\n" + "Location-  " + location + "\n" + "Date-  " + date + "\n" + "Animal-  " + animalSpecies; 
    }
    
    public void update(String additionalDetail){
        this.animalSpecies = additionalDetail;
    }
    
    
    public void update(String personsName, String location, String date, String animalSpecies) {
    super.update(id,personsName, location, date, animalSpecies);
    this.animalSpecies = animalSpecies;
}
}
