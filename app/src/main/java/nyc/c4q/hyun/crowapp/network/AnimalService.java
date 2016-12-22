package nyc.c4q.hyun.crowapp.network;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Hyun on 12/21/16.
 */

public interface AnimalService {
    @GET("cgi-bin/12_21_2016_exam.pl")
    Call<AnimalResponse> getAnimalResponse();
}
