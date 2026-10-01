package com.example.businesscarda1_dewal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.businesscarda1_dewal.ui.theme.BusinessCardA1_DewalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardA1_DewalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)){
                        Business(
                            text = "Samarpreet Singh Dewal",
                            size=30
                        )
                        Business(
                            text = "Computer Science Student @ CSI",
                            size=25
                        )
                        Business(
                            text="New York City, New York",
                            size=25
                                )
                        Business(
                            text="Phone Number: +1 (123) 456-6780",
                            size=22
                        )

                    }
                }
            }
        }
    }
}

    @Composable
    fun Business(text: String, modifier: Modifier = Modifier,size: Int) {
        Text(
            text = text,
            modifier = modifier,
            fontSize = size.sp,
        )
    }

