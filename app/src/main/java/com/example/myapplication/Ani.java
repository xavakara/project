package com.example.myapplication;

public class Ani {
    private String name;
    private String Des;
    private int Res;
    private String pop;

    public Ani(String name,String Des,int Res,String pop) {
        this.name = name;
        this.Des = Des;
        this.Res = Res;
        this.pop = pop;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDes(){
        return Des;
    }

    public void setDes(String Des) {
        this.Des = Des;
    }
    public int getRes(){
        return Res;
    }

    public void setRes(int Res) {
        this.Res = Res;
    }
    public String getpop(){
        return pop;
    }

    public void setpop(String pop) {
        this.pop = pop;
    }
}
