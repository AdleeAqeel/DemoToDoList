package sg.edu.rp.id22020682.com.myapplicationdev.android.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView itemList;
    ArrayAdapter<ToDoItem> aa;
    ArrayList<ToDoItem> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemList = findViewById(R.id.itemList);
        al =new ArrayList<>();

        ToDoItem item1 = new ToDoItem("Go for movie ",1/8/2020);
        ToDoItem item2 = new ToDoItem("Go for haircut ",2/8/2020);



        al.add(item1);
        al.add(item2);

        CustomAdapter CustomAdapter = new CustomAdapter(this, R.layout.row, al);

        itemList.setAdapter(CustomAdapter);


    }
}