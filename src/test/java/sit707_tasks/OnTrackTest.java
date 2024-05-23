package sit707_tasks;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import org.junit.Assert;

class OnTrackTest{

	@Test
    public void testTaskSubmission() {
        Task task = new Task("Assignment01", "S2201", "Introduction ti testing life cycle");
        task.addAttachment("task01.pdf");
        assertFalse(task.isReviewed());
    }

    @Test
    public void testReceiveFeedback() {
        Task task = new Task("Assignment01", "S2201", "Introduction ti testing life cycle");
        task.receiveFeedback("good start, add a flow chart and steps");
        assertTrue(task.isReviewed());
        assertEquals("good start, add a flow chart and steps", task.getFeedback());
    }

    @Test
    public void testDisplayTaskDetails() {
        Task task = new Task("Assignment01", "S2201", "Introduction ti testing life cycle");
        task.addAttachment("task01.pdf");
        task.receiveFeedback("good start, add a flow chart and steps");

        String expectedDetails = "Task ID: Assignment01\n" +
                "Student ID: S2201\n" +
                "Attachments: [task01.pdf]\n" +
                "Comment: Introduction ti testing life cycle\n" +
                "Feedback: good start, add a flow chart and steps\n" +
                "Reviewed: true\n";

        assertEquals(expectedDetails, getTaskDetails(task));
    }

    private String getTaskDetails(Task task) {
        return String.format("Task Name: %s\nStudent ID: %s\nComment: %s\nAttachments: %s\nFeedback: %s\nReviewed: %s\n",
                task.getTaskId(), task.getStudentId(), task.getDescription(), task.getAttachments(), task.getFeedback(), task.isReviewed());
    }

}
