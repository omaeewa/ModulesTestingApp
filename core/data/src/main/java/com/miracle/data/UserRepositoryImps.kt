package com.miracle.data

import com.miracle.models.User
import javax.inject.Inject


class UserRepositoryImps @Inject constructor(): UserRepository {
    override fun getUser(): User = User("Bobby")
}