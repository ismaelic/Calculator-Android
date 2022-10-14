package com.rg.calculator_android_clone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rg.calculator_android_clone.ui.theme.CalculatorAndroidCloneTheme



class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            // Themes for this application
            CalculatorAndroidCloneTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,

                )
                // The content of this surface
                {

                        // https://developer.android.com/jetpack/compose/state#state-and-composition
                        // val (value, setValue) = remember { mutableStateOf(0) }
                        // var value by remember { mutableStateOf(0) }
                        // This way to handle the data its a little tricky
                        val mutableState = remember { mutableStateOf(0) }
                        ClickCounter(mutableState.value,fun (){
                            mutableState.value =mutableState.value +1
                        })
                }
            }
        }
    }


}

@Composable
fun ClickCounter(clicks: Int, onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text("I've been clicked $clicks times")
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true, name = "Simple Text")
@Composable
fun DefaultPreview() {
    CalculatorAndroidCloneTheme {
        Greeting("Android")
    }
}