package com.ex.crm;

import com.ex.crm.Tickets.TicketModel.TicketResponse;

import java.util.List;

public interface IEgx {

    interface View {
        void init();

        void getData(List<TicketResponse> list);
    }
    interface Presenter {

        void created();


        void getData(List<TicketResponse> list);

    }
}
