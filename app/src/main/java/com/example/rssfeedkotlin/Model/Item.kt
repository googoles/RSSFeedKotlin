package com.example.rssfeedkotlin.Model

data class Item(val title:String,val pubDate:String,val guid:String,val author:String, val thumbnail:String,val description:String,val content:String,val link:String,val enclosure:Object,val categories:List<String>) {
//    val link: String
}