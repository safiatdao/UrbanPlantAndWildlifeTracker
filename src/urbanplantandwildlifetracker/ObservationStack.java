/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urbanplantandwildlifetracker;

import java.util.*;
/**
 *
 * @author safia
 */
public class ObservationStack implements ObservationInterface{
    

    
     ArrayList<Observation> observations = new ArrayList<>();
     
    
        @Override
        public boolean isEmpty(){
        return observations.isEmpty();
    }
        @Override
        //puts an item onto the top of the stack
        public void push(Observation newItem){
          observations.add(0, newItem);   
    }
        
        //removes the item from the top of the stack and returns it
    
        @Override
    public Object pop() {
        if (!(observations.isEmpty())) {
            return observations.remove(0);
        } else {
            return null;
        }
        
    }
      @Override
    // removes all elements from the stack
    public void emptyStack() {
        while (!observations.isEmpty()) {
            pop();
        }
    }
    
      // return a String object that consists of all elements from the stack
    // a FOR loop is used here, but you can use an Iterator instead
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
    
 
    public void updateObservation(int id, String personsName, String location, String date, String additionalDetail){
        
        for(Observation obs : observations){
            
            if(obs.getId() == id){
                obs.setPersonsName(personsName);
                obs.setLocation(location);
                obs.setDate(date);
                obs.setAdditionalDetail(additionalDetail);
                
                return;
            }
        }
    }

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

    
    
   
    
    
    
