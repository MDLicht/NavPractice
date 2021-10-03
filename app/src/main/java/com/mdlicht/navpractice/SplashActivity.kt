package com.mdlicht.navpractice

import android.content.Intent
import android.os.Bundle
import androidx.navigation.ActivityNavigator
import io.reactivex.Observable
import io.reactivex.rxkotlin.addTo
import java.util.concurrent.TimeUnit

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Observable.timer(1, TimeUnit.SECONDS)
            .doOnComplete {
                moveToMainActivity()
            }
            .subscribe()
            .addTo(compositeDisposable)
    }

    private fun moveToMainActivity() {
        val activityNavigator = ActivityNavigator(this)
        activityNavigator.navigate(
            activityNavigator.createDestination()
                .setIntent(Intent(this, MainActivity::class.java)),
            null, null, null
        )
    }
}