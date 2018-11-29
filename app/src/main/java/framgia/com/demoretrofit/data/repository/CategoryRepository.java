package framgia.com.demoretrofit.data.repository;


import framgia.com.demoretrofit.data.model.CategoryResponse;
import framgia.com.demoretrofit.data.source.CategoryDatasource;
import retrofit2.Callback;

public class CategoryRepository implements CategoryDatasource.Remote {
    private CategoryDatasource.Remote mRemote;

    private static CategoryRepository instance;

    public static CategoryRepository getInstance(CategoryDatasource.Remote remote) {
        if (instance == null) {
            synchronized (CategoryRepository.class) {
                instance = new CategoryRepository(remote);
            }
        }
        return instance;
    }

    public CategoryRepository(CategoryDatasource.Remote remote) {
        mRemote = remote;
    }


    @Override
    public void getAllCategory(Callback<CategoryResponse> callback) {
        mRemote.getAllCategory(callback);
    }
}
