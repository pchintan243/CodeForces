package com.chintan.liquibase.LiquibaseDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 2114A_SquareYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            String s = br.readLine();
            int sum = 0;
            for(char c: s.toCharArray()) {
                sum = (sum * 10) + c - '0';
            }

            int sqrt = (int) Math.sqrt(sum);
            if((sqrt * sqrt) == sum) {
                if(sum == 1) {
                    System.out.println("0 1");
                } else {
                    System.out.println(sqrt / 2 + " " + ((sqrt + 1) / 2));
                }
            } else {
                System.out.println(-1);
            }
        }
    }
}






