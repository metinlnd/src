package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {

        ArrayList<Integer>scores= new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,35,47));

        ArrayList<Integer>gradeA=new ArrayList<>(scores);
        gradeA.removeIf(each-> each<90);
        System.out.println(gradeA);


        ArrayList<Integer>gradeB=new ArrayList<>(scores);

        gradeB.removeIf(each->!(each>=80 && each<=89));
        System.out.println(gradeB);
        ArrayList<Integer>gradeC=new ArrayList<>(scores);
        gradeC.removeIf(each->!(each>=70&&each<=79));
        System.out.println(gradeC);
        ArrayList<Integer>gradeD=new ArrayList<>(scores);
        gradeD.removeIf(each->!(each>=60&&each<=69));
        System.out.println(gradeD);

        ArrayList<Integer>gradeF=new ArrayList<>(scores);

        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);
        System.out.println(gradeF);

        System.out.println("gradeA.size="+gradeA.size());


    }
}
