package org.dmate.com.dm8;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amarpreet911 on 03/01/17.
 */
/*CardAdapter.CardViewHolder*/
public class CardAdapter extends RecyclerView.Adapter<CardViewHolder> {

    public List<CardInfo> cardList;
    CardView cv;

    public CardAdapter(List<CardInfo> cardList) {
        this.cardList = cardList;
    }
        @Override
        public int getItemCount() {
            return cardList.size();
        }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.driver_card_options,
                parent, false);
        return new CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(org.dmate.com.dm8.CardViewHolder holder, int position) {

        CardInfo ci = cardList.get(position);
        holder.name.setText(ci.name);
        holder.surname.setText(ci.surname);
        /*holder.vTitle.setText(ci.name + " " + ci.surname);*/

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}

