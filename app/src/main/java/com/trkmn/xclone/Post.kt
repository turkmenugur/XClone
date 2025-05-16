package com.trkmn.xclone

data class Post(
    val userName: String,
    val userTag: String,
    val profileImageResId: Int?, // Profil resminin URL'i
    val time: String,
    val content: String,
    var commentCount: Int = 0,
    var retweetCount: Int = 0,
    var likeCount: Int = 0,
)