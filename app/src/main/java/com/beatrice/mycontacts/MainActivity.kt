package com.beatrice.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.beatrice.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }

    fun displayContacts() {
        var contact = Contact("Anena", "ann@gmail.com", "0789678987","korongo road","https://media.istockphoto.com/photos/beautiful-smiling-girl-with-curly-hairstyle-picture-id1335037582?b=1&k=20&m=1335037582&s=170667a&w=0&h=11QdaoY2BMZSv5U07xcAGJVr63TeJKsT5PpZEuVyIm8=")
        var contact1 = Contact("sarah", "sarah@gmail.com", "0789678907","korongo road","https://media.istockphoto.com/photos/portrait-of-young-afro-woman-with-bright-makeup-picture-id1331637318?b=1&k=20&m=1331637318&s=170667a&w=0&h=0i4Viz3mAqNm9Pz1b6tnUKqpp6zHQb_OvPFsnHSOUh4=")
        var contact2 = Contact("Lona", "lona@gmail.com", "0789645678","korongo", "https://media.istockphoto.com/photos/cheerful-african-woman-wearing-trendy-red-headscarf-picture-id1353378620?b=1&k=20&m=1353378620&s=170667a&w=0&h=MVpNo58i4wBoI-s38LOg9nQvnL67Z0EPsq1nX0rsIn0=")
        var contact3=Contact("charles", "charles@gmail.com", "078909890","korongo", "https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8YmxhY2slMjB3b21lbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var contact4=Contact("Emma", "emma@gmail.com", "0789974658","korongo", "https://images.unsplash.com/photo-1550332781-aecd27f7434f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8YmxhY2slMjB3b21lbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var contact5=Contact("Emma", "emma@gmail.com", "0789974658","korongo", "https://images.unsplash.com/photo-1596305589440-2e180399a760?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fGJsYWNrJTIwd29tZW58ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contactList= listOf(contact,contact1,contact2,contact3,contact4,contact5)
        var contactAdapter=Contact_Adapter(contactList)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        binding.rvContacts.adapter= contactAdapter

    }
}