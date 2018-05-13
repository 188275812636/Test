package com.rgy;

import java.util.Arrays;

public class Vote {
        private static Person ps[] = new Person[]{new Person("张三", 0, 1),
                new Person("李四", 0, 2), new Person("王五", 0, 3),
                new Person("赵六", 0, 4)};
        private static Input in = new Input();
        private static boolean flag = true;
    public static void main(String[] args) {
        System.out.println("候选人：\n" + "张三,ID:1\n" + "李四,ID:2\n" + "王五,ID:3\n" + "赵六,ID:4\n");
        while (flag) {
            vote();
        }
        Arrays.sort(ps);
        if (ps[0].getCount() > ps[1].getCount()) {
            System.out.println(ps[0].getName() + "获得" + ps[0].getCount() + "票，在投票中胜出");
        } else if (ps[0].getCount() < ps[1].getCount() && ps[1].getCount() != ps[2].getCount()) {
            System.out.println(ps[1].getName() + "获得" + ps[1].getCount() + "票，在投票中胜出");
        } else {
            System.out.println("有人获得同样的最高票数，请从新商议！");
        }
        for (int i = 0; i < ps.length; i++) {
            System.out.println(ps[i].getName() + ":"
                    + ":" + ps[i].getCount() + "票");
        }
    }
    public static void vote(){
        int id = in.getInput("输入候选人ID投票,输入0结束投票：");
        String s= "";
        switch (id){
            case 0:{
                flag = false;
                break;
            }
            case 1:{
               ps[0].setCount(ps[0].getCount()+1);
                break;
            }
            case 2:{
                ps[1].setCount(ps[1].getCount()+1);
                break;
            }
            case 3:{
                ps[2].setCount(ps[2].getCount()+1);
                break;
            }
            case 4:{
                ps[3].setCount(ps[3].getCount()+1);
                break;
            }
        }
    }
}
