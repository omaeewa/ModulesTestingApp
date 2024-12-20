package com.miracle.settings

import androidx.lifecycle.ViewModel
import com.miracle.data.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    val userName = userRepository.getUser().name

}