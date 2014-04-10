package org.gradle;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
    public void testTest() {
        Person person = new Person("testname1");
        assertEquals("testname1", person.getName());
        person.setName("testname2");
        assertEquals("testname2", person.getName());
    }
}
