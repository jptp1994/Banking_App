package com.bankingapp.domain.model

sealed class Response<out T> {
    data object Initial: Response<Nothing>()

    data object Loading: Response<Nothing>()

    data class Success<out T>(
        val data: T
    ): Response<T>()

    data class Failure(
        val e: Exception?
    ): Response<Nothing>()
}