package com.example.wazitoecommerce.ui.theme.screens.tips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R











class TipsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TipsScreen(navController = rememberNavController())

        }
    }
}

@Composable
fun TipsScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Card (
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()
                .padding(10.dp)
        ){
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(painter = painterResource(id = R.drawable.tips),
                    contentDescription = "tips",
                    modifier = Modifier
                        .fillMaxSize()
                        .height(300.dp),
                    contentScale = ContentScale.Crop)

            }

        }
        Spacer(modifier = Modifier.height(5.dp))

      Card (modifier = Modifier.align(Alignment.CenterHorizontally)){
          Text(text = "6 Tips For Beginners Who Want To Start Fruit Farming.", fontWeight = FontWeight.Bold, fontSize = 30.sp)

          Text(text = "Fruit farming isn’t always easy, especially if you’re just starting out, but it can be extremely lucrative if you put in the hard work and find some helpful tips along the way. This guide provides 9 of those tips so you can start fruit farming without fear or worry that your efforts will go to waste. Whether you’re planning on growing fruit in an urban backyard, community garden, or a rural farm, these tips will help you learn how to start fruit farming successfully.",fontSize = 16.sp)

          Text(text = "\n" +
                  "\n" +
                  "1) Do your research: Its very Important For Fruit Farming\n" )
          Image(painter = painterResource(id = R.drawable.research),
              contentDescription = "tips",
              modifier = Modifier
                  .fillMaxSize()
                  .height(300.dp),
              contentScale = ContentScale.Crop)
          Text(text =
          "Fruit farming can be a fulfilling way to live a more self-sufficient lifestyle. There are many reasons why people decide to start fruit farming, but the most important thing is that it’s not too late to start! Here are ten tips for beginners who want to start fruit farming:\n" +
                  "\n" +
                  "    Gather information and resources — before you begin any work on your farm, it is important that you gather as much information as possible about what has been done in the past and what might work best for you. Resources like books, websites, university extension offices, non-profit organizations, and government programs can all be helpful in getting started.\n" +
                  "\n" +
                  "2) Consider Your Climate: Essential For Fruit Farming\n" )
          Image(painter = painterResource(id = R.drawable.climate),
              contentDescription = "tips",
              modifier = Modifier
                  .fillMaxSize()
                  .height(300.dp),
              contentScale = ContentScale.Crop)
          Text(text =
          "The first thing to consider is your climate. The USDA Plant Hardiness Zone map is a great place to start. This map divides the United States into different zones based on the average annual minimum temperature, with zone 1 being the warmest and zone 5 being the coldest. It also tells you what types of plants will grow in that zone, which can help you decide which fruit trees are best for your climate.\n" +
                  "\n" +
                  "3) Choose Your Crops: Choose A Crops Variety For Fruit Farming\n")
          Image(painter = painterResource(id = R.drawable.pest),
              contentDescription = "tips",
              modifier = Modifier
                  .fillMaxSize()
                  .height(300.dp),
              contentScale = ContentScale.Crop)
          Text(text = "\n" +
                  "    There are many different types of fruits that can be grown and it’s important to choose a type that is easy to grow in your area. If you live in a cold climate, the fruit trees will not produce fruit or they will produce less. Oranges, lemons, grapefruit, and avocados are some of the fruits that require warmer climates and have lower production rates in colder regions. Kiwis grow best in cool climates so if you live where winters are cold, this is a good choice for you as well.\n" +
                  "    It’s also important to do your research before purchasing any plants or seedlings because different types of fruit trees take different amounts of time to mature.\n" +
                  "\n" +

                  "\n" +
                  "4) Consider Your Soil: Important For Fruit Farming\n" )
          Image(painter = painterResource(id = R.drawable.soil),
              contentDescription = "tips",
              modifier = Modifier
                  .fillMaxSize()
                  .height(300.dp),
              contentScale = ContentScale.Crop)
          Text(text =
          "Fruit farming is a lot of work. The process starts with the soil. You need to prepare it before you plant your trees and bushes, or they will not grow well. But first, you need to figure out what kind of soil you have in your yard. If it’s rocky and hard, there are no use planting fruit trees here because they won’t be able to get their roots into the ground. If it’s sandy and dry, water will run through too quickly and the plants won’t be able to make enough food for themselves or take up enough nutrients from the soil. If you’ve got loamy soil that stays moist but doesn’t get too wet, then this is what you want for fruit farming.\n5) Watch for Pests and Disease\n" )
          Image(painter = painterResource(id = R.drawable.pest ),
              contentDescription = "tips",
              modifier = Modifier
                  .fillMaxSize()
                  .height(300.dp),
              contentScale = ContentScale.Crop)
          Text(text =
          "This one is probably the most essential of the seven important fruit tree planting tips for beginners. Not only can pests and diseases rob you of your delicious fruit, but they can also deeply impact your tree’s health.\n" +
                  "\n" +
                  "Although it may be tempting to use chemical-based pesticides to keep the bugs and animals away, they can be very harmful to the tree itself. Consider natural solutions for keeping the pests away instead. If you live in an area with a high deer population, you should also consider fencing in your tree.\n" +
                  "\n" +
                  "If you notice any signs of disease, there are organic plant sprays you can buy to get rid of the disease gently. However, the best disease prevention is proper pruning and airflow to the tree.\n" +
                  "\n" +
                  "It’s best to keep an eye on your tree and other plants during the spring season to catch anything unusual before it gets out of hand.\n" )
          Text(text = "6) Proper Watering Is Key\n")
          Image(painter = painterResource(id = R.drawable.w2),
              contentDescription = "tips",
              modifier = Modifier
                  .fillMaxSize()
                  .height(300.dp),
              contentScale = ContentScale.Crop)
          Text(text =
          "The first growing season is crucial for your new tree’s growth. Therefore, you should make sure it’s getting enough water. Most fruit trees need about one to two inches of water per week; however, they might need more if it’s extremely hot and dry. It’s imperative that the tree’s roots don’t dry out because that almost guarantees it won’t survive.\n" +
                  "\n" +
                  "Additionally, remember that it’s best to water the roots deeply less often than to splash the tree lightly every day. There are devices you can buy that release a few inches of water every day during a drought so that you don’t have to wonder if it’s getting enough water.\n" +
                  "\n" +
                  "Truthfully, there’s no better feeling than being able to grow your fruit on your property. While you might be doubting your ability to do so, it’s easier than you think. Visit an online fruit tree nursery to find the right tree for you. Plant Me Green has an extensive selection of plants and trees to choose from, and our team is here to answer any questions you have about planting in your location.\n"
          )

          Spacer(modifier = Modifier.height(1.dp))

          Text(text = "From LinkedIn", color = Color.Magenta)

      }








    }
}

@Preview(showBackground = true)
@Composable
fun TipsPreview(){
    TipsScreen(navController = rememberNavController())

}