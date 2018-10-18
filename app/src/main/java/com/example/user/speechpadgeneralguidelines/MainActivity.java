package com.example.user.speechpadgeneralguidelines;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewStub;

public class MainActivity extends AppCompatActivity implements ViewStub.OnClickListener{
    private CardView filler_card, general_card, speaker_id, inaudible_speech,
            utterance, timestamp, validation_error, grammer, visit_site;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filler_card = (CardView) findViewById(R.id.fillerwords);
        general_card = (CardView) findViewById(R.id.general);
        speaker_id = (CardView) findViewById(R.id.speakerid);
        inaudible_speech = (CardView) findViewById(R.id.inaudible);
        utterance = (CardView) findViewById(R.id.utterances);
        timestamp = (CardView) findViewById(R.id.timestamp);
        validation_error = (CardView) findViewById(R.id.validationerrors);
        grammer = (CardView) findViewById(R.id.grammar);
        visit_site = (CardView) findViewById(R.id.visitsite);

        filler_card.setOnClickListener(this);
        general_card.setOnClickListener(this);
        speaker_id.setOnClickListener(this);
        inaudible_speech.setOnClickListener(this);
        utterance.setOnClickListener(this);
        timestamp.setOnClickListener(this);
        validation_error.setOnClickListener(this);
        grammer.setOnClickListener(this);
        visit_site.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.general: i = new Intent(this, GeneralText.class); startActivity(i); break;
            case R.id.fillerwords: i = new Intent(this, FillerWords.class); startActivity(i); break;
            case R.id.speakerid: i = new Intent(this, SpeakerID.class); startActivity(i); break;
            case R.id.inaudible: i = new Intent(this, InaudibleAcitivity.class); startActivity(i); break;
            case R.id.utterances: i = new Intent(this, UtteranceActivity.class); startActivity(i); break;
            case R.id.timestamp: i = new Intent(this, TimestampActivity.class); startActivity(i); break;
            case R.id.validationerrors: i = new Intent(this, ValidationActivity.class); startActivity(i); break;
            case R.id.grammar: i = new Intent(this, GrammerActivity.class); startActivity(i); break;
            case R.id.visitsite:
                Uri webPage = Uri.parse("https://www.speechpad.com/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webPage);
                startActivity(webIntent);
        }
    }
}
