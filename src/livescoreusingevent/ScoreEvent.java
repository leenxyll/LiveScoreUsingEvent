/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreusingevent;

import java.util.EventObject;

/**
 *
 * @author kotchanika
 */
public class ScoreEvent extends EventObject{
    private String scoreLine;

    public ScoreEvent(Object source, String scoreStr) {
        super(source);
        scoreLine = scoreStr;
    }
    
    public String getScoreLine(){
        return scoreLine;
    }
}
