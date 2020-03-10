package com.mercantile.crm.Network;


import com.mercantile.crm.Login.LoginModel.LoginDTO;
import com.mercantile.crm.Login.LoginModel.User;
import com.mercantile.crm.Tickets.TicketModel.TicketDTO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface IEndpointApi {

    @POST("xxx")
    Call<LoginDTO> Login(@Body User user);


    @GET("xxx")
    Call<TicketDTO> getTickets();

}
