package com.miracle.data

import javax.inject.Inject

class AccountRepositoryImps @Inject constructor(): AccountRepository {
    override fun isSubscribed(): Boolean {
        return false
    }
}