/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescoreusingevent;

import java.util.Scanner;

/**
 *
 * @author kotchanika
 */
public class LiveScoreUsingEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource src = new ScoreSource();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        Subscriber sub3 = new Subscriber();
        src.addScoreListener(sub1);
        src.addScoreListener(sub2);
        src.addScoreListener(sub3);
        String scoreLine;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score ");
        scoreLine = sc.nextLine();
        while(!scoreLine.equals("")){
            src.setScoreLine(scoreLine);
            System.out.print("Enter Score ");
            scoreLine = sc.nextLine();
        }
    }
    
}
