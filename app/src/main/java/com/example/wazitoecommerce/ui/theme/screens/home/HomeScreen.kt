package com.example.wazitoecommerce.ui.theme.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.SEEDS_URL
import com.example.wazitoecommerce.navigation.TIPS_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(

            bottomBar = {
                NavigationBar {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =

                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }
                }
            },
            topBar = {
                TopAppBar(
                    title = { Text(text = "Fruticulture",color = Color.White, fontFamily = FontFamily.Monospace) },
                    colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black))

            },


            floatingActionButton = {
                FloatingActionButton(onClick = { }) {
                    IconButton(onClick = { navController.navigate(SEEDS_URL) }) {
                        Icon(imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "menu")
                    }
                }
            },
            //Content Section
            content = @Composable{
                Column(
                    modifier = Modifier.fillMaxSize()
                ){
                    val mContext = LocalContext.current



//End of topApp bar
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(painter = painterResource(id = R.drawable.frut),
                            contentDescription = "frut",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)
                        Text(text = "",
                            fontSize = 35.sp,
                            fontFamily = FontFamily.Cursive)
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Most Popular ",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 20.dp))
                    Spacer(modifier = Modifier.height(10.dp))
                    Row (modifier = Modifier
                        .horizontalScroll(rememberScrollState())){
                        //Card1
                        Card(modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                        ) {
                            Column {
                                Box (modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.strawberry), contentDescription = "newyork",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)
                                }
                                Text(text = "Strawberry",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )
                            }

                        }
//End of card1

                        Spacer(modifier = Modifier.width(8.dp))
                        //Card2
                        Card(modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                        ) {
                            Column {
                                Box (modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.tomato), contentDescription = "newyork",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)
                                }
                                Text(text = "Tomato",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )
                            }

                        }
//End of card2

                        Spacer(modifier = Modifier.width(8.dp))

                        //Card3
                        Card(modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                        ) {
                            Column {
                                Box (modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.banana), contentDescription = "newyork",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)
                                }
                                Text(text = "Banana",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )
                            }

                        }
//End of card3

                        Spacer(modifier = Modifier.width(8.dp))

                        //Card4
                        Card(modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                        ) {
                            Column {
                                Box (modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.melon), contentDescription = "newyork",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)
                                }
                                Text(text = "melon",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )
                            }

                        }
//End of card4

                        Spacer(modifier = Modifier.width(8.dp))

                        //Card5
                        Card(modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                        ) {
                            Column {
                                Box (modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.grapes), contentDescription = "newyork",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)
                                }
                                Text(text = "grapes",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )
                            }

                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        //End of card5
                        //Card6
                        Card(modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                        ) {
                            Column {
                                Box (modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.mango), contentDescription = "newyork",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)
                                }
                                Text(text = "mango",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )
                            }

                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        //End of card6
                        //Card7
                        Card(modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                        ) {
                            Column {
                                Box (modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.pear), contentDescription = "newyork",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)
                                }
                                Text(text = "pear",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )
                            }

                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        //End of card7
                        //Card8
                        Card(modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                        ) {
                            Column {
                                Box (modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.pawpaw), contentDescription = "newyork",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)
                                }
                                Text(text = "papaw",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )
                            }

                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        //End of card8
                        //Card9
                        Card(modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                        ) {
                            Column {
                                Box (modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.pinnaple), contentDescription = "newyork",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)
                                }
                                Text(text = "pinaple",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )
                            }

                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        //End of card9

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                  Card (modifier = Modifier
                      .fillMaxWidth()
                      .height(210.dp)){

                      Text(text = "\"Agriculture is our wisest pursuit, because it will in the end contribute most to real wealth, good morals & happiness.\"\n" +
                              "-Thomas Jefferson", fontWeight = FontWeight.Bold)

                      Box (modifier = Modifier.align(Alignment.CenterHorizontally)){
                          OutlinedButton(onClick = { navController.navigate(TIPS_URL) }) {
                              Text(text = "Agri Tips", )

                          }
                      }

                  }


                }

            }

        )

    }
}



val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "Add plant",
        route="add_products",
        selectedIcon=Icons.Filled.Add,
        unselectedIcon=Icons.Outlined.Add,
        hasNews = true,
        badges=0
    ),

    BottomNavItem(
        title = "Plants List",
        route="view_products",
        selectedIcon=Icons.Filled.List,
        unselectedIcon=Icons.Outlined.List,
        hasNews = true,
        badges=0
    ),


    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon :ImageVector,
    val hasNews :Boolean,
    val badges :Int
)



@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    WazitoECommerceTheme {
        HomeScreen(navController = rememberNavController())
    }
}