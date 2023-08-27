/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreusingevent;

import java.util.ArrayList;

/**
 *
 * @author kotchanika
 */
public class ScoreSource {
    private String scoreLine;
    private ArrayList<ScoreListener> listeners;
    public ScoreSource(){
        listeners = new ArrayList<>();
    }
    public void addScoreListener(ScoreListener lis){
        listeners.add(lis);
    }
    public void removeScoreListener(ScoreListener lis){
        listeners.remove(lis);
    }
    public void setScoreLine(String scoreStr){
        scoreLine = scoreStr;
        fireScoreEvent(new ScoreEvent(this,scoreStr));
    }
    public void fireScoreEvent(ScoreEvent evt){
        for(ScoreListener lis : listeners){
            lis.scoreChange(evt);
        }
    }
}
