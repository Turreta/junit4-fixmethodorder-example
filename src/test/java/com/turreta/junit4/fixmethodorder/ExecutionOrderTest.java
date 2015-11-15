package com.turreta.junit4.fixmethodorder;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Turreta.com
 * 
 *         Test the order of execution of test methods. Order of execution is not guaranteed here.
 *
 */
public class ExecutionOrderTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() {
        System.out.println("create");
    }

    @Test
    public void delete() {
        System.out.println("delete");
    }

    @Test
    public void mark_deleted() {
        System.out.println("mark_deleted");
    }

    @Test
    public void mark_modified() {
        System.out.println("mark_modified");

    }

    @Test
    public void update() {
        System.out.println("update");

    }

    @Test
    public void reset() {
        System.out.println("reset");

    }

}
