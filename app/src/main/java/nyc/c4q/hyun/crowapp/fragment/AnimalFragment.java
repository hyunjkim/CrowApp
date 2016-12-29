package nyc.c4q.hyun.crowapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import nyc.c4q.hyun.crowapp.R;
import nyc.c4q.hyun.crowapp.animalrecyclerview.AnimalAdapter;
import nyc.c4q.hyun.crowapp.animals.Animals;
import nyc.c4q.hyun.crowapp.network.AnimalResponse;
import nyc.c4q.hyun.crowapp.network.AnimalService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hyun on 12/21/16.
 */
public class AnimalFragment extends Fragment {

    private static final String API_URL = "http://jsjrobotics.nyc/";

    private Retrofit retrofit;
    private AnimalResponse animalResponse;
    private List<Animals> animalInfo;
    private View view;
    private RecyclerView mRecycler;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.animal_recyclerview, container, false);

        retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AnimalService service = retrofit.create(AnimalService.class);
        Call<AnimalResponse> posts = service.getAnimalResponse();
        posts.enqueue(new Callback<AnimalResponse>() {

            @Override
            public void onResponse(Call<AnimalResponse> call, Response<AnimalResponse> response) {
                animalResponse = response.body();
                animalInfo = animalResponse.getAnimals();

                mRecycler = (RecyclerView) view.findViewById(R.id.animal_RV);
                mRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
                mRecycler.setAdapter(new AnimalAdapter(animalInfo,view));

                Toast.makeText(getActivity(), "SUCCESSFUL", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<AnimalResponse> call, Throwable t) {
                Toast.makeText(getActivity(), "FAILED", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
