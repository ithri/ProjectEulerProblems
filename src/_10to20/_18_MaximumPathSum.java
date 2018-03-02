package _10to20;

import util.EulerProjectProblemAbstract;

import java.util.ArrayList;
import java.util.List;

public class _18_MaximumPathSum extends EulerProjectProblemAbstract{

    public static void main(String[] args) {
        String fileName = "C://Users/ASUS/IdeaProjects/projectEulerProblems/src/files/p18.txt";

        List<String> list = getListFromFile(fileName);

        List<Integer[]> levels = new ArrayList<>();
        for(String s : list){
            String[] str =  s.split(",");
            Integer[] i = new Integer[str.length];
            for(int k=0;k< str.length;k++){
                i[k] = Integer.parseInt(str[k]);
            }
            levels.add(i);
        }

//        for(Integer[] l : levels){
//            for(int i=0;i<l.length;i++){
//                System.out.print(l[i]+ " | ");
//            }
//            System.out.println();
//        }

        int n = levels.size()-2;
        for(int k=0;k<n;k++){
            int i = n-k;
            for(int j=0; j< levels.get(i).length;j++){
                levels.get(i)[j] += Math.max(levels.get(i+1)[j] ,levels.get(i+1)[j+1]);
            }
        }

//                for(Integer[] l : levels){
//            for(int i=0;i<l.length;i++){
//                System.out.print(l[i]+ " | ");
//            }
//            System.out.println();
//        }

        System.out.println(" la somme max = " + (levels.get(0)[0] + Math.max(levels.get(1)[0] ,levels.get(1)[1])) );


    }
}
