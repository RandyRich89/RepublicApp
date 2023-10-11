package com.richardson.example.republicapp.presenters

import com.richardson.example.republicapp.models.MainActivityModel
import com.richardson.example.republicapp.request.items.ResultItem

class MainActivityPresenter {

    val mainActivityModel = MainActivityModel()

    fun loadUi() {
        mainActivityModel.requestItems()
    }

    fun getItems(): List<ResultItem> {
        return mainActivityModel.relatedTopics
    }

    interface MainPresenterCallbacks {
        fun loadDone()
    }
}