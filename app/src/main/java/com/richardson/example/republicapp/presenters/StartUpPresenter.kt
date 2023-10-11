package com.richardson.example.republicapp.presenters

import androidx.lifecycle.LifecycleOwner
import com.richardson.example.republicapp.models.StartUpModel
import com.richardson.example.republicapp.request.items.ResultItem

class StartUpPresenter(val lifecycleOwner: LifecycleOwner, val startUpPresenterCallBacks: StartUpPresenterCallBacks) {
    val startUpModel = StartUpModel()

    fun initData() {
        startUpModel.progress.observe(lifecycleOwner) {
                t -> startUpPresenterCallBacks.updateProgress(t)
        }
        startUpModel.resultItem.observe(lifecycleOwner) {
                t -> startUpPresenterCallBacks.startUpComplete(t)
        }
        startUpModel.getData()
    }

    interface StartUpPresenterCallBacks {
        fun updateProgress(progress: Int)
        fun startUpComplete(resultItem: ResultItem?)
    }
}