package com.sample.tek;

import java.util.LinkedList;
import java.util.List;

/**
 * #### Question 3: Trees
 * Write a function to perform an in-order traversal of a binary tree and return the values in a list.
 */
public class BinaryTreeSearch {

    public static void main (String[] args){
        BinaryTree tree=new BinaryTree();
        tree.insert(10);
        tree.insert(70);
        tree.insert(20);
        tree.insert(30);
        tree.insert(8);
        tree.insert(50);
        System.out.print("Order List:"+tree.inOrderTraversal());

    }


}

class TreeNodeDef{
    int val;
    TreeNodeDef left;
    TreeNodeDef right;

    public TreeNodeDef(int val){
        this.val=val;
    }
}


class BinaryTreeBuild{
    TreeNodeDef root;

    public void insert(int val){
        root=insertRec(this.root,val);//important
    }

    private TreeNodeDef insertRec(TreeNodeDef root,int val){
        if(root==null){
            root=new TreeNodeDef(val);
            return root;
        }
        if(val< root.val){
            root.left=insertRec(root.left,val);
        }else if(val>root.val){
            root.right=insertRec(root.right,val);
        }
        return root;
    }
    
    public List<Integer> inOrderTraversal(){
        List<Integer> result= new LinkedList<>();
        inOrderTraversalRec(this.root,result);
        return result;
    }

    private void inOrderTraversalRec(TreeNodeDef node,List<Integer> result){
        if(node==null) return;
        inOrderTraversalRec(node.left,result);
        result.add(node.val);
        inOrderTraversalRec(node.right,result);
    }

}
