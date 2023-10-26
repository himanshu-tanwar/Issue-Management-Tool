package hit.jiraapp.Entity;

public class Issues {

    private String projectName;
    private String issueTitle;
    private String issueDescription;

    public Issues(String projectName, String issueTitle, String issueDescription) {
        this.projectName = projectName;
        this.issueTitle = issueTitle;
        this.issueDescription = issueDescription;
    }

    public Issues() {
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getIssueTitle() {
        return issueTitle;
    }

    public void setIssueTitle(String issueTitle) {
        this.issueTitle = issueTitle;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }
}
