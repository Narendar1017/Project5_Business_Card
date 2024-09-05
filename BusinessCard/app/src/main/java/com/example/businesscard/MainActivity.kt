package com.example.businesscard

import android.graphics.Color.rgb
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                ){
                    BusinessCardDesign(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun BusinessCardPreview(){
    BusinessCardDesign(modifier = Modifier.fillMaxSize())
}

@Composable
fun BusinessCardDesign(modifier: Modifier){
    val icon1 = painterResource(R.drawable.android_logo)
    val icon2 = painterResource(R.drawable.phone_24dp_e8eaed)
    val icon3 = painterResource(R.drawable.share_24dp_e8eaed)
    val icon4 = painterResource(R.drawable.email_24dp_e8eaed)
    Column(
        modifier = modifier.background(color = Color(rgb(210, 232, 212)))
    ) {
        Column(
            modifier = modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Icon(
                painter = icon1,
                contentDescription = null,
                modifier = Modifier
                    .background(color = Color(rgb(7, 48, 66)))
                    .size(100.dp),
                tint = Color.Unspecified
            )
            Text(
                text = "Jennifer Doe",
                fontSize = 36.sp,
                modifier = Modifier.padding(vertical = 12.dp),
                color = Color.Black
            )
            Text(
                text = "Android Developer Extraordinaire",
                color = Color(rgb(9, 111, 58)),
                fontSize = 13.sp
            )
        }
        Column(
            modifier = Modifier.padding(bottom = 24.dp).align(Alignment.CenterHorizontally),
        ) {
            Row(modifier = Modifier.padding(bottom = 6.dp)){
                Icon(
                    painter = icon2,
                    contentDescription = null,
                    tint = Color(rgb(9, 111, 58))
                )
                Text(
                    text = "+11 (123) 444 555 666",
                    color = Color.Black,
                    modifier = Modifier.padding(start = 6.dp)
                )
            }
            Row(modifier = Modifier.padding(bottom = 6.dp)) {
                Icon(
                    painter = icon3,
                    contentDescription = null,
                    tint = Color(rgb(9, 111, 58))
                )
                Text(
                    text = "@AndroidDev",
                    color = Color.Black,
                    modifier = Modifier.padding(start = 6.dp)
                )
            }
            Row(modifier = Modifier.padding(bottom = 6.dp)) {
                Icon(
                    painter = icon4,
                    contentDescription = null,
                    tint = Color(rgb(9, 111, 58))
                )
                Text(
                    text = "jen.doe@android.com",
                    color = Color.Black,
                    modifier = Modifier.padding(start = 6.dp)
                )
            }
        }
    }
}