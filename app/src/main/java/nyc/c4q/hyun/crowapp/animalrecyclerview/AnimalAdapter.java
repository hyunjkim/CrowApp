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
 */
public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {

    private LayoutInflater inflater;
    private List<Animals> animalList;
    private View mRoot;

    public AnimalAdapter(List<Animals> animalList, View view) {
        this.animalList = animalList;
        mRoot = view;
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.animal_section,parent,false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        holder.showAnimals(animalList.get(position),mRoot);

    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }
}
