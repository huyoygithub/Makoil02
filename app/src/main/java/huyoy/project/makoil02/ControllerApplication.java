package huyoy.project.makoil02;

import android.app.Application;
import android.content.Context;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import huyoy.project.makoil02.constant.Constants;

public class ControllerApplication extends Application {
//    private FirebaseDatabase mFirebaseDatabase;
//    private DatabaseReference mDatabaseReference;

    public static ControllerApplication get(Context context) {
        return (ControllerApplication) context.getApplicationContext();
    }


    @Override
    public void onCreate() {
        super.onCreate();
//        FirebaseApp.initializeApp(this);
//        mFirebaseDatabase = FirebaseDatabase.getInstance();

    }
//    public DatabaseReference getSetupDataPreference(){
//        return mFirebaseDatabase.getReference("/setting");
//    }
//    public DatabaseReference getOx1Preference(){
//        return mFirebaseDatabase.getReference("ox1");
//    }

}
