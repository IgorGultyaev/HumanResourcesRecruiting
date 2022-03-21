package com.company;

import java.util.Comparator;

public class HRRecruitingComparator implements Comparator<Candidate> {

    @Override
    public int compare(Candidate o1, Candidate o2) {

        if (o1.getRelevance() > o2.getRelevance()) {
            return  -1;
        } else if (o1.getRelevance() < o2.getRelevance()) {
            return  1;
        } else if (o1.getRating() > o2.getRating()) {
            return  -1;
        } else if  (o1.getRating() < o2.getRating()){
            return  -1;
        } else{
            return  o1.toString().compareTo(o2.toString());
        }

    }
}