package _10to20;

import java.util.HashSet;
import java.util.Set;


/**
 * Le nombre de mois qui commence par un Dimanche, entre le 01/01/1901 et le 31/12/2000
 * currentDay = 0 Lundi 01 Janvier 1900
 */
public class _19_counting_sundays {

    public static void main(String[] args) {

        Set<Integer> m31 = new HashSet<>();
        m31.add(1); m31.add(3); m31.add(5); m31.add(7); m31.add(8); m31.add(10); m31.add(12);

        int currentDay =0;  //lundi
        int nbSundays =0;
        for(int i=1900; i<=2000;i++){

            for(int j =1;j<=12;j++){

                if(m31.contains(j)){  // mois avec 31 jours

                    currentDay= ((currentDay+31) % 7);

                }else if(j ==2){  //fevrier

                    if(i%400==0 || (i%100 !=0 && i%4==0)){
                        currentDay= ((currentDay+29) % 7);
                    }
                }else{ // mois avec 30 jours
                    currentDay= ((currentDay+30) % 7);
                }

                if(currentDay==6 && i>1900){
                    nbSundays++;
                }
            }
        }

        System.out.println(nbSundays);
    }
}
