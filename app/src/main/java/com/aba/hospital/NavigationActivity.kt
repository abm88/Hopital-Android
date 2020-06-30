package com.aba.hospital

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigator
import com.aba.hospital.navigation.NavigatorActivity
import com.aba.testaba.R
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.DaggerAppCompatActivity
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject
import androidx.navigation.findNavController

class NavigationActivity : DaggerAppCompatActivity(), HasSupportFragmentInjector,
    NavigatorActivity {

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = fragmentInjector

    override fun navigateToDetail(bundle: Bundle, extras: FragmentNavigator.Extras) {
        findNavController(R.id.nav_host_fragment)
            .navigate(R.id.action_listingFragment_to_detailFragment, bundle, null, extras)
    }

}