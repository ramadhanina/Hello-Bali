package id.sch.smktelkom_mlg.project.xirpl4091827.hellobali;

import com.firebase.client.Firebase;

/**
 * Created by Iitutsa on 01/12/2016.
 */
public class description extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
