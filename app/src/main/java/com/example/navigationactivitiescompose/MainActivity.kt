package com.example.navigationactivitiescompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.example.navigationactivitiescompose.navigation.AppNavGraph
import com.example.navigationactivitiescompose.ui.theme.NavigationActivitiesComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("NAV", "MainActivity created (Compose app)")

        setContent {
            NavigationActivitiesComposeTheme {
                Surface {
                    AppNavGraph()
                }
            }
        }
    }
}

