package com.example.homework01.movie

import java.io.Serializable
data class Movie(
    var title: String,
    var exp: String,
    var date: String,
    var poster: Int) : Serializable