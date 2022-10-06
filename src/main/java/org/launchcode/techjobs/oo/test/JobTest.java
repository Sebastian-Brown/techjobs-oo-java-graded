package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId () {
        Job one = new Job();
        Job two = new Job();
        assertNotEquals(one, two);
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job three = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));;

        assertTrue(three.getName() instanceof String);
        assertTrue(three.getEmployer() instanceof Employer);
        assertTrue(three.getLocation() instanceof Location);
        assertTrue(three.getPositionType() instanceof PositionType);
        assertTrue(three.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {
        Job four = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job five = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));;

        assertFalse(four.equals(five));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job six = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals('\n',six.toString().charAt(0));
        assertEquals('\n', six.toString().charAt(six.toString().length() - 1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job seven = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: " + seven.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n" , seven.toString());

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job eight = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        assertEquals("\nID: " + eight.getId() + "\nName: \nEmployer: ACME\nLocation: Desert\nPosition Type: \nCore Competency: Persistence\n" , eight.toString());


    }
}
