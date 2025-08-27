package org.controller;


 class Score {
    // global field



    static int score;
     // static initialization block
    static {
        
    }

    // getter and setter -> if you are calling getter() in Main class(), it will give u the value
    private static int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "score=" + getScore() +
                '}';
    }
}

