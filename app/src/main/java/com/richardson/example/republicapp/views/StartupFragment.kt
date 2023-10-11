package com.richardson.example.republicapp.views

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import com.richardson.example.republicapp.R
import com.richardson.example.republicapp.presenters.StartUpPresenter
import com.richardson.example.republicapp.presenters.StartUpPresenter.StartUpPresenterCallBacks
import com.richardson.example.republicapp.request.items.ResultItem
import java.lang.ClassCastException
import java.lang.Exception

class StartupFragment: Fragment(), StartUpPresenterCallBacks {

    private val startUpPresenter = StartUpPresenter(this, this)
    private lateinit var startUpCallbacks: StartUpCallbacks
    private lateinit var progressBar: ProgressBar

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.startup_fragment, null)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            startUpCallbacks = context as StartUpCallbacks
        }
        catch (e: Exception) {
            throw ClassCastException("StartUpCallbacks not implemented")
        }
    }

    override fun onResume() {
        super.onResume()
        progressBar = requireView().findViewById(R.id.startupProgressBar)
        progressBar.progress = 25
        startUpPresenter.initData()
    }

    override fun updateProgress(progress: Int) {
        progressBar.progress = progress
    }

    override fun startUpComplete(resultItem: ResultItem?) {
        startUpCallbacks.startUpComplete(resultItem)
    }

    interface StartUpCallbacks {
        fun startUpComplete(resultItem: ResultItem?)
    }
}