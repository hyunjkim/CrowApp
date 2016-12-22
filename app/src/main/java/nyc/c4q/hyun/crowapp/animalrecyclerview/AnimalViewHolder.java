package nyc.c4q.hyun.crowapp.animalrecyclerview;

import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.hyun.crowapp.R;
import nyc.c4q.hyun.crowapp.animals.Animals;

/**
 * Created by Hyun on 12/21/16.
 */
public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private TextView animalName;
    private CardView animalBackgroundColor;

    public AnimalViewHolder(View view) {
        super(view);
        animalName = (TextView) view.findViewById(R.id.name_TV);
        animalBackgroundColor = (CardView) view.findViewById(R.id.card_view);
    }

    public void showAnimals(final Animals animals) {
        animalName.setText(animals.getName());
        animalName.setTextColor(Color.parseColor(animals.getTextColor()));
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                animalBackgroundColor.setBackgroundColor(Color.parseColor(animals.getBackground()));
                nameClicked(animals,view);
            }
        });
    }
    public void nameClicked(Animals animals, View view) {
        view.setBackgroundColor(Color.parseColor(animals.getBackground()));
    }
}
