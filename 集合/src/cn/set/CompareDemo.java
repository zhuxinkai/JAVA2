package cn.set;

import java.util.Comparator;

public class CompareDemo implements Comparator<Emp> {
    public static void main (String [] args){



    }

    @Override
    public int compare(Emp o1, Emp o2) {
        int val = o1.getEmpNo() - o2.getEmpNo();
        if(val == 0){
            val = o1.getWorkyear() - o2.getWorkyear();
            if(val == 0){
                val = o1.getName().compareTo(o2.getName());
            }
        }
    return val;}

}
