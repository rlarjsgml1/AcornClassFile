package com.example.helloSpring.model;

public class LJHCook extends Cook implements 한식가능한{

    public LJHCook( String name) {super(name);}
    @Override
    public String 비빔밥만들기() {
        return "돌솥비빔밥";
    }
}
