package framgia.com.demoretrofit.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryResponse {
    public static final String HD_WALLPAPER = "HD_WALLPAPER";
    @SerializedName(HD_WALLPAPER)
    @Expose
    private List<Category> mCategories;

    public List<Category> getCategories() {
        return mCategories;
    }

    public void setCategories(List<Category> categories) {
        mCategories = categories;
    }
}
