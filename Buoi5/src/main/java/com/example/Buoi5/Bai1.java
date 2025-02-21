package com.example.Buoi5;

public class Bai1 {
    public Integer tongcacsole( int a, int b){
        if(a<1 || b<1){
            throw new IllegalArgumentException("cac so phai lon hon hoac bang 1 ");
        }
        if(a % 2 ==0 || b % 2 ==0){

            throw new IllegalArgumentException("cac so phai la so le");
        }
        return a+b;
    }
}
