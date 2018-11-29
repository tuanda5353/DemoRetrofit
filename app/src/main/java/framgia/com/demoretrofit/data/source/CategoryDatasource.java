package framgia.com.demoretrofit.data.source;

import framgia.com.demoretrofit.data.model.CategoryResponse;
import retrofit2.Callback;

public interface CategoryDatasource {
    interface Remote {
        void getAllCategory(Callback<CategoryResponse> callback);
    }

    interface Local {

    }
}
