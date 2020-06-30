package com.aba.hospital.navigation

import android.os.Bundle
import androidx.navigation.fragment.FragmentNavigator

interface NavigatorActivity {
    fun navigateToDetail(bundle: Bundle, extras: FragmentNavigator.Extras)

}