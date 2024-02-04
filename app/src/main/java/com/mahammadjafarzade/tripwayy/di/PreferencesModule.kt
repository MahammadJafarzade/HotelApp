package com.mahammadjafarzade.tripwayy.di

import com.mahammadjafarzade.tripwayy.util.MySharedPreferences
import com.mahammadjafarzade.tripwayy.util.MySharedPreferencesInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class PreferencesModule {
    @Binds
    @Singleton
    abstract fun bindReferences(pref : MySharedPreferences) : MySharedPreferencesInterface
}