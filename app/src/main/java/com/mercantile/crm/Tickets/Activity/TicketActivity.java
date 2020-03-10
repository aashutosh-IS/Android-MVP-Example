package com.mercantile.crm.Tickets.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.mercantile.crm.Tickets.Activity.Adapter.GetTicketsAdapter;
import com.mercantile.crm.Tickets.IGetTickets;
import com.mercantile.crm.Tickets.TicketModel.TicketResponse;
import com.mercantile.crm.Tickets.Presenter.GetTicketsPresenter;
import com.mercantile.crm.R;

import java.util.List;

public class TicketActivity extends AppCompatActivity implements IGetTickets.View {
    private GetTicketsPresenter mPresenter;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    GetTicketsAdapter ticketsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_tickets);

        //TODO: IMPLEMENT TAB BAR AS REQUIRED
        mPresenter = new GetTicketsPresenter(this);
        mPresenter.getDataFromURL(this);
        recyclerView =  findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

    }


    @Override
    public void onGetDataSuccess(String message, List<TicketResponse> list) {
        ticketsAdapter = new GetTicketsAdapter(list, getApplicationContext());
        recyclerView.setAdapter(ticketsAdapter);
    }

    @Override
    public void onGetDataFailure(String message) {
        Log.d("Status", message);

    }
}
