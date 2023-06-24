package huyoy.project.makoil02.view.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import huyoy.project.makoil02.R;
import huyoy.project.makoil02.databinding.FragmentHomeBinding;
import huyoy.project.makoil02.model.Ox;


public class Home extends Fragment implements HomeInterface {

    private FragmentHomeBinding binding;
    private HomePresenter homePresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        homePresenter= new HomePresenter(this);
        onClick1();

    }

    private void onClick1() {

        binding.btnPutData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                int d=Integer.parseInt(binding.edtD.getText().toString().trim()+"f");
                int m=Integer.parseInt(binding.edtM.getText().toString().trim());
                int n=Integer.parseInt(binding.edtN.getText().toString().trim());
                int step=Integer.parseInt(binding.edtStep.getText().toString().trim()+"f");
                int nStep=Integer.parseInt(binding.edtNstep.getText().toString().trim());
                int mStep=Integer.parseInt( binding.edtMstep.getText().toString().trim());

                Ox ox1 = new Ox(d, m, n);
                Ox ox2= new Ox(step,mStep,nStep);
                homePresenter.putDataRealtime(Home.this,ox1,ox2);
                Toast.makeText(getActivity(),""+ox2.getX1(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void loadDataSuccess() {

    }

    @Override
    public void loadDataError() {

    }

    @Override
    public void putDataSuccess() {

    }

    @Override
    public void putDataError(String message) {

    }
}