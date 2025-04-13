package com.sample.tek;

import java.util.*;

/**
 * Implement a function to detect if a linked list has a cycle. If there is a cycle, return the node where the cycle begins. Otherwise, return `None`.
 */
public class LinkedListCycle {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.next();
        List<String> org= Arrays.asList(str.split(","));
        LinkedList<String> listed=new LinkedList<>(org);
        HashMap<String,List<Integer>> dupList=new HashMap<>();
        int[] index={0};
        listed.stream().forEach(key->{
            if(dupList.containsKey(key)){
                dupList.get(key).add(index[0]);
            }else{
                dupList.put(key,new ArrayList<>());
                dupList.get(key).add(index[0]);
            }
            index[0]++;
        });

        StringBuffer nonMsg= new StringBuffer();
        for(String ele:dupList.keySet()){
            if(dupList.get(ele).size()>1){
                nonMsg.append(ele).append(" First Occur:").append(dupList.get(ele).get(0)).append("\r\n");
            }
        }

        if(nonMsg.isEmpty()){
            System.out.println("None");
        }else{
            System.out.println(nonMsg);
        }

    }
}
