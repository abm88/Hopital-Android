package com.aba.hospital.extension


import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.aba.hospital.navigation.NavigatorActivity


inline fun <T> Fragment.observeLiveData(
    liveData: LiveData<T>,
    crossinline onChanged: (data: T) -> Unit
) {
    liveData.observe(this, Observer {
        it?.let {
            onChanged(it)
        }
    })
}

fun Fragment.toastIt(message: String) = Toast.makeText(context, message, Toast.LENGTH_LONG).show()

fun Fragment.getNavigatorActivity() = (activity as NavigatorActivity)

fun Fragment.hideSoftKeybaord() {
    val inputMethodManager =
        activity?.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    var view = activity?.currentFocus
    if (view == null)
        view = View(activity)
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}