package framgia.com.demoretrofit.data.source.remote;

import framgia.com.demoretrofit.data.model.CategoryResponse;
import framgia.com.demoretrofit.data.source.CategoryDatasource;
import retrofit2.Call;
import retrofit2.Callback;

public class CategoryRemoteDataSource implements CategoryDatasource.Remote {
    private static CategoryRemoteDataSource instance;

    private CategoryRemoteDataSource() {
    }

    public static CategoryRemoteDataSource getInstance() {
        if (instance == null) {
            synchronized (CategoryRemoteDataSource.class) {
                instance = new CategoryRemoteDataSource();
            }
        }
        return instance;
    }

    @Override
    public void getAllCategory(Callback<CategoryResponse> callback) {
        Call<CategoryResponse> call = CategoryDataApi
                .getClient().create(ApiService.class).getAllCategory();
        call.enqueue(callback);
    }
}
