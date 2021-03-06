package com.company;

import java.util.Comparator;

public class CompareName implements Comparator<Candidate> {
    @Override
    public int compare(Candidate o1, Candidate o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
