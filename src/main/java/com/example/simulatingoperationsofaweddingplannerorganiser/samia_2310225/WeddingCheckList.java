package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import java.time.LocalDate;

public class WeddingCheckList {
    private  int taskId;
    private String taskName, status;
    private LocalDate deadline;

    public WeddingCheckList(int taskId, String taskName, String status, LocalDate deadline) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.deadline = deadline;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "WeddingCheckList{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", status='" + status + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
