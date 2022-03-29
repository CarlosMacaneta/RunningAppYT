package com.cs.runningappyt.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.cs.runningappyt.data.datasource.RunningDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton fun provideRunningDatabase(
        app: Application
    ) = Room.databaseBuilder(
        app,
        RunningDatabase::class.java,
        RunningDatabase.DB_NAME
    ).build()

    @Provides
    @Singleton fun providesRunDao(db : RunningDatabase) = db.runDao
}