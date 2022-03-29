package com.cs.runningappyt.data.datasource

import androidx.lifecycle.LiveData
import androidx.room.*
import com.cs.runningappyt.domain.models.Run

@Dao
interface RunDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun create(run: Run)

    @Query("SELECT * FROM running_table ORDER BY timestamp DESC")
    fun getAllSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY timeMillis DESC")
    fun getAllSortedByTimeMillis(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY avgSpeedInKMH DESC")
    fun getAllSortedByAvgSpeedInKMH(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY caloriesBurned DESC")
    fun getAllSortedByCaloriesBurned(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY distanceInMeters DESC")
    fun getAllSortedByDistanceInMeters(): LiveData<List<Run>>

    @Query("SELECT SUM(timeMillis) FROM running_table")
    fun getTotalTimeInMillis(): LiveData<Long>

    @Query("SELECT SUM(caloriesBurned) FROM running_table")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("SELECT SUM(distanceInMeters) FROM running_table")
    fun getTotalDistanceInMeters(): LiveData<Int>

    @Query("SELECT AVG(avgSpeedInKMH) FROM running_table")
    fun getAverageSpeedInKMH(): LiveData<Float>

    @Query("SELECT * FROM running_table WHERE id = :id")
    fun getById(id: Int): Run

    @Delete
    suspend fun destroy(run: Run)
}