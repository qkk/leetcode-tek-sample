package com.sample.tek;

import java.util.LinkedList;
import java.util.List;

/**
 * ### Question 1: Implement a Binary Search Tree
 * Write a class to implement a binary search tree (BST) with methods for insertion, search, and in-order traversal.
 */
public class BinaryTreeMain {

    public static void main (String[] args){
        BinaryTree tree=new BinaryTree();
        tree.insert(10);
        tree.insert(70);
        tree.insert(20);
        tree.insert(30);
        tree.insert(8);
        tree.insert(50);
        System.out.println(tree.search(11));
        System.out.print("Order List:"+tree.inOrderTraversal());

    }


}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val=val;
    }
}


class BinaryTree{
    TreeNode root;

    public void insert(int val){
        root=insertRec(this.root,val);//important
    }

    private TreeNode insertRec(TreeNode root,int val){
        if(root==null){
            root=new TreeNode(val);
            return root;
        }
        if(val< root.val){
            root.left=insertRec(root.left,val);
        }else if(val>root.val){
            root.right=insertRec(root.right,val);
        }
        return root;
    }

    public boolean search(int val){
        return  searchRec(this.root,val);
    }

    public boolean searchRec(TreeNode root,int val){
        if(root==null) return false;
        if(val==root.val) return true;
        return val<root.val?searchRec(root.left,val):searchRec(root.right,val);
    }

    public List<Integer> inOrderTraversal(){
        List<Integer> result= new LinkedList<>();
        inOrderTraversalRec(this.root,result);
        return result;
    }

    private void inOrderTraversalRec(TreeNode node,List<Integer> result){
        if(node==null) return;
        inOrderTraversalRec(node.left,result);
        result.add(node.val);
        inOrderTraversalRec(node.right,result);
    }

}
