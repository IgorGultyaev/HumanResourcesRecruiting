package com.company;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Set<Candidate> candidates = new TreeSet<>(new CompareName());


        candidates.add(new Candidate("Сулейманова Янина Аркадьевна", Gender.FEMALE, 5, 5));
        candidates.add(new Candidate("Сулейманова Янина Аркадьевна", Gender.FEMALE, 5, 5));
        candidates.add(new Candidate("Гуляева Даниэла Никандровна", Gender.FEMALE, 5, 5));
        candidates.add(new Candidate("Севастьянов Анфим Августович", Gender.MAN, 4, 5));
        candidates.add(new Candidate("Белая Глория Борисовна", Gender.FEMALE, 5, 4));
        candidates.add(new Candidate("Петренко Алиса Афанасьевна", Gender.FEMALE, 5, 5));
        candidates.add(new Candidate("Кулик Инна Валерьевна", Gender.FEMALE, 1, 5));
        candidates.add(new Candidate("Парфенов Евдоким Давыдович", Gender.MAN, 5, 1));
        candidates.add(new Candidate("Артемов Алан Викентьевич", Gender.MAN, 4, 2));
        candidates.add(new Candidate("Колосов Денис Вахтангович", Gender.MAN, 4, 3));
        candidates.add(new Candidate("Козин Альберт Романович", Gender.MAN, 5, 3));
        candidates.add(new Candidate("Козин Альберт Романович", Gender.MAN, 5, 3));
        candidates.add(new Candidate("Колосов Денис Вахтангович", Gender.MAN, 4, 2));

        Set<Candidate> candidatesRating = new TreeSet(candidates);
        candidates.clear();

//        Set<Candidate> candidatesRating = TreeSet(Candidate<candidates> );
//

        for (Candidate candidate : candidatesRating
        ) {
            System.out.println(candidate);
        }

    }

}
