package com.ex.crm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.ex.crm.Tickets.Activity.Adapter.GetTicketsAdapter;
import com.ex.crm.Tickets.Presenter.GetTicketsPresenter;
import com.ex.crm.Tickets.TicketModel.TicketResponse;
import com.ex.crm.Utils.GsonUtli;

import java.util.ArrayList;
import java.util.List;

public class Egx extends AppCompatActivity  implements IEgx.View{
    private EgxPresenter mPresenter;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    GetTicketsAdapter ticketsAdapter;
    private List<TicketResponse> ticketRes = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egx);
        mPresenter = new EgxPresenter(this);
        mPresenter.created();

    }

    @Override
    public void init() {
        mPresenter.getData(ticketRes);

        recyclerView =  findViewById(R.id.recyclerView1);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void getData(List<TicketResponse> list) {
        ticketsAdapter = new GetTicketsAdapter(list, getApplicationContext());
        Log.d("EGX", "getData: "+ GsonUtli.toString(list));
        recyclerView.setAdapter(ticketsAdapter);
    }
}
