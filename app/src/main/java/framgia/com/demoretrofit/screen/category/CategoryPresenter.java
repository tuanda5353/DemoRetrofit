package framgia.com.demoretrofit.screen.category;

import framgia.com.demoretrofit.data.model.CategoryResponse;
import framgia.com.demoretrofit.data.repository.CategoryRepository;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoryPresenter implements CategoryContract.Presenter {
    private CategoryRepository mRepository;
    private CategoryContract.View mView;

    public CategoryPresenter(CategoryRepository repository) {
        mRepository = repository;
    }

    @Override
    public void setView(CategoryContract.View view) {
        mView = view;
    }

    @Override
    public void getAllCategory() {
        mRepository.getAllCategory(new Callback<CategoryResponse>() {
            @Override
            public void onResponse(Call<CategoryResponse> call, Response<CategoryResponse> response) {
                mView.onGetCategoriesSuccess(response.body().getCategories());
            }

            @Override
            public void onFailure(Call<CategoryResponse> call, Throwable t) {
                mView.onGetCategoriesFailed(t);
            }
        });
    }
}
