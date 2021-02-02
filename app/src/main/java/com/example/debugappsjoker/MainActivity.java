package com.example.debugappsjoker;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.debugappsjoker.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference notebookRef = db.collection("Notebook");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    public void search(View v) throws ParseException {
        // TODO adding data if contain date data
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        Date tanggal = formatter.parse("20/2/2021");
//        Note note = new Note("kopi setan","45k",tanggal);

        // TODO read date data
//        notebookRef.add(note);
//        notebookRef.get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
//            @Override
//            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
//                String data ="";
//                for(DocumentSnapshot documentSnapshot : queryDocumentSnapshots){
//                    Note note = documentSnapshot.toObject(Note.class);
//
//                    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//                    data += "Date : " + formatter.format(note.getTanggal()) + "\n\n";
//                }
//                binding.textViewDisplay.setText(data);
//            }
//        });

        // TODO search data of range date data have
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        Date startTanggal = formatter.parse("1/2/2021");
//        Date endTanggal = formatter.parse("7/2/2021");
//        notebookRef.orderBy("tanggal")
//                .startAt(startTanggal)
//                .endAt(endTanggal)
//                .get()
//                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
//                    @Override
//                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
//                        String data = "";
//                        for (DocumentSnapshot documentSnapshot : queryDocumentSnapshots) {
//                            Note note = documentSnapshot.toObject(Note.class);
//
//                            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//                            data += "Date : " + formatter.format(note.getTanggal()) + "\n\n";
//                        }
//                        binding.textViewDisplay.setText(data);
//                    }
//                });


        // TODO search each character in start at search edit view
//        Query test = notebookRef.orderBy("title")
//                .startAt(binding.editSearch.getText().toString())
//                .endAt(binding.editSearch.getText().toString() + "\uf8ff");
//        test.get()
//                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
//                    @Override
//                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
//                        String data = "";
//                        for (QueryDocumentSnapshot queryDocumentSnapshot : queryDocumentSnapshots) {
//                            Note note = queryDocumentSnapshot.toObject(Note.class);
//                            String title = note.getTitle();
//                            data += "\n Title : " + title;
//                        }
//                        binding.textViewDisplay.setText(data);
//                    }
//                });
    }
}