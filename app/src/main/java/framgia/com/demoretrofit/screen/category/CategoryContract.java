package framgia.com.demoretrofit.screen.category;

import java.util.List;

import framgia.com.demoretrofit.data.model.Category;
import framgia.com.demoretrofit.screen.base.BasePresenter;

public interface CategoryContract {
    interface View {
        void onGetCategoriesSuccess(List<Category> categories);

        void onGetCategoriesFailed(Throwable t);
    }

    interface Presenter extends BasePresenter<View> {
        void getAllCategory();
    }
}
