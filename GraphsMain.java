
package com.sample.tek;

import java.util.LinkedList;
import java.util.Queue;

/**
 * #### Question 4: Graphs
 * Implement a function to perform a breadth-first search (BFS) on a graph represented as an adjacency list.
 */
public class GraphsMain {

    public static void main(String[] args){
        Graphs graphs=new Graphs(5);
        graphs.addItem(0,1);
        graphs.addItem(0,2);
        graphs.addItem(1,2);
        graphs.addItem(1,3);
        graphs.addItem(2,3);
        graphs.addItem(2,4);
        graphs.BFS(0);
    }

}

class Graphs{
    int val;
    LinkedList<Integer> adj[];

    public Graphs(int val){
        this.val=val;
        adj=new LinkedList[val];
        for(int i=0;i<val;++i){//init LinkedList
           adj[i]=new LinkedList<>();
        }
    }

    public void addItem(int v,int w){
        adj[v].add(w);
    }

    public void BFS(int s){
        boolean[] visted=new boolean[val];//item flag-visted;
        Queue<Integer> queue=new LinkedList<>();
        visted[s]=true;
        queue.add(s);
        while(!queue.isEmpty()){
            s=queue.poll();
            System.out.println(s+" ");
            for(int n:adj[s]){//from val to visted
                if(!visted[n]){
                    visted[n]=true;
                    queue.add(n);
                }
            }
        }
    }


}
