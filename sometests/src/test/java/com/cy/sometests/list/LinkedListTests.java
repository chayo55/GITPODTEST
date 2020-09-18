package com.cy.sometests.list;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LinkedListTests {

    @Test
    void TestSingleLinkedList(){
        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<Integer>();
        singleLinkedList.add(1);
        singleLinkedList.add(2);
        singleLinkedList.add(3);
        singleLinkedList.add(4);
        singleLinkedList.add(5);

        for (int i = 0; i < 5; i++) {
            System.out.println(singleLinkedList.get(i));
        }
    }
}
