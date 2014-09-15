package in.wptrafficanalyzer.viewpagerdemo;

import in.wptrafficanalyzer.viewpagerdemo.R;
import in.wptrafficanalyzer.viewpagerdemo.R.drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;


public class FragmentDeveloper extends Activity {
	ListView list;
	String[] web = {
		"Creep",
			"Robin",
			"Geek"
	} ;
	Integer[] imageId = {
			R.drawable.creep,
			R.drawable.pk,
			R.drawable.geek
			
			
			
	};
	
	//@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.fragment_developer);
//		
//		
//		CustomAdapter adapter = new CustomAdapter(null, null);
//		list=(ListView)findViewById(R.id.listEva);
//				list.setAdapter(adapter);
//				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//		            @Override
//		            public void onItemClick(AdapterView<?> parent, View view,
//		                                    int position, long id) {
//		                Toast.makeText(FragmentDeveloper.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
//
//		            }
//		        });
//
//				
//				
//				
//	}
			
}
