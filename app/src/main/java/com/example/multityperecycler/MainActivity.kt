package com.example.multityperecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multityperecycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mList: ArrayList<DataItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainRecyclerView.setHasFixedSize(true)
        binding.mainRecyclerView.layoutManager = LinearLayoutManager(this)

        mList= arrayListOf()
        prepareData()

        val adapter = MainAdapter(mList)
        binding.recyclerView.adapter=adapter
    }

    private fun prepareData() {
        mList.add(
            DataItem(
                R.drawable.captain,
                "Captian America",
                "wdoivniwv dwbucowe bcbweui",
                null
            )
        )
        mList.add(
            DataItem(
                null,
                "Hulk",
                null,
                R.drawable.hulk_logo
            )
        )
    }
}