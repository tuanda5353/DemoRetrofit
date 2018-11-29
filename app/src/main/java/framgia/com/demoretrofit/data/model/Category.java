package framgia.com.demoretrofit.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {
    public static final String TOTAL_WALLPAPER = "total_wallpaper";
    public static final String CATEGORY_IMAGE_THUMB = "category_image_thumb";
    public static final String CATEGORY_IMAGE = "category_image";
    public static final String CATEGORY_NAME = "category_name";
    public static final String CID = "cid";
    @Expose
    @SerializedName(TOTAL_WALLPAPER)
    private String mTotalWallpaper;
    @Expose
    @SerializedName(CATEGORY_IMAGE_THUMB)
    private String mCategoryImageThumb;
    @Expose
    @SerializedName(CATEGORY_IMAGE)
    private String mCategoryImage;
    @Expose
    @SerializedName(CATEGORY_NAME)
    private String mCategoryName;
    @Expose
    @SerializedName(CID)
    private String mCid;

    public String getTotalWallpaper() {
        return mTotalWallpaper;
    }

    public void setTotalWallpaper(String totalWallpaper) {
        mTotalWallpaper = totalWallpaper;
    }

    public String getCategoryImageThumb() {
        return mCategoryImageThumb;
    }

    public void setCategoryImageThumb(String categoryImageThumb) {
        mCategoryImageThumb = categoryImageThumb;
    }

    public String getCategoryImage() {
        return mCategoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        mCategoryImage = categoryImage;
    }

    public String getCategoryName() {
        return mCategoryName;
    }

    public void setCategoryName(String categoryName) {
        mCategoryName = categoryName;
    }

    public String getCid() {
        return mCid;
    }

    public void setCid(String cid) {
        mCid = cid;
    }

}
