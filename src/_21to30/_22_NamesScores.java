package _21to30;

import util.EulerProjectProblemAbstract;

import java.util.*;

public class _22_NamesScores extends EulerProjectProblemAbstract {
    private static Map<String,Integer> map = new TreeMap<>();
    public static void main(String[] args) {

        map.put("A",1);map.put("B",2);map.put("C",3);map.put("D",4);map.put("E",5);map.put("F",6);map.put("G",7);map.put("H",8);map.put("I",9);
        map.put("J",10);map.put("K",11);map.put("L",12);map.put("M",13);map.put("N",14);map.put("O",15);map.put("P",16);map.put("Q",17);map.put("R",18);
        map.put("S",19);map.put("T",20);map.put("U",21);map.put("V",22);map.put("W",23);map.put("X",24);map.put("Y",25);map.put("Z",26);

        String fileName = "C://Users/ASUS/IdeaProjects/projectEulerProblems/src/files/p022_names.txt";
        List<String> list = getListFromFile(fileName);

        String[] s = list.get(0).replaceAll("\"","").split(",");
        int len = s.length;

        Set<String> set = new TreeSet<>();

       for(int i =0;i< len ;i++){
           set.add(s[i]);
       }
       int i = 1;
       int total = 0;
       for(String elm : set){
          total += valueOfName(elm) *i;
          i++;
       }
        System.out.print("total = " + total);
    }

    private static int valueOfName(String s){
        int res = 0;

        for(int i=0;i< s.length();i++){
            res += map.get(s.substring(i,i+1));
        }
        return res;
    }
}
