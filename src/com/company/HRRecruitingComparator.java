package com.company;

import java.util.Comparator;

public class HRRecruitingComparator implements Comparator<Candidate> {

 @Override
 public int compare(Candidate o1, Candidate o2) {
  int result = 0;
  if (o1.getRelevance() > o2.getRelevance()) {
   result = -1;
  } else if (o1.getRelevance() < o2.getRelevance()){
   result = 1;
  } else if (o1.getRating() < o2.getRating()) {
   result = 1;
  } else result = - 1;
  return result;
 }
}