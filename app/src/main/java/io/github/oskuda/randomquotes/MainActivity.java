package io.github.oskuda.randomquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String myArray[]={"Premature optimization is the root of all evil (or at least most of it)\nin programming.\n-- Donald Knuth"
            ,"To follow the path:\n" +
            "    look to the master,\n" +
            "    follow the master,\n" +
            "    walk with the master,\n" +
            "    see through the master,\n" +
            "    become the master.\n" +
            "-- Modern zen Poem"
            ,"No problem should ever have to be solved twice.\n" +
            "-- Eric S. Raymond, How to become a hacker\n"
    ,"Attitude is no substitute for competence.\n" +
            "-- Eric S. Raymond, How to become a hacker"
            ,"Fools ignore complexity. Pragmatists suffer it. Some can avoid it.\n" +
            "Geniuses remove it.\n" +
            "-- Alan J. Perlis (Epigrams in programming)"
            ,"You think you know when you learn, are more sure when you can write,\n" +
            "even more when you can teach, but certain when you can program.\n" +
            "-- Alan J. Perlis (Epigrams in programming)",
    "Don't worry about what anybody else is going to do. The best way to\n" +
            "predict the future is to invent it.\n" +
            "-- Alan Kay\n",
            "Premature optimization is the root of all evil (or at least most of it)\n" +
            "in programming.\n" +
            "-- Donald Knuth"
    ,"A little learning is a dangerous thing.\n" +
            "-- Alexander Pope"
            ,"Computer science education cannot make anybody an expert programmer any\n" +
            "more than studying brushes and pigment can make somebody an expert\n" +
            "painter.\n" +
            "-- Eric Raymond"
    ,"Students should be evaluated on how well they can achieve the goals they\n" +
            "strived to achieve within a realistic context. Students need to learn to\n" +
            "do things, not know things.\n" +
            "-- Roger Schank, Engines for Education"
    ,"La tactique, c'est ce que vous faites quand il y a quelque chose à\n" +
            "faire; la stratégie, c'est ce que vous faites quand il n'y a rien à\n" +
            "faire.\n" +
            "-- Xavier Tartacover"};

    private int randomNum=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onImgClick(View view){
        TextView quoteText = findViewById(R.id.edtQuote);
        quoteText.setTextAlignment(view.TEXT_ALIGNMENT_VIEW_START);
        quoteText.setText(myArray[(int)(Math.random()*myArray.length)]);
    }

}