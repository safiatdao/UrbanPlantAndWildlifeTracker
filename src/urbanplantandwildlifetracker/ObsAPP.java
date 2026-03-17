/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package urbanplantandwildlifetracker;

/**
 *
 * @author safia
 */
public class ObsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ObservationGUI ObsApp = new ObservationGUI();
        ObsApp.setVisible(true);
        
        //Created a stack to store the observations
       ObservationStack stack = new ObservationStack();
        
        Observation obs;
        
        obs = new PlantObservation(1,"Jack","Dublin", "12/4/2025", "Sunflower");
        stack.push(obs);
        
        obs = new AnimalObservation(2, "Sarah","Dublin", "12/4/2025", "Duck");
        stack.push(obs);
        
        System.out.println(stack.displayStack());
    }
    
}
