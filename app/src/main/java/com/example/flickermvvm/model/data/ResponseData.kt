package com.example.flickermvvm.model.data

sealed class ResponseData<out T>{

    data class Success<out T>(val value: T) : ResponseData<T>()
    data class Loading<out T>(val value: T? = null) : ResponseData<T>()
    data class Failed(val message: String): ResponseData<String>()

    companion object{
        fun <T> success(value: T) = Success<T>(value)
        fun loading() = Loading(null)
        fun failed(message: String) = Failed(message)
    }
}