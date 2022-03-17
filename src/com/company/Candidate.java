package com.company;

public class Candidate {
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
    //String securityAnswer = man.getAge() >= 18 ? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!";

    public int getRelevance() {
        return relevance;
    }

    public int getRating() {
        return rating;
    }
}
