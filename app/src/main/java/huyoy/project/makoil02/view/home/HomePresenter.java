package huyoy.project.makoil02.view.home;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import huyoy.project.makoil02.model.Ox;

public class HomePresenter {
    private final HomeInterface homeInterface;
    private DatabaseReference mReference;
    private FirebaseDatabase db;

    public HomePresenter(HomeInterface homeInterface) {
        this.homeInterface = homeInterface;
    }

    public void putDataRealtime(Home context, Ox ox1, Ox ox2) {
        if (context==null){
            return;
        }
        db=FirebaseDatabase.getInstance();
        mReference=db.getReference("setting");
        mReference.child("OX1").setValue(ox1).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    homeInterface.putDataSuccess();
                }else {
                    homeInterface.putDataError(task.getException().getMessage());

                }


            }
        });
        mReference.child("OX2").setValue(ox2).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    homeInterface.putDataSuccess();
                }else {
                    homeInterface.putDataError(task.getException().getMessage());
                }

            }
        });

    }
}
