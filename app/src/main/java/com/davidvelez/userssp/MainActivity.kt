package com.davidvelez.userssp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.davidvelez.userssp.databinding.ActivityMainBinding
import java.text.FieldPosition
import javax.net.ssl.SSLSessionBindingEvent

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var userAdapter : UserAdapter
    private lateinit var  linearLayoutManager : RecyclerView.LayoutManager
    private lateinit var  binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userAdapter = UserAdapter(getUsers(), this)
        linearLayoutManager = LinearLayoutManager(this)

        binding.recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }
    }
    private fun getUsers(): MutableList<User>{
        val users = mutableListOf<User>()

        val juan = User(1, "Juan", "Perez", "https://cdn.pixabay.com/photo/2023/05/23/15/26/bengal-cat-8012976_640.jpg")
        val lily = User(2, "Lily", "Sanchez", "https://cdn.pixabay.com/photo/2023/05/17/03/41/pheasant-7998988__340.jpg")
        val sebas = User(3, "Sebas", "Palacio", "https://cdn.pixabay.com/photo/2023/04/23/09/40/bird-7945398_640.jpg")
        val gloria = User(4, "Gloria", "Toledo", "https://cdn.pixabay.com/photo/2023/05/21/11/54/deer-8008410_640.jpg")

        users.add(juan)
        users.add(lily)
        users.add(sebas)
        users.add(gloria)
        users.add(juan)
        users.add(lily)
        users.add(sebas)
        users.add(gloria)
        users.add(juan)
        users.add(lily)
        users.add(sebas)
        users.add(gloria)
        users.add(juan)
        users.add(lily)
        users.add(sebas)
        users.add(gloria)
        users.add(juan)
        users.add(lily)
        users.add(sebas)
        users.add(gloria)
        users.add(juan)
        users.add(lily)
        users.add(sebas)
        users.add(gloria)
        users.add(juan)
        users.add(lily)
        users.add(sebas)
        users.add(gloria)




        return users
    }

    override fun onClick(user: User, position: Int) {
        Toast.makeText(this, "$position: ${user.getFullName()}", Toast.LENGTH_SHORT).show()
    }
}