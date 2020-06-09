package com.ns.dataloading.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class RunLog {
    private Long id;
    private String runStatus;
    private String startTime;
    private String endTime;
    private String runType;
    private String processCycle;
    private String triggeredBy;
    private String errorMessage;
    private String runFor;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "RunStatus", length = 25)
    public String getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus;
    }

    @Basic
    @Column(name = "StartTime")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "EndTime")
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "RunType", length = 10)
    public String getRunType() {
        return runType;
    }

    public void setRunType(String runType) {
        this.runType = runType;
    }

    @Basic
    @Column(name = "ProcessCycle", length = 255)
    public String getProcessCycle() {
        return processCycle;
    }

    public void setProcessCycle(String processCycle) {
        this.processCycle = processCycle;
    }

    @Basic
    @Column(name = "TriggeredBy", length = 255)
    public String getTriggeredBy() {
        return triggeredBy;
    }

    public void setTriggeredBy(String triggeredBy) {
        this.triggeredBy = triggeredBy;
    }

    @Basic
    @Column(name = "ErrorMessage", length = 10000)
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Basic
    @Column(name = "RunFor", length = 255)
    public String getRunFor() {
        return runFor;
    }

    public void setRunFor(String runFor) {
        this.runFor = runFor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RunLog runLog = (RunLog) o;

        if (id != null ? !id.equals(runLog.id) : runLog.id != null) return false;
        if (runStatus != null ? !runStatus.equals(runLog.runStatus) : runLog.runStatus != null) return false;
        if (startTime != null ? !startTime.equals(runLog.startTime) : runLog.startTime != null) return false;
        if (endTime != null ? !endTime.equals(runLog.endTime) : runLog.endTime != null) return false;
        if (runType != null ? !runType.equals(runLog.runType) : runLog.runType != null) return false;
        if (processCycle != null ? !processCycle.equals(runLog.processCycle) : runLog.processCycle != null)
            return false;
        if (triggeredBy != null ? !triggeredBy.equals(runLog.triggeredBy) : runLog.triggeredBy != null) return false;
        if (errorMessage != null ? !errorMessage.equals(runLog.errorMessage) : runLog.errorMessage != null)
            return false;
        if (runFor != null ? !runFor.equals(runLog.runFor) : runLog.runFor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (runStatus != null ? runStatus.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (runType != null ? runType.hashCode() : 0);
        result = 31 * result + (processCycle != null ? processCycle.hashCode() : 0);
        result = 31 * result + (triggeredBy != null ? triggeredBy.hashCode() : 0);
        result = 31 * result + (errorMessage != null ? errorMessage.hashCode() : 0);
        result = 31 * result + (runFor != null ? runFor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"RunLog\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"runStatus\":\"" + runStatus + "\""
                + ",                         \"startTime\":" + startTime
                + ",                         \"endTime\":" + endTime
                + ",                         \"runType\":\"" + runType + "\""
                + ",                         \"processCycle\":\"" + processCycle + "\""
                + ",                         \"triggeredBy\":\"" + triggeredBy + "\""
                + ",                         \"errorMessage\":\"" + errorMessage + "\""
                + ",                         \"runFor\":\"" + runFor + "\""
                + "}}";
    }
}
