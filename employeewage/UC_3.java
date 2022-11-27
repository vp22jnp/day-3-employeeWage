package com.employeewage;

public class UC_3 {
    public static void main(String[] args) {
        int IS_FULL_TIME=2;
        int IS_PART_TIME=1;
        int TOTAL_WAGE_PER_HRS=20;
        double empcheck=Math.floor(Math.random()*10)%2;
        int emphrs;
        if(empcheck==IS_FULL_TIME)
            emphrs=8;
        else
            emphrs=4;
          int  empwage=emphrs*TOTAL_WAGE_PER_HRS;
        System.out.println("total wage is="+empwage);
    }
}
