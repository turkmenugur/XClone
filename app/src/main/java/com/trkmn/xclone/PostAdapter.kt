package com.trkmn.xclone

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.trkmn.xclone.databinding.PostDesignBinding

class PostAdapter(var mContext: Context, var posts: List<Post>) :RecyclerView.Adapter<PostAdapter.PostHolder>() {
    inner class PostHolder(val binding : PostDesignBinding) : RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        var binding = PostDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return PostHolder(binding)
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        val post = posts.get(position)
        val p = holder.binding

        p.userNameTextView.text = post.userName
        p.userTagTextView.text = post.userTag
        p.timeTextView.text = post.time
        p.postTextView.text = post.content
        p.commentCountTextView.text = post.commentCount.toString()
        p.retweetCountTextView.text = post.retweetCount.toString()
        p.likeCountTextView.text = post.likeCount.toString()

        // Profil resmini ayarla
        post.profileImageResId?.let { resourceId ->
            p.profileImageView.setImageResource(resourceId)
        } ?: run {
            // Eğer profileImageResId null ise, varsayılan bir resim ayarlayabilirsin
            p.profileImageView.setImageResource(R.drawable.profile) // default_profile adında bir drawable olmalı
        }
    }

    override fun getItemCount(): Int {
        return posts.size
    }
}