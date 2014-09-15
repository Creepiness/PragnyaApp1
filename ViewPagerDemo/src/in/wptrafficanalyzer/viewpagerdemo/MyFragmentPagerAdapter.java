package in.wptrafficanalyzer.viewpagerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter{
	
	final int PAGE_COUNT = 3;

	/** Constructor of the class */
	public MyFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	/** This method will be invoked when a page is requested to create */
	@Override
	public Fragment getItem(int arg0) {
		
//		MyFragment myFragment = new MyFragment();
//		Bundle data = new Bundle();
//		data.putInt("current_page", arg0+1);
//		myFragment.setArguments(data);
//		return myFragment;
		
		switch (arg0) {
		case 0:
			// home fragment activity
			return new FragmentHome();
		case 1:
			// Games fragment activity
			return new FragmentGames();
		case 2:
			// Movies fragment activity
			return new FragmentCcommittee();
		}

		return null;
	}

	/** Returns the number of pages */
	@Override
	public int getCount() {		
		return PAGE_COUNT;
	}
	
	@Override
	public CharSequence getPageTitle(int position) {		
		switch (position) {
		case 0:
			// Top Rated fragment activity
			return "Home";
		case 1:
			// Games fragment activity
			return "About";
		case 2:
			// corecommittee activity
			return "Core-Committee";
		}
		return null;
	}
	
	
	
	
}
