package kr.ac.kpu.ce2019152012.seeheung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kpu.ce2019152012.seeheung.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.NBtn.setOnClickListener {
            val intent = Intent(this,NorthMap::class.java)
            startActivity(intent)
        }
        binding.SBtn.setOnClickListener {
            val intent = Intent(this,SouthMap::class.java)
            startActivity(intent)
        }
        binding.EBtn.setOnClickListener {
            val intent = Intent(this,EastMap::class.java)
            startActivity(intent)
        }
    }
}