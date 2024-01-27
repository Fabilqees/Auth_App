package com.example.auth_app.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.auth_app.ui.theme.Pink80
import com.example.auth_app.ui.theme.Purple80
import com.example.auth_app.viewmodels.AuthViewModel

@androidx.compose.runtime.Composable
fun HomeScreen(authViewModel: AuthViewModel) {
  Column {
    Text(
      modifier = Modifier.padding(30.dp),
      text = "Home Screen Under Construction"
    )

    Button(onClick = {authViewModel.signout()}) {
      Text(
        text = "Signout",
        textAlign = TextAlign.End,
        modifier = Modifier
          .background(
            brush = Brush.horizontalGradient(listOf(Pink80, Purple80))
          )

      )
    }
  }

}