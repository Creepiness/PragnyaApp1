package in.wptrafficanalyzer.viewpagerdemo;

import in.wptrafficanalyzer.viewpagerdemo.R;
import in.wptrafficanalyzer.viewpagerdemo.R.id;
import in.wptrafficanalyzer.viewpagerdemo.R.layout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class CopyOfFragmentSponsers extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.example, container, false);
		super.onCreate(savedInstanceState);
	    int iconSize=getResources().getDimensionPixelSize(android.R.dimen.app_icon_size);
	    GridView gridview = (GridView) view.findViewById(R.id.gridview);
	  
	    
	    
	    

//	View rootView = inflater.inflate(R.layout.fragment_games, container, false);
//	ListView list = (ListView)rootView.findViewById(R.id.listView1);
//	ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
//    list.setAdapter(adapter);
//	return rootView;
	    
//	    View view = inflater.inflate(R.layout.main, container, false);
//
//	    super.onCreate(savedInstanceState);
//	    int iconSize=getResources().getDimensionPixelSize(android.R.dimen.app_icon_size);
//
//	     GridView gridview = (GridView) view.findViewById(R.id.icon_grid);
//	    gridview.setAdapter(new IconAdapter(this, iconSize));
//	    gridview.setOnItemClickListener(this);
//	    CONTENT_URI=Uri.parse("content://"+iconsProvider.class.getCanonicalName());
    return view;
//	        }
//	    });
	}
}

