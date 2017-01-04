package org.dmate.com.dm8;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by amarpreet911 on 03/01/17.
 */

public class CardViewHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public TextView surname;
    CardView cv;

    public CardViewHolder(View view){
                    super(view);
        cv = (CardView) view.findViewById(R.id.card_view);
            name =  (TextView) view.findViewById(R.id.name_info);
            surname = (TextView)  view.findViewById(R.id.lname_info);
    }
}
