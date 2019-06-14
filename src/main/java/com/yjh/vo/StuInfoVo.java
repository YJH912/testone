package com.yjh.vo;

public class StuInfoVo {

    int min;
    int max;
    String stuSex;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    @Override
    public String toString() {
        return "StuInfoVo{" +
                "min=" + min +
                ", max=" + max +
                ", stuSex='" + stuSex + '\'' +
                '}';
    }
}
