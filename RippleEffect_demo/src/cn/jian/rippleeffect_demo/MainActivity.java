package cn.jian.rippleeffect_demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.andexert.library.RippleView;


public class MainActivity extends Activity {

    ListView data_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RippleView rippleView = (RippleView) findViewById(R.id.rect);
        final TextView textView = (TextView) findViewById(R.id.rect_child);
        data_list=(ListView) findViewById(R.id.data_list);
        rippleView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.e("Sample", "Click Rect !");
            }
        });
        textView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.e("Sample", "Click rect child !");
            }
        });

       
       data_list.setAdapter(new MyAdpter());
//
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
//        recyclerView.setHasFixedSize(true);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//
//        CustomAdapter customAdapter = new CustomAdapter();
//        customAdapter.updateList(sourcesArrayList);
//
//        customAdapter.setOnTapListener(new OnTapListener()
//        {
//            @Override
//            public void onTapView(int position)
//            {
//                Log.e("MainActivity", "Tap item : " + position);
//            }
//        });
//        recyclerView.setAdapter(customAdapter);

    }
    
    
    private class MyAdpter extends BaseAdapter{

		@Override
		public int getCount() {
			
			// TODO Auto-generated method stub
			return 10;
			
		}

		@Override
		public Object getItem(int arg0) {
			
			// TODO Auto-generated method stub
			return null;
			
		}

		@Override
		public long getItemId(int arg0) {
			
			// TODO Auto-generated method stub
			return 0;
			
		}

		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			arg1=View.inflate(MainActivity.this, R.layout.row_view, null);
			return arg1;
			
		}
    	
    }


}
