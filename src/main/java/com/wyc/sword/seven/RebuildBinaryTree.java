package com.wyc.sword.seven;

/**
 * 根据前序和中序遍历重构二叉树
 */
public class RebuildBinaryTree {
    class Node{
        private int data;
        private Node leftChild;
        private Node rightChild;
        Node(int data){
            this.data=data;
            leftChild=null;
            rightChild=null;
        }
    }

    Node rebuildBinaryTree(int[] preOrder,int[] infixOrder){
        if (preOrder==null||infixOrder==null){
            return null;
        }else if (preOrder.length<=0||infixOrder.length<=0){
            return null;
        }
        if (preOrder[0]==preOrder[preOrder.length-1]){
            if (infixOrder[0]==infixOrder[infixOrder.length-1]){
                return new Node(preOrder[0]);
            }else {
                return null;
            }
        }
        return constructBinaryTree(preOrder,0,preOrder.length-1,infixOrder,0,infixOrder.length-1);
    }

    Node constructBinaryTree(int[] preOrder,int preStartIndex,int preEndIndex,int[] infixOrder,int infixStartIndex,int infixEndIndex){
      Node node = new Node(preOrder[preStartIndex]);
      int infixRootIndex=infixStartIndex;
      while(infixRootIndex<=infixEndIndex&&infixOrder[infixRootIndex]!=node.data){
          infixRootIndex++;
      }
      int leftLength=infixRootIndex-infixStartIndex;
      int preLeftEndIndex=preStartIndex+leftLength;
      if (leftLength>0){
          node.leftChild=constructBinaryTree(preOrder,preStartIndex+1,preLeftEndIndex,infixOrder,infixStartIndex,infixRootIndex-1);
      }
      //这里切记不要写else if,因为根节点的第一个if完成后,要去第二个if继续执行
      if (preEndIndex-preStartIndex>leftLength){
          node.rightChild=constructBinaryTree(preOrder,preLeftEndIndex+1,preEndIndex,infixOrder,infixRootIndex+1,infixEndIndex);
      }
      return node;
    }

    void postOrder(Node node){
        if (node!=null){
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.println(node.data+" ");
        }
    }

    public static void main(String[] args) {
        int[] preOrder={1,2,4,7,3,5,6,8};
        int[] infixOrder={4,7,2,1,5,3,8,6};
        RebuildBinaryTree rebuildBinaryTree = new RebuildBinaryTree();
        Node node = rebuildBinaryTree.rebuildBinaryTree(preOrder, infixOrder);
        rebuildBinaryTree.postOrder(node);
    }
}
