package com.ulas.kotlincompose

import android.os.Bundle
import android.util.AndroidException
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ulas.kotlincompose.ui.theme.KotlinComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          MainScreen()
        }

    }
}

@Composable
fun MainScreen() {

    //Column , Row ,Box

    /*Column {

        Text(
            modifier = Modifier
                .background(color = Color.Yellow)
                .padding(top = 10.dp, start = 1.dp, end = 1.dp,bottom =30.dp)
                .clickable {
                           println("clicked")
                }
                .fillMaxWidth(),
                //.fillMaxSize(),
                //.size(width,height),
            text = "Hello Android",
            color = Color.Gray,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Hello world",
            color = Color.Gray,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    }

     */

   /* Row {

        Text(
            text = "Hello Android",
            color = Color.Gray,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Hello world",
            color = Color.Gray,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    }

    */

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        CustomText(text = "A.Ulaş Çankaya")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Hello Android")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "aulascankaya@gmail.com")
        Spacer(modifier = Modifier.padding(5.dp))

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomText(text = "Test1")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Test2")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Test3")
        }
        
    }
}

@Composable
fun CustomText(text : String){


        Text(
            modifier = Modifier
                .background(color = Color.Yellow)
                .padding(top = 10.dp, start = 1.dp, end = 1.dp, bottom = 30.dp)
                .clickable {
                    println("clicked")
                },
                //.width(150.dp),
                //.fillMaxWidth(),
            //.fillMaxSize(0.5f),
            //.size(width,height),
            text = text,
            color = Color.Gray,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
 MainScreen()
}