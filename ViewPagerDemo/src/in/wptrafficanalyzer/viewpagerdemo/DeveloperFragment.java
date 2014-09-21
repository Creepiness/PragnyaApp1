package in.wptrafficanalyzer.viewpagerdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;


public class DeveloperFragment extends Activity {
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
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_developer);
		
		
		CustomList adapter = new
				CustomList(DeveloperFragment.this, web, imageId);
		list=(ListView)findViewById(R.id.list);
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		                Toast.makeText(DeveloperFragment.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

		            }
		        });

				
				
				
	}
			
}
