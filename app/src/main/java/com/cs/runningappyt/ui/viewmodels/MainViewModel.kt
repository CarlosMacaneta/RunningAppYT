package com.cs.runningappyt.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.cs.runningappyt.data.repository.RunningRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val runningRepositoryImpl: RunningRepositoryImpl
): ViewModel() {

}