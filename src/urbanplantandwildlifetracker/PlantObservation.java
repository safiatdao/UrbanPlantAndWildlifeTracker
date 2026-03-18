/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urbanplantandwildlifetracker;

/**
 *
 * @author safia
 */
public class PlantObservation extends Observation {
    
    private String TypeOfPlant;
    

    public PlantObservation(int id, String personsName, String location, String date, String TypeOfPlant ) {
        super(id, personsName, location, date);
        this.TypeOfPlant = TypeOfPlant;
    }
    
    
    public void update(String additionalDetail){
        this.TypeOfPlant = additionalDetail;
    }
    
    @Override
     public String displayDetail(){
        return "Plant Id-  "+ id + "\n" + "Name-  "+ personsName + "\n" + "Location-  " + location + "\n" + "Date-  " + date + "\n" + "Plant-  " + TypeOfPlant; 
     }
  }
