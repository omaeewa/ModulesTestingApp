package com.miracle.data.di

import com.miracle.data.AccountRepository
import com.miracle.data.AccountRepositoryImps
import com.miracle.data.UserRepository
import com.miracle.data.UserRepositoryImps
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun provideUserRepository(impl: UserRepositoryImps): UserRepository

    @Binds
    fun provideAccountRepository(imp: AccountRepositoryImps): AccountRepository
}