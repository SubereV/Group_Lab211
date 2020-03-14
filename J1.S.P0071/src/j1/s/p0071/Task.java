/*
 * Name: Vo Nhu Khang
 * Class: SE1403
 * MSSV: DE140179
 */
package j1.s.p0071;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author khangvn
 */
public class Task {

    private String name;
    private String taskType;
    private Date date;
    private float planFrom;
    private float planTo;
    private String assignee;
    private String reviewer;

    public Task() {
    }

    public Task(String name, String taskType, Date date, float planFrom, float planTo, String assignee, String reviewer) {
        this.name = name;
        this.taskType = taskType;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(float planFrom) {
        this.planFrom = planFrom;
    }

    public float getPlanTo() {
        return planTo;
    }

    public void setPlanTo(float planTo) {
        this.planTo = planTo;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public String toString() {
        return "Task{" + "name=" + name + ", taskType=" + taskType + ", date=" + date + ", planFrom=" + planFrom + ", planTo=" + planTo + ", assignee=" + assignee + ", reviewer=" + reviewer + '}';
    }

}
