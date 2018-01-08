package com.example.mujahid.calclight10;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  public   double result;

public  double first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onOne(View view){

        EditText textedit = (EditText) findViewById(R.id.editText);
        textedit.setText(textedit.getText() + "1");
        Button a = (Button) findViewById(R.id.one);
        Button b = (Button) findViewById(R.id.clear);
        if(!b.isEnabled()){
            b.setEnabled(true);
        }

        TextView textView = (TextView)findViewById(R.id.textView);
        if(textView.length()!=0){
        if(textView.getText().charAt(textedit.length()-1)=='*'){
            textedit.setText("");
            textedit.setText(textedit.getText() + "1");
        }}

    }
    public void onTwo(View view){
        EditText textedit = (EditText) findViewById(R.id.editText);
        textedit.setText(textedit.getText()+"2");

        Button b = (Button) findViewById(R.id.clear);
        if(!b.isEnabled()){
            b.setEnabled(true);
        }
        TextView textView = (TextView)findViewById(R.id.textView);
        if(textView.length()!=0){
        if(textView.getText().charAt(textedit.length()-1)=='*'){
            textedit.setText("");
            textedit.setText(textedit.getText()+"2");
        }}


    }
    public void onThree(View view){
        EditText textedit = (EditText) findViewById(R.id.editText);
        textedit.setText(textedit.getText() + "3");
        Button b = (Button) findViewById(R.id.clear);
        if(!b.isEnabled()){
            b.setEnabled(true);
        }


    }
    public void onFour(View view){
        EditText textedit = (EditText) findViewById(R.id.editText);
        textedit.setText(textedit.getText() + "4");

        Button b = (Button) findViewById(R.id.clear);
        if(!b.isEnabled()){
            b.setEnabled(true);
        }


    }
    public void onFive(View view){
        EditText textedit = (EditText) findViewById(R.id.editText);
        textedit.setText(textedit.getText() + "5");

        Button b = (Button) findViewById(R.id.clear);
        if(!b.isEnabled()){
            b.setEnabled(true);
        }

    }
    public void onSix(View view){
        EditText textedit = (EditText) findViewById(R.id.editText);
        textedit.setText(textedit.getText() + "6");
        Button b = (Button) findViewById(R.id.clear);
        if(!b.isEnabled()){
            b.setEnabled(true);
        }

    }


    public void onSeven(View view){
        EditText textedit = (EditText) findViewById(R.id.editText);
        textedit.setText(textedit.getText() + "7");
        Button b = (Button) findViewById(R.id.clear);
        if(!b.isEnabled()){
            b.setEnabled(true);
        }

    }


    public void onEight(View view){
        EditText textedit = (EditText) findViewById(R.id.editText);
        textedit.setText(textedit.getText() + "8");

        Button b = (Button) findViewById(R.id.clear);
        if(!b.isEnabled()){
            b.setEnabled(true);
        }

    }
    public void onNine(View view){
        EditText textedit = (EditText) findViewById(R.id.editText);
        textedit.setText(textedit.getText() + "9");
        Button b = (Button) findViewById(R.id.clear);
        if(!b.isEnabled()){
            b.setEnabled(true);
        }

    }
    public void onZero(View view){
        EditText textedit = (EditText) findViewById(R.id.editText);
        textedit.setText(textedit.getText() + "0");
        Button b = (Button) findViewById(R.id.clear);
        if(!b.isEnabled()){
            b.setEnabled(true);
        }

    }


    public  void onPoint(View view){
        EditText textedit = (EditText) findViewById(R.id.editText);
        textedit.setText(textedit.getText() + ".");
        Button b = (Button) findViewById(R.id.clear);
        if(!b.isEnabled()){
            b.setEnabled(true);
        }
    }
    public void onRest(View view){
        EditText text = (EditText)findViewById(R.id.editText);
        text.setText("");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("");
    }
    public void onClear(View view){
        EditText textedit = (EditText) findViewById(R.id.editText);
        Button clear = (Button) findViewById(R.id.clear);
        textedit.setText(textedit.getText().delete(textedit.getText().length() - 1, textedit.getText().length()));
        if (textedit.getText().length()==0){
            clear.setEnabled(false);
        } if(textedit.getText().length()>0){
            clear.setEnabled(true);
        }


    }
    public void onAdd(View view){
        EditText textedit = (EditText) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView);

        if(textView.length()==0){
          String c =   String.valueOf(textedit.getText().toString());

            textView.setText(c);
            first =(Double.parseDouble(textedit.getText().toString()));
            textedit.setText("");
        }else {

            if (textView.getText().length() != 0) {
                if (textView.getText().charAt(textView.length()-1) == '+') {

                    result = first + Double.parseDouble(textedit.getText().toString());
                    first = result;
                    textView.setText(String.valueOf(result) );
                    textedit.setText("");

                }
                else if (textView.getText().charAt(textView.length()-1) == '*') {

                    result = first * Double.parseDouble(textedit.getText().toString());
                    first = result;
                    textView.setText(String.valueOf(result) );
                    textedit.setText("");

                }  else if (textView.getText().charAt(textView.length()-1) == '-') {

                    result = first - Double.parseDouble(textedit.getText().toString());
                    first = result;
                    textView.setText(String.valueOf(result) );
                    textedit.setText("");

                }  else if (textView.getText().charAt(textView.length()-1) == '/') {

                    result = first / Double.parseDouble(textedit.getText().toString());
                    first = result;
                    textView.setText(String.valueOf(result) );
                    textedit.setText("");

                }
            }


        }
        if(textView.getText().length()!=0){
        if (textView.getText().charAt(textView.length()-1) != '+'||textView.getText().charAt(textView.length()-1) != '-'||textView.getText().charAt(textView.length()-1) != '*'||textView.getText().charAt(textView.length()-1) != '/'){
            textView.setText(String.valueOf(textView.getText().toString())+"+");
        }else{
            String take = textView.getText().toString();
            String took = take.replace(textView.getText().charAt(take.length()-1),'+');
            textView.setText(took);
        }

        }

    }
        public void devide(View view){
            EditText textedit = (EditText) findViewById(R.id.editText);
            TextView textView = (TextView) findViewById(R.id.textView);
            Button adds = (Button) findViewById(R.id.add);
            if(textView.length()==0){
                textView.setText(String.valueOf(textedit.getText().toString()));
                first =(Double.parseDouble(textedit.getText().toString()));
                textedit.setText("");
            }else {

                if (textView.getText().length() != 0) {
                    if (textView.getText().charAt(textView.length()-1) == '+') {

                        result = first + Double.parseDouble(textedit.getText().toString());
                        first = result;
                        textView.setText(String.valueOf(result));
                        textedit.setText("");

                    }
                    else if (textView.getText().charAt(textView.length()-1) == '*') {

                        result = first * Double.parseDouble(textedit.getText().toString());
                        first = result;
                        textView.setText(String.valueOf(result));
                        textedit.setText("");

                    }  else if (textView.getText().charAt(textView.length()-1) == '-') {

                        result = first - Double.parseDouble(textedit.getText().toString());
                        first = result;
                        textView.setText(String.valueOf(result) );
                        textedit.setText("");

                    }  else if (textView.getText().charAt(textView.length()-1) == '/') {

                        result = first / Double.parseDouble(textedit.getText().toString());
                        first = result;
                        textView.setText(String.valueOf(result) );
                        textedit.setText("");

                    }
                }


            }
            if(textView.getText().length()!=0){
            if (textView.getText().charAt(textView.length()-1) != '+'||textView.getText().charAt(textView.length()-1) != '-'||textView.getText().charAt(textView.length()-1) != '*'||textView.getText().charAt(textView.length()-1) != '/'){
                textView.setText(String.valueOf(textView.getText().toString())+"/");
            }else{
               textView.setText(String.valueOf(textView.getText().toString().substring(0,textView.length()-2))+'/');
            }



            }
    }
    public  void minus(View view){
        EditText textedit = (EditText) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView);
        Button adds = (Button) findViewById(R.id.add);
        if(textView.length()==0){
            textView.setText(String.valueOf(textedit.getText().toString()));
            first =(Double.parseDouble(textedit.getText().toString()));
            textedit.setText("");
        }else {

            if (textView.getText().length() != 0) {
                if (textView.getText().charAt(textView.length()-1) == '+') {

                    result = first + Double.parseDouble(textedit.getText().toString());
                    first = result;
                    textView.setText(String.valueOf(result) );
                    textedit.setText("");

                }
                else if (textView.getText().charAt(textView.length()-1) == '*') {

                    result = first * Double.parseDouble(textedit.getText().toString());
                    first = result;
                    textView.setText(String.valueOf(result) );
                    textedit.setText("");

                }  else if (textView.getText().charAt(textView.length()-1) == '-') {

                    result = first - Double.parseDouble(textedit.getText().toString());
                    first = result;
                    textView.setText(String.valueOf(result) );
                    textedit.setText("");

                }  else if (textView.getText().charAt(textView.length()-1) == '/') {

                    result = first / Double.parseDouble(textedit.getText().toString());
                    first = result;
                    textView.setText(String.valueOf(result) );
                    textedit.setText("");

                }
            }


        }
        if(textView.getText().length()!=0){
        if (textView.getText().charAt(textView.length()-1) != '+'||textView.getText().charAt(textView.length()-1) != '-'||textView.getText().charAt(textView.length()-1) != '*'||textView.getText().charAt(textView.length()-1) != '/'){
            textView.setText(String.valueOf(textView.getText().toString())+"-");
        }else{
            String take = textView.getText().toString();
            String took = take.replace(textView.getText().charAt(take.length()-1),'-');
            textView.setText(took);
        }

        }
    }


    public void onMulti(View view){
        EditText textedit = (EditText)findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView);
        if(textView.length()==0){
            textView.setText(String.valueOf(textedit.getText().toString()));
            first = Double.parseDouble(textedit.getText().toString());
            textedit.setText("");
        }else {

            if (textView.getText().length() != 0) {
                if (textView.getText().charAt(textView.length()-1) == '+') {

                    result = first + Double.parseDouble(textedit.getText().toString());
                    first = result;
                    textView.setText(String.valueOf(result) );
                    textedit.setText("");

                }
                else if (textView.getText().charAt(textView.length()-1) == '*') {

                    result = first * Double.parseDouble(textedit.getText().toString());
                    first = result;
                    textView.setText(String.valueOf(result) );
                    textedit.setText("");

                }  else if (textView.getText().charAt(textView.length()-1) == '-') {

                    result = first - Double.parseDouble(textedit.getText().toString());
                    first = result;
                    textView.setText(String.valueOf(result) );
                    textedit.setText("");

                }  else if (textView.getText().charAt(textView.length()-1) == '/') {

                    result = first / Double.parseDouble(textedit.getText().toString());
                    first = result;
                    textView.setText(String.valueOf(result));
                    textedit.setText("");

                }
            }


        }
        if(textView.getText().length()!=0){
        if (textView.getText().charAt(textView.length()-1) != '+'||textView.getText().charAt(textView.length()-1) != '-'||textView.getText().charAt(textView.length()-1) != '*'||textView.getText().charAt(textView.length()-1) != '/'){
            textView.setText(String.valueOf(textView.getText().toString())+"*");
        }else{
            String take = textView.getText().toString();
            String took = take.replace(textView.getText().charAt(take.length()-1),'*');
            textView.setText(took);
        }
    }}
    public void onequal(View view){

        EditText textedit = (EditText) findViewById(R.id.editText);

            TextView textView = (TextView) findViewById(R.id.textView);
        if (textView.getText().length() != 0) {
            if (textView.getText().charAt(textView.length()-1) == '+') {

                result = first + Double.parseDouble(textedit.getText().toString());
                first = result;
                textView.setText(String.valueOf(result) );
                textedit.setText("");

            }
            else if (textView.getText().charAt(textView.length()-1) == '*') {

                result = first * Double.parseDouble(textedit.getText().toString());
                first = result;
                textView.setText(String.valueOf(result) );
                textedit.setText("");

            }  else if (textView.getText().charAt(textView.length()-1) == '-') {

                result = first - Double.parseDouble(textedit.getText().toString());
                first = result;
                textView.setText(String.valueOf(result));
                textedit.setText("");

            }  else if (textView.getText().charAt(textView.length()-1) == '/') {

                result = first / Double.parseDouble(textedit.getText().toString());
                first = result;
                textView.setText(String.valueOf(result));
                textedit.setText("");

            }
        }

    }
public void onRoot(View view){
    EditText text = (EditText)findViewById(R.id.editText);
    TextView textView = (TextView ) findViewById(R.id.textView);
    textView.setText(String.valueOf(textView.getText())+String.format("sqrt(%d)", Integer.parseInt(text.getText().toString())));
    text.setText(String.valueOf(Math.sqrt(Integer.parseInt(text.getText().toString()))));
}
}


