package nyc.c4q.hyun.crowapp.animalrecyclerview;

import android.graphics.Color;
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

    public AnimalViewHolder(View view) {
        super(view);
        animalName = (TextView) view.findViewById(R.id.name_TV);
    }

    public void showAnimals(Animals animals) {
        animalName.setText(animals.getName());
        animalName.setTextColor(Color.parseColor(animals.getTextColor()));
    }
}
