package com.ex.crm.Tickets.Activity.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ex.crm.Tickets.TicketModel.TicketResponse;
import com.ex.crm.R;

import java.util.List;

public class GetTicketsAdapter extends RecyclerView.Adapter<GetTicketsAdapter.ViewHolder> {

    private List<TicketResponse> ticketResponses;
    private Context context;

    public GetTicketsAdapter(List<TicketResponse> ticketResponses, Context context) {
        this.ticketResponses = ticketResponses;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_items, parent,false);
        ViewHolder myViewHolder = new ViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.customerName.setText(ticketResponses.get(position).getCustomerName());
        holder.ownerName.setText(ticketResponses.get(position).getOwnerName());


        //TODO : ADD ALL THE REQUIRED FIELD FROM RESPONSE AS ABOVE

    }

    @Override
    public int getItemCount() {
        return ticketResponses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView customerName,ownerName;
        //TODO : ADD ALL THE REQUIRED FIELD

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            customerName=itemView.findViewById(R.id.rowTxtCustomerName);
            ownerName=itemView.findViewById(R.id.rowOwnerName);
            //TODO : ADD ALL THE REQUIRED FIELD

        }
    }
}
