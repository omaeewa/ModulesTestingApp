package com.miracle.data

import com.miracle.models.User

interface UserRepository {
    fun getUser() : User
}