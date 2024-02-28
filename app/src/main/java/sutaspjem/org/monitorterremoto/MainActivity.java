package sutaspjem.org.monitorterremoto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

import sutaspjem.org.monitorterremoto.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
        binding.eqRecycler.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<EarthQuake> eqList =new ArrayList<>();
        eqList.add(new EarthQuake("XXX120","Medellin",4.0,1230L,502.5,80.3));
        eqList.add(new EarthQuake("XY1201","Cali",4.0,1230L,502.5,80.3));
        eqList.add(new EarthQuake("XXX122","Bogota",4.0,1230L,502.5,80.3));
        eqList.add(new EarthQuake("XY123","Caracas",4.0,1230L,502.5,80.3));
        eqList.add(new EarthQuake("XXX124","La Palma",4.0,1230L,502.5,80.3));
        eqList.add(new EarthQuake("XY125","Quito",4.0,1230L,502.5,80.3));
        eqList.add(new EarthQuake("XXX126","Brasilia",4.0,1230L,502.5,80.3));
        eqList.add(new EarthQuake("XY127","Rio",4.0,1230L,502.5,80.3));
        eqList.add(new EarthQuake("XXX128","PLata",4.0,1230L,502.5,80.3));
        eqList.add(new EarthQuake("XY129","Colombia",4.0,1230L,502.5,80.3));
        EQAdapter adapter=new EQAdapter();



        binding.eqRecycler.setAdapter(adapter);
        adapter.submitList(eqList);

    }
}