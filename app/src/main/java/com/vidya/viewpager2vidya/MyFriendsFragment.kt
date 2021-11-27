package com.vidya.viewpager2vidya

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_teman.*
import java.io.IOException

class MyFriendsFragment : Fragment() {
    lateinit var listTeman: ArrayList<MyFriend>

    var TAG = "MyFriendsFragment"

    private fun simulasiDataTeman() {
        listTeman = ArrayList()
        listTeman.add(
            MyFriend(
                "Vidya Meidita", "Perempuan", "lailavidyazuhrin7@gmail.com",
                "083948711039", "Malang"
            )
        )
        listTeman.add(
            MyFriend(
                "Surya Hanggara", "Laki-laki", "suryahanggara@gmail.com",
                "08172645736", "Malang"
            )
        )
        listTeman.add(
            MyFriend("Laila Zuhrin", "Perempuan", "zuhrinlaila@gmail.com",
                "0917263547", "Malang"
            )
        )
        listTeman.add(
            MyFriend("Wulan feby", "Perempuan", "wulan011@gmail.com",
                "0172635478", "Sidorajo"
            )
        )
        listTeman.add(
            MyFriend("Sintia nanda", "Perempuan", "sintia@gmail.com",
                "0816253478", "Surabaya")
        )
        listTeman.add(
            MyFriend("paijo", "laki-laki", "paijo@gmail.com",
                "0816253478", "Jakarta")
        )
        listTeman.add(
            MyFriend("Samsai", "Perempuan", "samsai@gmail.com",
                "0816253478", "NTT")
        )
    }

    private fun tampilTeman() {
        rv_listMyFriends.layoutManager = LinearLayoutManager(activity)
        rv_listMyFriends.adapter = MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        try {
//            Log.e(TAG, "test: "+listTeman.get(0))
//        } catch (e: IOException) {
//            Log.e(TAG, "test: "+e)
//        } finally {
//            Log.e(TAG, "test: gak jalan")
//        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_teman, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

   override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }

}