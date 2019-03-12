package com.spring;

public class ResponseBody {
    public ResponseBody(int number) {
        setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;
}
