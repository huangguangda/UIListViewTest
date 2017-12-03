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
        Fruit apple = new Fruit ( "Apple", R.drawable.add );
        fruitList.add ( apple );
        Fruit banana = new Fruit ( "Banana", R.drawable.add );
        fruitList.add ( banana );
        Fruit orange = new Fruit ( "Orange", R.drawable.add );
        fruitList.add ( orange );
        Fruit watermelon = new Fruit ( "Watermelon", R.drawable.add );
        fruitList.add ( watermelon );
        Fruit pear = new Fruit ( "Pear", R.drawable.add );
        fruitList.add ( pear );
        Fruit grape = new Fruit ( "Grape", R.drawable.add );
        fruitList.add ( grape );
        Fruit pineapple = new Fruit ( "Pineapple", R.drawable.add );
        fruitList.add ( pineapple );
        Fruit strawberry = new Fruit ( "Strawberry", R.drawable.add );
        fruitList.add ( strawberry );
        Fruit cherry = new Fruit ( "Cherry", R.drawable.add );
        fruitList.add ( cherry );
        Fruit mango = new Fruit ( "Mango", R.drawable.add );
        fruitList.add ( mango );

    }
}
