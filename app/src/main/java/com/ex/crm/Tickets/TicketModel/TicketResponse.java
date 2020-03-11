package com.ex.crm.Tickets.TicketModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TicketResponse {
    @SerializedName("ticketId")
    @Expose
    private Integer ticketId;
    @SerializedName("customerId")
    @Expose
    private String customerId;
    @SerializedName("customerName")
    @Expose
    private String customerName;
    @SerializedName("ticketPriority")
    @Expose
    private Integer ticketPriority;
    @SerializedName("ticketFlag")
    @Expose
    private Integer ticketFlag;
    @SerializedName("totalCharge")
    @Expose
    private Integer totalCharge;
    @SerializedName("openDate")
    @Expose
    private String openDate;
    @SerializedName("closedDate")
    @Expose
    private String closedDate;
    @SerializedName("ownerId")
    @Expose
    private String ownerId;
    @SerializedName("ownerName")
    @Expose
    private String ownerName;
    @SerializedName("registeredBy")
    @Expose
    private String registeredBy;
    @SerializedName("registeredByName")
    @Expose
    private String registeredByName;
    @SerializedName("problemId")
    @Expose
    private Integer problemId;
    @SerializedName("problemName")
    @Expose
    private String problemName;
    @SerializedName("totalHoursSpent")
    @Expose
    private Integer totalHoursSpent;
    @SerializedName("estimatedSolveDuration")
    @Expose
    private String estimatedSolveDuration;
    @SerializedName("totalUpdates")
    @Expose
    private Integer totalUpdates;
    @SerializedName("currentStatusMasterId")
    @Expose
    private Integer currentStatusMasterId;
    @SerializedName("currentStatusName")
    @Expose
    private String currentStatusName;
    @SerializedName("problemInformedSource")
    @Expose
    private String problemInformedSource;
    @SerializedName("taskType")
    @Expose
    private String taskType;
    @SerializedName("callerName")
    @Expose
    private String callerName;
    @SerializedName("associatedTicket")
    @Expose
    private String associatedTicket;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getTicketPriority() {
        return ticketPriority;
    }

    public void setTicketPriority(Integer ticketPriority) {
        this.ticketPriority = ticketPriority;
    }

    public Integer getTicketFlag() {
        return ticketFlag;
    }

    public void setTicketFlag(Integer ticketFlag) {
        this.ticketFlag = ticketFlag;
    }

    public Integer getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(Integer totalCharge) {
        this.totalCharge = totalCharge;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public Object getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(String closedDate) {
        this.closedDate = closedDate;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    public String getRegisteredByName() {
        return registeredByName;
    }

    public void setRegisteredByName(String registeredByName) {
        this.registeredByName = registeredByName;
    }

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public Integer getTotalHoursSpent() {
        return totalHoursSpent;
    }

    public void setTotalHoursSpent(Integer totalHoursSpent) {
        this.totalHoursSpent = totalHoursSpent;
    }

    public String getEstimatedSolveDuration() {
        return estimatedSolveDuration;
    }

    public void setEstimatedSolveDuration(String estimatedSolveDuration) {
        this.estimatedSolveDuration = estimatedSolveDuration;
    }

    public Integer getTotalUpdates() {
        return totalUpdates;
    }

    public void setTotalUpdates(Integer totalUpdates) {
        this.totalUpdates = totalUpdates;
    }

    public Integer getCurrentStatusMasterId() {
        return currentStatusMasterId;
    }

    public void setCurrentStatusMasterId(Integer currentStatusMasterId) {
        this.currentStatusMasterId = currentStatusMasterId;
    }

    public String getCurrentStatusName() {
        return currentStatusName;
    }

    public void setCurrentStatusName(String currentStatusName) {
        this.currentStatusName = currentStatusName;
    }

    public String getProblemInformedSource() {
        return problemInformedSource;
    }

    public void setProblemInformedSource(String problemInformedSource) {
        this.problemInformedSource = problemInformedSource;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public String getAssociatedTicket() {
        return associatedTicket;
    }

    public void setAssociatedTicket(String associatedTicket) {
        this.associatedTicket = associatedTicket;
    }

    public Object getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Object getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
