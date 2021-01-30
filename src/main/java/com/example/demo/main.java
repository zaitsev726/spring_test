package com.example.demo;

class Test {
     byte x = 1;

    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }
}
