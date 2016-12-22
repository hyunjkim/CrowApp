package nyc.c4q.hyun.crowapp.animalrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.hyun.crowapp.R;
import nyc.c4q.hyun.crowapp.animals.Animals;

/**
 * Created by Hyun on 12/21/16.
 *     View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.washingtonpost_recycler,parent,false);
 return new WashingtonPostViewHolder(view);
 */
public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {

    private LayoutInflater inflater;
    private List<Animals> animalList;

    public AnimalAdapter(List<Animals> animalList) {
        this.animalList = animalList;
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.animal_section,parent,false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        holder.showAnimals(animalList.get(position));
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }
}
