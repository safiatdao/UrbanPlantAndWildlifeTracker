/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlantAndAnimalApp;

import java.util.*;
/**
 *
 * @author safia
 */
public class ObservationStack implements ObservationStackInterface{
    

    
     ArrayList<Observation> observations = new ArrayList<>();
     
    //Check is the stack is empty
        @Override
        public boolean isEmpty(){
        return observations.isEmpty();
    }
        
        //this adds new observatin to the top of the stack
        @Override
        //puts an item onto the top of the stack
        public void push(Observation newItem){
          observations.add(0, newItem);   
    }
        
       //This removes observation from the top
        @Override
    public Object pop() {
        if (!(observations.isEmpty())) {
            return observations.remove(0);
        } else {
            return null;
        }
        
    }

    
    //This shows all the observations in the stack
    @Override
    public String displayStack() {
        String sMessage = "";
        if (observations.isEmpty()) {
            sMessage = sMessage.concat("No Entries FOund");
         } else {
           sMessage = "Sightings: \n\n";
             for (int count = 0; count < observations.size(); count++) {
                sMessage += observations.get(count).displayDetail() + "\n\n\n";
               
            }
        }
        return sMessage;
        
    }
    
 //updates an observation by its id
    public void updateObservation(int id, String personsName, String location, String date, String additionalDetail){
        
        for(Observation obs : observations){
            
            if(obs.getId() == id){
                obs.update(id, personsName, location, date, additionalDetail); 
                return;
            }
        }
    }

    //Deletes an observation in the stack
    public boolean deleteObservation(int id){
        for(int i = 0; i< observations.size(); i++){
             if(observations.get(i).getId() == id){
                 observations.remove(i);
                 return true;
             }
        }
         return false;
        
    }
}

    
    
   
    
    
    
