package nyc.c4q.hyun.crowapp.network;

import java.util.List;

import nyc.c4q.hyun.crowapp.animals.Animals;

/**
 * Created by Hyun on 12/21/16.
 */

public class AnimalResponse {

    private boolean success;
    private List<Animals> animals;

    public List<Animals> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
