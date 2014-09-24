package in.wptrafficanalyzer.viewpagerdemo;


import in.wptrafficanalyzer.viewpagerdemo.R;
import in.wptrafficanalyzer.viewpagerdemo.R.drawable;
import in.wptrafficanalyzer.viewpagerdemo.R.id;
import in.wptrafficanalyzer.viewpagerdemo.R.layout;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentCcommittee extends Fragment {
	 public static final String[] titles = new String[] {"Tushar Karumudi",
		 "Pragathi Kulkarni",
         "Hemanth Kotaru", 
         "Eva Soni", 
         "Sharath", 
         "Chaitanya Pramod",
         "Srikruthi J",
         "B Sowmya", 
         " Akash", 
         "Karthik G.", 
         "Siri", 
         "Raveena R",
         "Luqmaan",
         "Ujwal Reddy",
         " Naveen",
         "Pavan Sai Adithya",
         "Prabhath Kollimarla",
         "V.V.S Sandeep", 
         "Srikanth", 
         "Bharath", 
         "Abhinay Byrisetty",
         "Varsha Doli",
         "Anusha K", 
         "Prashanth",
         "Shashank", 
         "Jayanth", 
         "Vivek Vardhan Reddy",
         "Narendra",
         "Shruthi Kavya",
         "Sai Teja Mahadev",
         "Rohit Walia",
         "Naveen"};
	 

 public static final String[] descriptions = new String[] {
         "Treasury",
         "Treasury",
         "Event Management",
         "Event Management",
         "Workshops",
         "Workshops",
         "Documentation",
         "Documentation",
         "Publicity",
         "Publicity",
         "Publicity",
         "Publicity",
         "Publicity",
         "Publicity",
         "Publicity",
         "Resource Management",
         "Resource Management",
         "Resource Management",
         "Resource Management",
         "Resource Management",
         "Volunteer Management",
         "Volunteer Management",
         "Certificates",
         "Web Team & Photoshop",
         "Web Team & Photoshop",
         "Web Team & Photoshop",
         "Sponsership",
         "Sponsership",
         "Hospatility",
         "Hospatility"};

 public static final Integer[] images = {
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2,
	 R.drawable.onlypcool2
	 };

 ListView listView;
 List<RowItem> rowItems;
 private CustomListViewAdapter arrayadapter;

 @Override
// public void onCreate(Bundle savedInstanceState) {
//     super.onCreate(savedInstanceState);
//     setContentView(R.layout.execom_fragment);
//     
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
    		 Bundle savedInstanceState) {  
	 
	 
	 try{	    
		 View rootView = rootView = inflater.inflate(R.layout.fragment_committee, container, false);
    }
    catch (InflateException e){
    }
     
     rowItems = new ArrayList<RowItem>();
     for (int i = 0; i < titles.length; i++) {
         RowItem item = new RowItem(images[i], titles[i], descriptions[i]);
         rowItems.add(item);
     }

     listView = (ListView) rootView.findViewById(R.id.list);
     arrayadapter = new CustomListViewAdapter(this.getActivity().getApplicationContext() ,R.layout.fragment_committee, rowItems);//error here even if the constructor is present its saying not defined
     listView.setAdapter(arrayadapter);
     //listView.setOnItemClickListener(this);//error here
     return rootView;
 }

}

