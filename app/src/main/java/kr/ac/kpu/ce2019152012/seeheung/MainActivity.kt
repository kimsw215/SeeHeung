package kr.ac.kpu.ce2019152012.seeheung

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import kr.ac.kpu.ce2019152012.seeheung.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private val bottomNavigation : BottomNavigationView by lazy { findViewById(R.id.bottom_nav)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupNavigation()
        //여기 지워주면 다크모드 정상작동합니다. onSupportNavigateUp()
        /*val navHostUserFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainer) as NavHostFragment
        val navController = navHostUserFragment.navController
//        binding.bottomNav.setupWithNavController(navController)
        NavigationUI.setupWithNavController(binding.bottomNav, navController,false)*/
    }


    override fun onSupportNavigateUp(): Boolean {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
        val navController = navHostFragment.navController
        return navController.navigateUp()
    }

    private fun setupNavigation(){
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment

        val navController = navHostFragment.navController
//        bottomNavigation.setupWithNavController(navController)

        navController.addOnDestinationChangedListener{ _, detination, _ ->

        }
        NavigationUI.setupWithNavController(binding.bottomNav, navController)

    }
}