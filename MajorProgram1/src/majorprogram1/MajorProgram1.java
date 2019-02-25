/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author TaurusMMDC
 */
public class MajorProgram1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course course = new Course();
        Appointment appointment = new Appointment();
        TimeBlock timeBlock = new TimeBlock();
        DaysOfWeek daysOfWeek = DaysOfWeek.WEDNESDAY;
        ArrayList<TimeBlock> testBlock = new ArrayList<>();
        
        course.setCourseName("C");
        course.setLocation("L");
        course.getTimeBlock().add(timeBlock);
        System.out.println(course.toString());
        
        appointment.setDescription("D");
        appointment.setTimeBlock(timeBlock);
        System.out.println(appointment.toString());
        
        timeBlock.setDay(daysOfWeek);
        timeBlock.setStartTime(8);
        timeBlock.setEndTime(6);
        timeBlock.setLocation("L");
        timeBlock.setComments("C");
        System.out.println(timeBlock.toString());
        System.out.println(timeBlock.getFormTimeBlock());
        
        JOptionPane.showMessageDialog(null, course.toString());
        JOptionPane.showMessageDialog(null, appointment.toString());
        JOptionPane.showMessageDialog(null, timeBlock.toString());
    }
    
}
