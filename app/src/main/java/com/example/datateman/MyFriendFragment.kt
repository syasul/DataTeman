package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.datateman.databinding.FragmentMyFriendBinding

class MyFriendFragment : Fragment() {
    private lateinit var listTeman:ArrayList<MyFriend>
    private lateinit var binding:FragmentMyFriendBinding
    private lateinit var myFriendAdapter:MyFriendAdapter
    private fun simulasiDataTeman(){
        listTeman = ArrayList()
        listTeman.add(MyFriend("mail", "mail@gmail.com", "32911"))
        listTeman.add(MyFriend("mail", "mail@gmail.com", "32911"))
        listTeman.add(MyFriend("mail", "mail@gmail.com", "32911"))
        listTeman.add(MyFriend("mail", "mail@gmail.com", "32911"))
        listTeman.add(MyFriend("mail", "mail@gmail.com", "32911"))
        listTeman.add(MyFriend("mail", "mail@gmail.com", "32911"))
        listTeman.add(MyFriend("mail", "mail@gmail.com", "32911"))
        listTeman.add(MyFriend("mail", "mail@gmail.com", "32911"))
        listTeman.add(MyFriend("mail", "mail@gmail.com", "32911"))
        listTeman.add(MyFriend("mail", "mail@gmail.com", "32911"))

    }

    private fun tampilTeman() {
        myFriendAdapter = MyFriendAdapter(listTeman)
        binding.rvListMyFriend.layoutManager = LinearLayoutManager(requireContext())
        binding.rvListMyFriend.adapter = myFriendAdapter
    }
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMyFriendBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()

    }
}