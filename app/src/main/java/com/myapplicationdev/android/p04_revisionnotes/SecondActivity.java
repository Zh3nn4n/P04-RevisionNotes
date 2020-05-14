package com.myapplicationdev.android.p04_revisionnotes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {
	ListView lv;
	ArrayAdapter aa;
	ArrayList<Note> note;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		//TODO implement the Custom ListView
		lv = (ListView) this.findViewById(R.id.lv);

		DBHelper db = new DBHelper(SecondActivity.this);
		note = db.getAllNotes();
		db.close();

		aa = new RevisionNotesArrayAdapter(this, R.layout.row, note);
		lv.setAdapter(aa);

	}


}
