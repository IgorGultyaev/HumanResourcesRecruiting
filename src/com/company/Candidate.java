package com.company;

public class Candidate implements Comparable<Candidate> {

    private String name;
    private Gender gender;
    private int relevance;
    private int rating;

    public Candidate(String name, Gender gender, int relevance, int rating) {
        this.name = name;
        this.gender = gender;
        this.relevance = relevance;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return " Пол:" + (this.gender == Gender.FEMALE ? " женский. " : " мужской. ") +
                "Имя: " + name + ". " +
                "Релевантность резюме " + relevance + ". " +
                "Оценка по собеседованю " + rating + ".";
    }


    public int getRelevance() {
        return relevance;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Candidate o) {
        int result = 0;
        if (getRelevance() > o.getRelevance()) {
            result = -1;
        } else if (getRelevance() < o.getRelevance()) {
            result = 1;
        } else if (getRating() < o.getRating()) {
            result = 1;
        } else result = -1;

        return result;
    }
}
