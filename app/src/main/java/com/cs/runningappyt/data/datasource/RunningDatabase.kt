package com.cs.runningappyt.data.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.cs.runningappyt.domain.models.Converters
import com.cs.runningappyt.domain.models.Run

@Database(
    entities = [Run::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class RunningDatabase : RoomDatabase() {
    abstract val runDao: RunDao

    companion object {
        const val DB_NAME = "running_db"
    }
}