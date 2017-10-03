package net.sourceforge.html5val.performers;

import static org.junit.Assert.*;

import java.lang.annotation.Annotation;

import org.hibernate.validator.constraints.Email;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;

// FIXME: only test the "happy path". Test the boundary conditions.
public class ValidationPerformerFactoryTest {

    private final Mockery context = new JUnit4Mockery();

    @Test
    public void getPerformerFor() {
        Email emailAnnotation = context.mock(Email.class);
        assertGetPerformer(DefaultPerformers.EMAIL, emailAnnotation);
    }

    private static void assertGetPerformer(Class expectedPerformerClass, Annotation annotation) {
        IValidationPerformer performer = ValidationPerformerFactory.getPerformerFor(annotation);
        assertEquals(expectedPerformerClass, performer.getClass());
    }

    /** Public method to be used in every IValidationPerformer test. */
    public static void assertGetPerformer(IValidationPerformer expectedPerformer, Annotation annotation) {
        assertGetPerformer(expectedPerformer.getClass(), annotation);
    }
}
