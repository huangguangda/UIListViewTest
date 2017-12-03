package cn.edu.gdmec.android.uilistviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<Fruit> (  );
    /*private String[] data = { "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango" };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        initFruits();
        FruitAdapter adapter = new FruitAdapter ( MainActivity.this, R.layout.fruit_item, fruitList );
        ListView listView = (ListView) findViewById ( R.id.list_view );
        listView.setAdapter ( adapter );
      /*  ArrayAdapter<String> adapter = new ArrayAdapter<String> ( MainActivity.this, R.layout.simple_list_item_1, data );
        ListView listView = (ListView) findViewById ( R.id.list_view );
        listView.setAdapter ( adapter );*/
    }
    private void initFruits(){

    }
}
