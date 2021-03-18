package com.example.transliterate

import android.icu.text.Transliterator
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var string = "wonder"
        var idList = Transliterator.getAvailableIDs();
        idList.iterator().forEach { Log.i(it, "list of transliterator ids"); }
        var transliterator = Transliterator.getInstance("Any-Devanagari");
        var orig = "I found a love for me" +
                " Oh darling, just dive right in and follow my lead" +
                " Well, I found a girl, beautiful and sweet" +
                " Oh, I never knew you were the someone waiting for me";
        var ans = transliterator.transliterate(string);
        Log.i(ans, "hindi text");

    }
}