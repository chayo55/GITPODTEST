package com.cy.sometests.list;

public class SingleLinkedList<T> {



    /**
     * 链表大小
     */
    int size = 0;

    /**
     * 链表首节点
     */
    Node<T> firstNode;

    /**
     * 构建一个空的单向链表
     */
    public SingleLinkedList(){}

    //TODO: 构建带内容的单向链表

    /**
     * 添加节点
     */
    public void add(T t){
        Node<T> newNode = new Node<>(null, t);
        if (size==0){
            firstNode = newNode;
            size++;
        } else {
            newNode.preNode = firstNode;
            size++;
        }
    }

    /**
     * 删除节点
     */
    public void delete(){

    }

    /**
     * 查询节点
     */
    public Node<T> get(int index){
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException("下标不对");
        } else {
            Node<T> node = firstNode;
            for (int i = 0; i < index; i++) {
                node = node.preNode;
            }
            return node;
        }
    }













    /**
     * 节点Node 尾插法
     * @param <T> 节点存储数据类型 泛型T
     */
    private static class Node<T>{
        T item;
        Node<T> preNode;
        Node(Node<T> preNode, T item){
            this.preNode = preNode;
            this.item = item;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", preNode=" + preNode +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SingleLinkedList{" +
                "size=" + size +
                ", firstNode=" + firstNode +
                '}';
    }
}
