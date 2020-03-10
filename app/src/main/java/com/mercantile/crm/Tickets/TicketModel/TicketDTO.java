package com.mercantile.crm.Tickets.TicketModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TicketDTO {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("exceptionMessage")
    @Expose
    private String exceptionMessage;
    @SerializedName("response")
    @Expose
    private List<TicketResponse> response = null;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public List<TicketResponse> getResponse() {
        return response;
    }

    public void setResponse(List<TicketResponse> response) {
        this.response = response;
    }

}
