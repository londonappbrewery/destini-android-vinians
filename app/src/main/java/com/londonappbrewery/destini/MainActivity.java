package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

	// TODO: Steps 4 & 8 - Declare member variables here:
	private TextView storyTextView;
	private Button   buttonTop;
	private Button   buttonBottom;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		storyTextView = (TextView) findViewById(R.id.storyTextView);
		buttonTop = (Button) findViewById(R.id.buttonTop);
		buttonBottom = (Button) findViewById(R.id.buttonBottom);

		buttonTop.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Button btn = (Button) view;
				String text = btn.getText().toString();

				if (text.equals(getResources().getString(R.string.T1_Ans1))) {
					storyTextView.setText(R.string.T3_Story);
					buttonTop.setText(R.string.T3_Ans1);
					buttonBottom.setText(R.string.T3_Ans2);
				}
				if (text.equals(getResources().getString(R.string.T3_Ans1))) {
					storyTextView.setText(R.string.T6_End);
					buttonTop.setText("");
					buttonBottom.setText("");
				}
				if (text.equals(getResources().getString(R.string.T2_Ans1))) {
					storyTextView.setText(R.string.T3_Story);
					buttonTop.setText(R.string.T3_Ans1);
					buttonBottom.setText(R.string.T3_Ans2);
				}
				if (text.equals(getResources().getString(R.string.T3_Ans1))) {
					storyTextView.setText(R.string.T6_End);
					buttonTop.setText("");
					buttonBottom.setText("");
				}

			}
		});

		buttonBottom.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Button btn = (Button) view;
				String text = btn.getText().toString();

				if (text.equals(getResources().getString(R.string.T1_Ans2))) {
					storyTextView.setText(R.string.T2_Story);
					buttonTop.setText(R.string.T2_Ans1);
					buttonBottom.setText(R.string.T2_Ans2);
				}

				if (text.equals(getResources().getString(R.string.T2_Ans1))) {
					storyTextView.setText(R.string.T3_Story);
					buttonTop.setText(R.string.T3_Ans1);
					buttonBottom.setText(R.string.T3_Ans2);
				}

				if (text.equals(getResources().getString(R.string.T3_Ans2))) {
					storyTextView.setText(R.string.T5_End);
					buttonTop.setText("");
					buttonBottom.setText("");
				}

				if (text.equals(getResources().getString(R.string.T2_Ans2))) {
					storyTextView.setText(R.string.T4_End);
					buttonTop.setText("");
					buttonBottom.setText("");
				}
			}
		});


	}
}
