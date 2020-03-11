package com.ex.crm.Network;


import com.ex.crm.Login.LoginModel.LoginDTO;
import com.ex.crm.Login.LoginModel.User;
import com.ex.crm.Tickets.TicketModel.TicketDTO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface IEndpointApi {

    @POST("")
    Call<LoginDTO> Login(@Body User user);


    @GET("")
    Call<TicketDTO> getTickets();

}
