/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;

/**
 *
 * @author TaurusMMDC
 */
public class Appointment {
    private String description;
    private TimeBlock timeBlock;
    
    public Appointment() {
        description = " ";
        timeBlock = new TimeBlock();
    }
    
    public String toString() {
        return description +"\n"+ timeBlock.toString();
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the timeBlock
     */
    public TimeBlock getTimeBlock() {
        return timeBlock;
    }

    /**
     * @param timeBlock the timeBlock to set
     */
    public void setTimeBlock(TimeBlock timeBlock) {
        this.timeBlock = timeBlock;
    }
    
}
