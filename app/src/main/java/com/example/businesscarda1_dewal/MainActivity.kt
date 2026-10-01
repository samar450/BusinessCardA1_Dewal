package com.example.businesscarda1_dewal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscarda1_dewal.ui.theme.BusinessCardA1_DewalTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            BusinessCardA1_DewalTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    BusinessCard(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun BusinessCard(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(
                id = R.drawable.nyc
            ),
            contentDescription = "nyc picture"
        )

        Text(
            text = "Samarpreet Singh Dewal",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "Computer Science Student @ CSI",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp)
        )

        Text(
            text = "New York City, New York",
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 24.dp)
        )

        Text(
            text = "Phone Number: +1 (123) 456-6780",
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 8.dp)
        )

        Text(
            text = "Email: sdewal450@gmail.com",
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {

    BusinessCardA1_DewalTheme {
        BusinessCard()
    }
}