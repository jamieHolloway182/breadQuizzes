package breadQuizzes;

import java.awt.Font;
import java.awt.Graphics;

public class question {
    private String question;
    private String ans1;
    private String ans2;
    int questionType;
    int weighting;

    boolean clicked = false;
    boolean painted = false;
    boolean spectrumQ;
    boolean answer;


    int[] coord1 = {160,190};
    int[] coord2 = {160,240};
    int size = 20;

    public question(String q, String a1, String a2, int qT, boolean sQ) {
        this.question = q;
        this.ans1 = a1;
        this.ans2 = a2;
        this.questionType = qT;
        this.spectrumQ = sQ;
    }
    public question(String q, String a1, String a2, int qT, boolean sQ, int weight ) {
        this.question = q;
        this.ans1 = a1;
        this.ans2 = a2;
        this.questionType = qT;
        this.spectrumQ = sQ;
        this.weighting = weight;
    }


    public void paint(Graphics g) {
        Font a = new Font("Times New Roman",Font.BOLD, 35) ;
        g.setFont(a);
        //g.drawString(questionType,30,70);
        Font b = new Font("Times New Roman",Font.BOLD, 18) ;
        g.setFont(b);
        g.drawString(question, 55, 130);
        g.drawRect(coord1[0]-size/2, coord1[1]- size/2, 20, 20);
        g.drawString(ans1, coord1[0] + 25,coord1[1]+5);
        g.drawRect(coord2[0]-size/2, coord2[1]- size/2, 20, 20);
        g.drawString(ans2, coord2[0] + 25,coord2[1]+5);
    }

}
