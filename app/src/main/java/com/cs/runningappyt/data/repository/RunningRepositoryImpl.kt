package com.cs.runningappyt.data.repository

import androidx.lifecycle.LiveData
import com.cs.runningappyt.data.datasource.RunDao
import com.cs.runningappyt.domain.models.Run
import com.cs.runningappyt.domain.repository.RunningRepository
import javax.inject.Inject

class RunningRepositoryImpl @Inject constructor(
    private val runDao: RunDao
): RunningRepository {

    override suspend fun create(run: Run) {
        runDao.create(run)
    }

    override fun getAllSortedByDate() = runDao.getAllSortedByDate()

    override fun getAllSortedByTimeMillis() = runDao.getAllSortedByTimeMillis()

    override fun getAllSortedByAvgSpeedInKMH() = runDao.getAllSortedByAvgSpeedInKMH()

    override fun getAllSortedByCaloriesBurned() = runDao.getAllSortedByCaloriesBurned()

    override fun getAllSortedByDistanceInMeters() = runDao.getAllSortedByDistanceInMeters()

    override fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()

    override fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    override fun getTotalDistanceInMeters() = runDao.getTotalDistanceInMeters()

    override fun getAverageSpeedInKMH() = runDao.getAverageSpeedInKMH()

    override fun getById(id: Int) = runDao.getById(id)

    override suspend fun delete(run: Run) {
        runDao.destroy(run)
    }
}