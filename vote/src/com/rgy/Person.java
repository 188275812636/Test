package com.rgy;

public class Person implements Comparable<Person>{
    private String name;
    private int count;
    private int id;

    public Person(){
        super();
    }

    public Person(String name, int count, int id) {
        this.name = name;
        this.count = count;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Person p) {
        if(this.count>p.count){
            return -1;
        }
        else if(this.count<p.count){
            return 1;
        }
        else{
            return 0;
        }
    }

}
