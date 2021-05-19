package org.thor.integration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.thor.model.*;

public class PrinterTest {
    private StoreInfo storeInfo;
    private ItemList itemList;
    private Receipt receipt;
    private Payment payment;
    private Printer printer;

    @Before
    public void setUp() {
        itemList = new ItemList();
        itemList.addItemType(new ItemType("331dfsef", 13.371, 6, "Delikat kladdkaka", 1));
        itemList.addItemType(new ItemType("4324ffs2", 15.45, 12, "Äpplen", 2));
        itemList.addItemType(new ItemType("4t1vhb31", 178.023, 12, "KIWI", 11));
        itemList.addItemType(new ItemType("326v7vt3", 32, 25, "Päron", 2));
        itemList.addItemType(new ItemType("jbwje231", 17.662, 25, "Banan", 4));
        payment = new Payment(itemList.getPrice().getPrice(), 2500);
        receipt = new Receipt(itemList, payment);
        printer = new Printer();
    }

    @After
    public void tearDown() {
        itemList = null;
        receipt = null;
    }

    @Test
    public void printReceipt() {
        printer.printReceipt(receipt);
    }
}