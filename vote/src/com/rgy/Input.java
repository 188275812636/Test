package com.rgy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    public int getInput(String msg) {
        int num = 0;
        boolean flag = true;
        while (flag) {
            System.out.println(msg);
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                f(str);
                num = Integer.parseInt(str);
                flag = false;
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        return  num;
    }
    public void f(String str) throws MyException {
        if(str.matches("[^01234]")){
            throw new MyException("输入正确ID");
        }
    }

}
