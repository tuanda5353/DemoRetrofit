package framgia.com.demoretrofit.data.source.remote;

import framgia.com.demoretrofit.data.model.CategoryResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    public static final String CAT_LIST = "api.php?cat_list";

    @GET(CAT_LIST)
    Call<CategoryResponse> getAllCategory();
}
