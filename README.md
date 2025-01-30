# Day 11 : RecyclerView

```markdown
# RecyclerView in Android (Java)

`RecyclerView` is an efficient way to display large data sets in a scrollable list.

## 1. Add Dependency
```gradle
dependencies {
    implementation 'androidx.recyclerview:recyclerview:1.2.1'
}
```

## 2. Create Layout for Item
```xml
<!-- res/layout/item_layout.xml -->
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:padding="8dp">

    <TextView
        android:id="@+id/textViewItem"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="16sp"/>
</LinearLayout>
```

## 3. Create Adapter
```java
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<String> items;

    public MyAdapter(List<String> items) {
        this.items = items;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textViewItem);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
```

## 4. Set Up RecyclerView in Activity
```java
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> data = Arrays.asList("Item 1", "Item 2", "Item 3");
        MyAdapter adapter = new MyAdapter(data);
        recyclerView.setAdapter(adapter);
    }
}
```

## 5. RecyclerView XML
```xml
<!-- res/layout/activity_main.xml -->
<androidx.recyclerview.widget.RecyclerView
    android:id="@+id/recyclerView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>
```

### 🎯 Summary
- `RecyclerView.Adapter` manages data binding.
- `ViewHolder` optimizes item reuse.
- `LayoutManager` arranges items efficiently.

🚀 Now, you're ready to use `RecyclerView` in your Java-based Android app!
```

This guide provides a clean and minimalistic approach to setting up a `RecyclerView` in Java. Let me know if you need modifications! 🚀
