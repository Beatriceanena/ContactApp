package com.beatrice.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.beatrice.mycontacts.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso

class Contact_Adapter(var contactsList: List<Contact>):
    RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
    var binding= ContactListItemBinding
        .inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
    var currentContact=contactsList.get(position)
        holder.binding.tvName.text=currentContact.name
        holder.binding.tvPhone.text=currentContact.phoneNumber
        holder.binding.tvEmail.text=currentContact.email
        holder.binding.tvAddress.text=currentContact.address
        Picasso.get()
            .load(currentContact.image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .resize(350,350)
            .centerCrop()
            .into(holder.binding.imgContact)

        val context = holder.itemView.context
        holder.binding.imgContact.setOnClickListener {
            Toast.makeText(context,"You've clicked an image", Toast.LENGTH_SHORT).show()
        }
        holder.binding.cvContact.setOnClickListener {
            val intent = Intent(context,ViewContact::class.java)
            intent.putExtra("NAME",currentContact.name)
            intent.putExtra("ADDRESS",currentContact.address)
            intent.putExtra("EMAIL",currentContact.email)
            intent.putExtra("PHONENUMBER",currentContact.phoneNumber)
            intent.putExtra("IMAGE",currentContact.image)
            context.startActivity(intent)
        }

    }
    override fun getItemCount(): Int {
      return contactsList.size
    }
}
 class ContactViewHolder(val binding: ContactListItemBinding ):RecyclerView.ViewHolder(binding.root)


