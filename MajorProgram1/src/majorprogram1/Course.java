/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;

import java.util.ArrayList;

/**
 *
 * @author TaurusMMDC
 */
public class Course {
    private String courseName;
    private String location;
    private ArrayList<TimeBlock> timeBlock;
    
    public Course() {
        String courseName = " ";
        String location = " ";
        timeBlock = new ArrayList<>();
    }
    public String toString() {
        String k = getCourseName() +"\n"+ getLocation() +"\n";
        for(TimeBlock e: getTimeBlock()) {
            k += e.toString() + "\n";
        }
        return k;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the TB
     */
    public ArrayList<TimeBlock> getTimeBlock(){
        return timeBlock;
    }

    /**
     * @param timeBlock    
     */
    public void setTimeBlock(ArrayList<TimeBlock> timeBlock) {
        this.timeBlock = timeBlock;
    }
}
