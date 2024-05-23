package sit707_tasks;

import java.util.ArrayList;
import java.util.List;

class Task {
    private String taskName;
    private String studentId;
    private List<String> attachments;
    private String Comment;
    private String feedback;
    private boolean reviewed;

    public Task(String taskId, String studentId, String description) {
        this.taskName = taskName;
        this.studentId = studentId;
        this.attachments = new ArrayList<>();
        this.Comment = description;
        this.feedback = "";
        this.reviewed = false;
    }

    public void addAttachment(String attachment) {
        attachments.add(attachment);
    }

    public void receiveFeedback(String feedback) {
        this.feedback = feedback;
        this.reviewed = true;
    }

    public void displayTaskDetails() {
        System.out.println("Task Name: " + taskName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Attachments: " + attachments);
        System.out.println("Cooment: " + Comment);
        System.out.println("Feedback: " + feedback);
        System.out.println("Reviewed: " + reviewed);
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isReviewed() {
        return reviewed;
    }


    public String getStudentId() {
        return studentId;
    }
    
    public String getDescription() {
        return Comment;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public String getFeedback() {
        return feedback;
    }
}

public class OnTrack {
    public static void main(String[] args) {
        Task task = new Task("Assignment01", "S001", "Submit essay for English literature");

        task.addAttachment("Essay.pdf");

        task.receiveFeedback("Good effort. Work on improving grammar and organization.");

        task.displayTaskDetails();
    }
}

