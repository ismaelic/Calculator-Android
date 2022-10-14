package com.rg.calculator_android_clone.ui.calculatorButtons

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rg.calculator_android_clone.ui.theme.CalculatorAndroidCloneTheme

@Composable
fun NumberButton(number :Int,onClick : () -> Unit = { print("Missing onClick")}){
    Button(onClick =onClick,
        shape = CircleShape,
        modifier= Modifier.size(50.dp),
        ){
        Text(number.toString())
    }
}

@Preview(name = "Light Mode", showBackground = true)
@Preview(name = "DarkMode", uiMode = UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun NumberButtonPreview(){
    CalculatorAndroidCloneTheme {
        NumberButton(5)
    }
}


