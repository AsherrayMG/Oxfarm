package com.example.wazitoecommerce.ui.theme.screens.details

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.LOGIN_URL
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController){
    Column ( modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.xfarm),
            contentScale = ContentScale.Fit
        )
        ,

        ){val coroutine = rememberCoroutineScope()
        coroutine.launch{
            delay(1000)
            navController.navigate(LOGIN_URL)

        }
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.farm))
        val progress by animateLottieCompositionAsState(composition)

        LottieAnimation(composition, progress,
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.Start)
        )

    }

}

@Preview(showBackground = true)
@Composable
fun MySplashPreview(){
   SplashScreen(  rememberNavController())

}