package com.rg.calculator_android_clone.ui.calculatorButtons

import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.ui.tooling.preview.Preview
import com.rg.calculator_android_clone.ui.theme.CalculatorAndroidCloneTheme

// TODO: Research for a new icon for this part

@Composable
fun IconButtonCalculator(onClick : () -> Unit = {}){
    IconButton(onClick = onClick) {
        Icon(Icons.Rounded.Delete, contentDescription = "Localized description")
    }
}

@Preview(showBackground = true)
@Composable
fun IconButtonCalculatorPreview(){
    CalculatorAndroidCloneTheme {
        IconButtonCalculator()
    }
}