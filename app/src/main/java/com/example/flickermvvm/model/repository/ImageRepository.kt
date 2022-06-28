package com.example.flickermvvm.model.repository

import com.example.flickermvvm.model.data.ResponseData
import kotlinx.coroutines.flow.Flow

interface ImageRepository {

    suspend fun getStartImages() : Flow<ResponseData<Any>>
}