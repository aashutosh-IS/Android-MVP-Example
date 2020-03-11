package com.ex.crm;

import android.util.Log;

import com.ex.crm.Network.ApiClient;
import com.ex.crm.Network.IEndpointApi;
import com.ex.crm.Tickets.TicketModel.TicketDTO;
import com.ex.crm.Tickets.TicketModel.TicketResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EgxPresenter implements  IEgx.Presenter{
    IEgx.View view;
    private List<TicketResponse> ticketRes = new ArrayList<>();
    private List<String> allData = new ArrayList<>();

    private EgxPresenter(IEgx.View view) {
        this.view = view;
    }

    @Override
    public void created() {
        view.init();
        view.getData(ticketRes);
    }

    @Override
    public void getData(List<TicketResponse> list) {
        IEndpointApi request = ApiClient.getApiClient().create(IEndpointApi.class);
        Call<TicketDTO> call = request.getTickets();
        call.enqueue(new Callback<TicketDTO>() {
            @Override
            public void onResponse(Call<TicketDTO> call, Response<TicketDTO> response) {
                TicketDTO jsonResponse = response.body();
                ticketRes = jsonResponse.getResponse();
                for(int i=0;i<ticketRes.size();i++){
                    allData.add(ticketRes.get(i).getCustomerName());
                    allData.add(ticketRes.get(i).getOwnerName());
                }
                view.getData( ticketRes);



            }
            @Override
            public void onFailure(Call<TicketDTO> call, Throwable t) {
                Log.v("Error",t.getMessage());
            }
        });
    }
}
