package com.wyc.sword.twentySix;

import com.wyc.sword.other.BinaryTreeNode;

/**
 * 二叉树B是否是二叉树A的一部分
 */
public class HasSubTree {
    public boolean hasSubTree(BinaryTreeNode root1,BinaryTreeNode root2){
       if (root1==null){
           return false;
       }
       if (root2==null){
           return true;
       }
        boolean result = false;
        if (root1.data==root2.data){
            result = doseTree1HasTree2(root1,root2);
            if (!result){
                result = hasSubTree(root1.left,root2);
                if (!result)
                    result = hasSubTree(root1.right,root2);
            }
        }
        return result;
    }

    public boolean doseTree1HasTree2(BinaryTreeNode root1,BinaryTreeNode root2){
        if (root1==null){
            return false;
        }
        if (root2==null){
            return true;
        }
        if (root1.data!=root2.data){
            return false;
        }
        return doseTree1HasTree2(root1.left,root2.left)&&doseTree1HasTree2(root1.right,root2.right);
    }
}
