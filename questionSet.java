package breadQuizzes;

import java.util.ArrayList;

public class questionSet {
    ArrayList<question> questions;
    boolean answeredYes = false;
    int numAnsweredYes;

    public questionSet(ArrayList<question> questions) {
        this.questions = questions;
    }
}
