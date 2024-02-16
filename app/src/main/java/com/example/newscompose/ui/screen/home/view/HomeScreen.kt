package com.example.newscompose.ui.screen.home.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newscompose.R
import com.example.newscompose.model.NewsModel
import com.example.newscompose.ui.screen.home.viewmodel.NewsViewModel
import com.example.newscompose.ui.theme.Purple80

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(viewModel: NewsViewModel) {
    val newsModel by viewModel.newsList.observeAsState(null)

    var list = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7)

    Scaffold {
        if(newsModel==null)
        {
            Text(text = "Data is Loading")
        }else
        {
            LazyColumn(contentPadding = PaddingValues(10.dp)) {
                items(newsModel!!.articles!!.size) {

                    Box(modifier = Modifier
                        .padding(top = 10.dp)
                        .clip(RoundedCornerShape(10.dp))) {
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .fillMaxWidth()
                                .background(color = Purple80)
                                .padding(10.dp)
                        ) {

                            Row(verticalAlignment = Alignment.CenterVertically)
                            {
                                Image(
                                    painter = painterResource(R.drawable.ic_launcher_background),
                                    contentDescription = ""
                                )


                                Column (modifier = Modifier.padding(start = 10.dp)){
                                    Text(
                                        text = "Title",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 18.sp,
                                    )
                                    Text(text = "Title")
                                }

                            }


                        }
                    }
                }
            }
        }

    }

}