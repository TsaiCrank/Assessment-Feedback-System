import java.io.Serializable;
import java.util.Date;

class AssessmentSubmission implements Serializable {
    private String submissionId;
    private String assessmentId;
    private String studentId;
    private String filePath;           // Path to submitted file
    private String fileName;           // Original file name
    private Date submissionDate;
    private String status;             // "SUBMITTED", "GRADED", "LATE"
    private String submissionComments; // Optional student comments

    public AssessmentSubmission(String submissionId, String assessmentId,
                                String studentId, String filePath, String fileName) {
        this.submissionId = submissionId;
        this.assessmentId = assessmentId;
        this.studentId = studentId;
        this.filePath = filePath;
        this.fileName = fileName;
        this.submissionDate = new Date();
        this.status = "SUBMITTED";
        this.submissionComments = "";
    }

    // Getters
    public String getSubmissionId() { return submissionId; }
    public String getAssessmentId() { return assessmentId; }
    public String getStudentId() { return studentId; }
    public String getFilePath() { return filePath; }
    public String getFileName() { return fileName; }
    public Date getSubmissionDate() { return submissionDate; }
    public String getStatus() { return status; }
    public String getSubmissionComments() { return submissionComments; }

    // Setters
    public void setStatus(String status) { this.status = status; }
    public void setSubmissionComments(String comments) { this.submissionComments = comments; }
    public void setFilePath(String filePath) { this.filePath = filePath; }
    public void setFileName(String fileName) { this.fileName = fileName; }

    @Override
    public String toString() {
        return submissionId + "," + assessmentId + "," + studentId + "," +
                filePath + "," + fileName + "," + submissionDate.getTime() + "," +
                status + "," + (submissionComments != null ? submissionComments.replace(",", "~~COMMA~~") : "");
    }
}