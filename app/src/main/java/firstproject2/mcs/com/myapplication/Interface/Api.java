package firstproject2.mcs.com.myapplication.Interface;

import java.util.List;

import firstproject2.mcs.com.myapplication.Hero;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
