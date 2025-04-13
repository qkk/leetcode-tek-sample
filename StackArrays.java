package com.sample.tek;

import java.util.Arrays;
import java.util.Stack;

/**
 * ### Question 2: Implement a Stack Using Arrays
 * Write a class to implement a stack using arrays with methods for push, pop, and peek.
 */
public class StackArrays {

    public static void main(String[] args) {
        MyArraysStack statck=new MyArraysStack(3);
        statck.push(1);
        statck.push(2);
        statck.push(3);
        statck.push(4);
        statck.push(5);
        System.out.println(statck.peek());//8
        System.out.println(statck.size());//8
        for (int i = 0; i < 5; i++) {
            System.out.println(statck.pop());
        }

    }




}

class MyArraysStack{
    private int[] storage;
    private int cap;
    private int count;
    private static final int fac_inc=2;

    public MyArraysStack(){
        this.cap=8;
        this.storage=new int[this.cap];
        this.count=0;
    }
    public MyArraysStack(int cap){
        if(cap<1){
            throw new IllegalArgumentException("Capacity too small Please increment it.");
        }
        this.cap=cap;
        this.storage=new int[cap];
        this.count=0;
    }
    private void ensureCap(){
        int newCap=this.cap*fac_inc;
        this.storage= Arrays.copyOf(this.storage,newCap);
        this.cap=newCap;
    }

    public void push(int val){
        if(this.count == this.cap){
            ensureCap();
        }
        storage[this.count++]=val;
    }

    public int pop(){//out
        this.count --;
        if(count == -1){
           throw  new IllegalArgumentException("Stack is empty!");
        }
        return this.storage[count];
    }

    public int peek(){//out
        if(count == 0){
            throw  new IllegalArgumentException("Stack is empty!");
        }
        return this.storage[count-1];
    }

    public boolean isEmpty(){
       return count ==0;
    }

    public int size(){
        return this.count;
    }


}