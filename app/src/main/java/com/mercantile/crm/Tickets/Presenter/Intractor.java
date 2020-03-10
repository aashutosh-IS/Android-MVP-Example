package com.mercantile.crm.Tickets.Presenter;

import android.content.Context;
import android.util.Log;

import com.mercantile.crm.Tickets.IGetTickets;
import com.mercantile.crm.Tickets.TicketModel.TicketDTO;
import com.mercantile.crm.Tickets.TicketModel.TicketResponse;
import com.mercantile.crm.Network.ApiClient;
import com.mercantile.crm.Network.IEndpointApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;



public class Intractor implements IGetTickets.Interactor{
    private IGetTickets.onGetDataListener mOnGetDatalistener;
    private List<TicketResponse> ticketRes = new ArrayList<>();
    private List<String> allData = new ArrayList<>();

    Intractor(IGetTickets.onGetDataListener mOnGetDatalistener){
        this.mOnGetDatalistener = mOnGetDatalistener;
    }
    @Override
    public void initRetrofitCall(Context context) {
        IEndpointApi request = ApiClient.getApiClient().create(IEndpointApi.class);
        Call<TicketDTO> call = request.getTickets();
        call.enqueue(new retrofit2.Callback<TicketDTO>() {
            @Override
            public void onResponse(Call<TicketDTO> call, retrofit2.Response<TicketDTO> response) {
                TicketDTO jsonResponse = response.body();
                ticketRes = jsonResponse.getResponse();
                for(int i=0;i<ticketRes.size();i++){
                    allData.add(ticketRes.get(i).getCustomerName());
                    allData.add(ticketRes.get(i).getOwnerName());
                }
                mOnGetDatalistener.onSuccess("List Size: " + allData.size(), ticketRes);



            }
            @Override
            public void onFailure(Call<TicketDTO> call, Throwable t) {
                Log.v("Error",t.getMessage());
                mOnGetDatalistener.onFailure(t.getMessage());
            }
        });
    }
}
