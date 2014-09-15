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
import android.widget.ListView;

public class FragmentContacts extends Fragment {

	final String[] items = new String[] { "Android", "iPhone", "WindowsMobile",
            "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
       "Linux", "OS/2" };
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_games, container, false);
		ListView list = (ListView)rootView.findViewById(R.id.listView1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
        list.setAdapter(adapter);
		return rootView;
	}
}

