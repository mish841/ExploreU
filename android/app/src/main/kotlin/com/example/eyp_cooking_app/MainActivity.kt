package com.eyp.ExploreYourPassions;

import io.flutter.embedding.android.FlutterActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.FirebaseApp
import com.google.firebase.appcheck.FirebaseAppCheck
import com.google.firebase.appcheck.debug.DebugAppCheckProviderFactory
import com.google.firebase.appcheck.safetynet.SafetyNetAppCheckProviderFactory

class MainActivity: FlutterActivity() {
    // For Debug Only. Do not do this for Production
    override fun onCreate(savedInstanceState: Bundle?) {
        FirebaseApp.initializeApp(this)
        Log.e("MainActivity", "onCreate")
        val firebaseAppCheck = FirebaseAppCheck.getInstance()
        firebaseAppCheck.installAppCheckProviderFactory(DebugAppCheckProviderFactory.getInstance())
        super.onCreate(savedInstanceState)
    }
}