package com.turreta.junit4.fixmethodorder;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * 
 * @author Turreta.com
 * 
 *         Test execution order of test methods. Execution order is as follow: 1. create 2. delete 3. mark_deleted 4.
 *         mark_modified 5. reset 6. update
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixMethodOrderTest {

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
