package artifox.cry.starbuzz;


public class Drink {
    private String mName;
    private String mDescription;
    private int mImageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino","Espresso, hot milk, and a steamed milk foam",R.drawable.cappuccino),
            new Drink("Filer","Highest quality beans roasted and brewed fresh",R.drawable.filter)
    };

    private Drink(String name, String description, int imageResourceId) {
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getName() {
        return mName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return mName;
    }
}
