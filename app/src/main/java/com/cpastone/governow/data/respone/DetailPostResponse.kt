package com.cpastone.governow.data.respone

import com.cpastone.governow.data.model.PostItem

data class DetailPostResponse(
    val message: String,
    val data: PostItem?
)
