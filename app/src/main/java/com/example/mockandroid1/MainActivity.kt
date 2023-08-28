package com.example.mockandroid1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.mockandroid1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //initialize UI
        // Tạo FrameLayout để chứa Fragment
        supportFragmentManager
            .beginTransaction()
            .add(R.id.FrameLayout,SplashFragment())
            .commit()//Áp dụng Transaction
    }
    fun replaceFragment(destination: Fragment, isAddToBackStack: Boolean){
        // Khai báo sfm có kiểu của supportFragmentManager
        val sfm = supportFragmentManager
                .beginTransaction()
                .replace(R.id.FrameLayout,destination)
        if(isAddToBackStack){
            sfm.addToBackStack(null)
        }
        if(destination is HomeFragment){
            supportFragmentManager.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }
        sfm.commit()
    }

}