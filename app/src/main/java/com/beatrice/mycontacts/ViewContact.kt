package com.beatrice.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.beatrice.mycontacts.databinding.ActivityMainBinding
import com.beatrice.mycontacts.databinding.ActivityViewContactBinding
import com.squareup.picasso.Picasso

class ViewContact : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        var name = intent.extras?.getString("NAME")
        var email = intent.extras?.getString("EMAIL")
        var address = intent.extras?.getString("ADDRESS")
        var phone = intent.extras?.getString("PHONENUMBER")
        var image = binding.imgPerson

        Toast.makeText(this,name,Toast.LENGTH_LONG).show()

        binding.tvPerson.text = name
        binding.tvPhone1.text = phone
        binding.tvEmail2.text = email
        binding.tvAddress1.text = address

        Picasso.get().load(intent.getStringExtra("IMAGE")).resize(200,200).centerCrop().into(binding.imgPerson)
    }
}