package framgia.com.demoretrofit.screen.category;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import framgia.com.demoretrofit.R;
import framgia.com.demoretrofit.data.model.Category;
import framgia.com.demoretrofit.data.repository.CategoryRepository;
import framgia.com.demoretrofit.data.source.remote.CategoryRemoteDataSource;
import framgia.com.demoretrofit.screen.base.BaseActivity;

public class CategoryActivity extends BaseActivity implements CategoryContract.View {
    private CategoryPresenter mPresenter;
    private CategoryAdapter mAdapter;
    private List<Category> mCategories;

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_category;
    }

    @Override
    protected void initComponents() {
        RecyclerView recyclerView = findViewById(R.id.recycler_category);
        mCategories = new ArrayList<>();
        mAdapter = new CategoryAdapter(this, mCategories);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void initDatas() {
        mPresenter = new CategoryPresenter(CategoryRepository.getInstance(CategoryRemoteDataSource.getInstance()));
        mPresenter.setView(this);
        mPresenter.getAllCategory();
    }

    @Override
    public void onGetCategoriesSuccess(List<Category> categories) {
        mAdapter.addData(categories);
    }

    @Override
    public void onGetCategoriesFailed(Throwable t) {
        Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
