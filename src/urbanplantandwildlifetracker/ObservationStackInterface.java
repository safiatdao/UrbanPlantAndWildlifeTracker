/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package urbanplantandwildlifetracker;

/**
 *
 * @author safia
 */
public interface ObservationStackInterface {
    
    public boolean isEmpty();

    public void push(Observation newItem);

    public Object pop();

    public void emptyStack();

    public String displayStack();
}
