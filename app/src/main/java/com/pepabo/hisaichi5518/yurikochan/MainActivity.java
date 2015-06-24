package com.pepabo.hisaichi5518.yurikochan;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    TextView praiseTextView;
    Button praiseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        praiseTextView = (TextView) findViewById(R.id.textView);
        praiseButton   = (Button)   findViewById(R.id.button);

        praiseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = fetchPraiseText();
                praiseTextView.setText(text);
            }

            private String fetchPraiseText () {
                return fetchName() + "、" + fetchMessage();
            }

            private String fetchName() {
                String names[] = {
                        "吉高", "由里子", "ゆりちゃん"
                };
                return fetchFromList(names);
            }
            private String fetchMessage() {
                String messages[] = {
                        "かわいい", "綺麗", "奥ゆかしい", "ビューティフル",
                        "まばゆい", "愛くるしい", "チャーミング", "めんこい",
                        "艷やか", "スイート", "愛らしい", "素敵", "あでやか",
                        "情欲をそそる"
                };
                return fetchFromList(messages);
            }

            private String fetchFromList (String[] list) {
                int i = new Random().nextInt(list.length);
                return list[i];
            }

        });
    }
}
