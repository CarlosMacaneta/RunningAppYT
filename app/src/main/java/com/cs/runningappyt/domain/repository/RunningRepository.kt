package com.cs.runningappyt.domain.repository

import androidx.lifecycle.LiveData
import com.cs.runningappyt.domain.models.Run

interface RunningRepository {

    suspend fun create(run: Run)

    fun getAllSortedByDate(): LiveData<List<Run>>

    fun getAllSortedByTimeMillis(): LiveData<List<Run>>

    fun getAllSortedByAvgSpeedInKMH(): LiveData<List<Run>>

    fun getAllSortedByCaloriesBurned(): LiveData<List<Run>>

    fun getAllSortedByDistanceInMeters(): LiveData<List<Run>>

    fun getTotalTimeInMillis(): LiveData<Long>

    fun getTotalCaloriesBurned(): LiveData<Int>

    fun getTotalDistanceInMeters(): LiveData<Int>

    fun getAverageSpeedInKMH(): LiveData<Float>

    fun getById(id: Int): Run

    suspend fun delete(run: Run)
}