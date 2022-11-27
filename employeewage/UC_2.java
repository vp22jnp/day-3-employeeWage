package com.employeewage;

import java.sql.SQLOutput;

public class UC_2 {
    public static void main(String[] args) {
        int IS_RATE_PER_HOUR = 20;
        int TOTAL_WORKING_HOURS = 8;
        int IS_FULL_TIME=1;
        double empcheck=Math.floor(Math.random()*10)%2;
        int emphrs;
        if (empcheck==IS_FULL_TIME)
           emphrs=8;
        else 
            emphrs=0;
        int empwage = emphrs * IS_RATE_PER_HOUR;
        System.out.println("total wage::"+empwage);
    }
}