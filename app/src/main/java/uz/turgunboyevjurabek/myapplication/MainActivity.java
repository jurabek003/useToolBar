package uz.turgunboyevjurabek.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

import uz.turgunboyevjurabek.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
     RvAdapterr2 recakle;
    private ArrayList<Madels2> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Madels2("jurabek"+i,"turgunboyev"));
        }

        recakle= new RvAdapterr2(list);
        binding.rv.setAdapter(recakle);

    }
}