package breadQuizzes;

import java.util.ArrayList;

public class allQuestions {
    ArrayList<questionSet> questionSets;

    public allQuestions(ArrayList<questionSet> qSets) {
        this.questionSets = qSets;
    }

    public int getTotalQuestions() {
        int count = 0;
        for(questionSet qs : questionSets) {
            for (question q : qs.questions) {
                count ++;
            }
        }
        return count;
    }

    public question getQuestion(int index) {
        int count = 0;
        for(questionSet qs : questionSets) {
            for (question q : qs.questions) {
                if (count == index) {
                    return q;
                }
                count ++;
            }
        }
        return null;

    }

    public questionSet getQuestionSet(int index) {
        int count = 0;
        for(questionSet qs : questionSets) {
            if (count == index) {
                return qs;
            }
            count ++;
        }
        return null;

    }


}

