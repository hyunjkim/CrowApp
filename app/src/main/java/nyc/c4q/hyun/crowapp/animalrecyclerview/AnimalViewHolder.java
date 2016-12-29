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

    public void showAnimals(final Animals animals, final View mRoot) {
        animalName.setText(animals.getName());
        animalName.setTextColor(Color.parseColor(animals.getTextColor()));
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRoot.setBackgroundColor(Color.parseColor(animals.getBackground()));
            }
        });
    }
}
