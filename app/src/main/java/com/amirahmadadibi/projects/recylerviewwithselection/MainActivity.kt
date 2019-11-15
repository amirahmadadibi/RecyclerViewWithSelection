package com.amirahmadadibi.projects.recylerviewwithselection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.amirahmadadibi.projects.recylerviewwithselection.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var userList: List<User> = listOf(User("test1"), User("test2"), User("test"),
            User("test1"), User("test2"), User("test"),User("test1"), User("test2"), User("test"),
            User("test1"), User("test2"), User("test"))
        recyclerview_user_userlist.adapter = MyAdapter(this, userList)
        recyclerview_user_userlist.layoutManager = LinearLayoutManager(this)

    }
}
