package com.trkmn.xclone

import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.trkmn.xclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        val posts = ArrayList<Post>()
        val p1 = Post("John Doe", "@johndoe", R.drawable.m1, "2h", "Just finished reading a fascinating article about the latest advancements in AI. The future is now!", 12, 35, 115)
        val p2 = Post("Jane Smith", "@janes", R.drawable.w1, "5m", "Enjoying a sunny afternoon with a good book and a cup of coffee ☀️☕", 3, 8, 42)
        val p3 = Post("Coding Ninja", "@code_ninja", R.drawable.profile, "1h", "Debugging is twice as hard as writing the code in the first place. Therefore, if you write the code as cleverly as possible, you are, by definition, not smart enough to debug it. - Brian Kernighan", 20, 60, 180)
        val p4 = Post("Travel Enthusiast", "@travel_bug", R.drawable.w2, "1d", "Dreaming of my next adventure! ✈️ Where should I go next?", 8, 15, 77)
        val p5 = Post("Space Geek", "@space_oddity", R.drawable.m3, "30m", "The James Webb Space Telescope continues to amaze us with its breathtaking images of the universe. Absolutely stunning!", 25, 50, 210)
        val p6 = Post("Foodie Fun", "@foodiefun", R.drawable.w1, "10m", "Just tried the most amazing sushi! 🍣 Highly recommend this place.", 6, 12, 55)
        val p7 = Post("Music Lover", "@music_lover", R.drawable.w2, "4h", "Listening to some classic jazz on a Friday evening. Perfect way to unwind. 🎶", 4, 9, 38)
        val p8 = Post("Tech News", "@technews", R.drawable.m2, "15m", "Breaking: New smartphone with revolutionary camera technology announced!", 30, 75, 250)
        val p9 = Post("Gamer Pro", "@gamerpro", R.drawable.m1, "2h", "Just achieved a new high score! Leveling up my gaming skills. 🎮", 10, 22, 90)
        val p10 = Post("Artistic Soul", "@artlover", R.drawable.m3, "1h", "Working on a new painting today. Feeling inspired by the beautiful Ankara scenery. 🎨", 7, 14, 68)

// Oluşturulan postları listeye ekleyebilirsin
        posts.add(p1)
        posts.add(p2)
        posts.add(p3)
        posts.add(p4)
        posts.add(p5)
        posts.add(p6)
        posts.add(p7)
        posts.add(p8)
        posts.add(p9)
        posts.add(p10)

        val postsAdapter = PostAdapter(this,posts)
        binding.recyclerView.adapter = postsAdapter

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }
}