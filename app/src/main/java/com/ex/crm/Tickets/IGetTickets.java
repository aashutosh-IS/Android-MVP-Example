package com.ex.crm.Tickets;

import android.content.Context;

import com.ex.crm.Tickets.TicketModel.TicketResponse;

import java.util.List;

public interface IGetTickets {

    interface View {
        void onGetDataSuccess(String message, List<TicketResponse> list);
        void onGetDataFailure(String message);
    }
    interface Interactor{
        void initRetrofitCall(Context context);

    }
    interface Presenter {
        void getDataFromURL(Context context);
    }
    interface onGetDataListener{
        void onSuccess(String message, List<TicketResponse> list);
        void onFailure(String message);
    }
}
