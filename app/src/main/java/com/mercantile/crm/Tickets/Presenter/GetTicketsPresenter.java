package com.mercantile.crm.Tickets.Presenter;

import android.content.Context;

import com.mercantile.crm.Tickets.IGetTickets;
import com.mercantile.crm.Tickets.TicketModel.TicketResponse;

import java.util.List;

public class GetTicketsPresenter implements IGetTickets.Presenter,IGetTickets.onGetDataListener {
    IGetTickets.View view;
    private Intractor mIntractor;

    public GetTicketsPresenter(IGetTickets.View view) {
        this.view = view;
        mIntractor = new Intractor(this);
    }

    @Override
    public void getDataFromURL(Context context) {
        mIntractor.initRetrofitCall(context);
    }

    @Override
    public void onSuccess(String message, List<TicketResponse> list) {
        view.onGetDataSuccess(message, list);
    }

    @Override
    public void onFailure(String message) {
        view.onGetDataFailure(message);

    }
}
