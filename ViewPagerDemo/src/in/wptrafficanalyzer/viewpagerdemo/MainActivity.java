package in.wptrafficanalyzer.viewpagerdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseInstallation;
import com.parse.PushService;

public class MainActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Parse.initialize(this, "w6mbWD4IB5ULDqQhXGC15oLKoEGFHzyXrAx40Aj3", "bcD0xEr3T4W8S1dJPNiXVnt79mGH2WobC0Blm6Xd");
        	
        
        /** Getting a reference to the ViewPager defined the layout file */        
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        
        /** Getting fragment manager */
        FragmentManager fm = getSupportFragmentManager();
        
        /** Instantiating FragmentPagerAdapter */
        MyFragmentPagerAdapter pagerAdapter = new MyFragmentPagerAdapter(fm);
        
        /** Setting the pagerAdapter to the pager object */
        pager.setAdapter(pagerAdapter);
        
        PushService.setDefaultPushCallback(this, NotiHandler.class);
        ParseInstallation.getCurrentInstallation().saveInBackground();
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
