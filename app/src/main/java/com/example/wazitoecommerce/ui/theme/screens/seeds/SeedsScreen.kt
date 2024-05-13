package com.example.wazitoecommerce.ui.theme.screens.seeds

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R


class SeedsScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SeedsScreen(navController = rememberNavController())

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SeedsScreen(navController: NavHostController){
    Column (modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(
            title = { Text(text = "Buy seeds",color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),



        )
//End of topApp bar

        Column (modifier = Modifier
            .verticalScroll(rememberScrollState()))
        {
            Text(
                text = "Best Hybrid Seeds",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row (modifier = Modifier.padding(start = 25.dp)){
                //Column 1
                Column (){
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    )
                    {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.straw) ,
                                contentDescription = "inspiration",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Strawberry",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Quality Inputs",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Text(
                        text = "1kg @KSH.250",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0712706880".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("asherray9598@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a delivery")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email")
                        }
                    }

                    TextButton(onClick = { val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it)} }, ){
                        Text(text = "Pay", color = Color.Blue)

                    }
                }

                //End of column 1
                Spacer(modifier = Modifier.width(10.dp))
                //Column 1
                Column (){
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    )
                    {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.pawpawseed) ,
                                contentDescription = "inspiration",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Pawpaw",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Quality inputs",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Text(
                        text = "1kg @KSH.135",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0712706880".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("asherray9598@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a delivery")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email")
                        }
                    }

                    TextButton(onClick = { val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it)} }, ){
                        Text(text = "Pay", color = Color.Blue)

                    }
                }

                //End of column 1
            }
            //End of Row
            Spacer(modifier = Modifier.height(20.dp))

            //Row
            Row (modifier = Modifier.padding(start = 25.dp)){
                //Column 1
                Column (){
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    )
                    {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.mangoseed) ,
                                contentDescription = "inspiration",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Mango",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Quality seeds",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Text(
                        text = "1kg @KSH.150",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0712706880".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("asherray9598@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a delivery")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email")
                        }
                    }
                    TextButton(onClick = { val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it)} }, ){
                        Text(text = "Pay", color = Color.Blue)

                    }
                }

                //End of column 1
                Spacer(modifier = Modifier.width(10.dp))
                //Column 1
                Column (){
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    )
                    {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.tomatoseed) ,
                                contentDescription = "inspiration",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Tomato",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Quality seeds",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Text(
                        text = "1kg @KSH.100",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0712706880".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("asherray9598@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a delivery")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email")
                        }
                    }
                    TextButton(onClick = { val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it)} }, ){
                        Text(text = "Pay", color = Color.Blue)

                    }
                }

                //End of column 1
            }
            //End of Row
            Spacer(modifier = Modifier.height(20.dp))
            //Row
            Row (modifier = Modifier.padding(start = 25.dp)){
                //Column 1
                Column (){
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    )
                    {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.orangeseed) ,
                                contentDescription = "inspiration",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Orange",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Free imazalil pesticide",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Text(
                        text = "1kg @KSH.120",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0712706880".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("asherray9598@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a delivery")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email")
                        }
                    }
                    TextButton(onClick = { val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it)} }, ){
                        Text(text = "Pay", color = Color.Blue)

                    }
                }

                //End of column 1
                Spacer(modifier = Modifier.width(10.dp))
                //Column 1
                Column (){
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    )
                    {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.pearseed) ,
                                contentDescription = "inspiration",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Pear",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Quality",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Text(
                        text = "1gram @KSH.40",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0712706880".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("asherray9598@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a delivery")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email")
                        }
                    }
                    TextButton(onClick = { val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it)} }, ){
                        Text(text = "Pay", color = Color.Blue)

                    }
                }

                //End of column 1
            }
            //End of Row
            Spacer(modifier = Modifier.height(20.dp))
        }

    }

}

@Preview(showBackground = true)
@Composable
fun SeedsPreview(){
    SeedsScreen(navController = rememberNavController())
}
