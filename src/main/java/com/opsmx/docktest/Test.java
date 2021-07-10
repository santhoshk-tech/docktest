package com.opsmx.docktest;

public class Test {
    public static void main(String[] args) {
        Integer[] a = {0,-1,1,23,49,2,1,45};
        Integer big=a[0];
        Integer small = a[0];

        // Big number from array
        for(int i =1;i<a.length;i++){
            if(a[i]>big){
                big=a[i];
            }
        }
        System.out.println(big);
        // Small number from array
        for(int i =1;i<a.length;i++){
            if(a[i]<small){
                small=a[i];
            }
        }
        System.out.println(small);

        // Duplicate number from an array

        for(int i = 0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i]==a[j]) && (i!=j)){
                    System.out.println("Duplicate : "+a[i]);
                }
            }
        }
    }
}
