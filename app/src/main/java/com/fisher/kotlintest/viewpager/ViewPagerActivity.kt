package com.fisher.kotlintest.viewpager

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.viewpager.widget.PagerAdapter
import com.fisher.kotlintest.BaseActivity
import com.fisher.kotlintest.R
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPagerActivity : BaseActivity() {
    override fun getLayoutView() = R.layout.activity_view_pager;

    override fun handleView() {

        var fragment1 = layoutInflater.inflate(R.layout.fragment_sub1, null)
        var fragment2 = layoutInflater.inflate(R.layout.fragment_sub2, null)
        var fragment3 = layoutInflater.inflate(R.layout.fragment_sub3, null)

        var viewList: MutableList<View> = mutableListOf()
        viewList.add(fragment1)
        viewList.add(fragment2)
        viewList.add(fragment3)


    }


    class ViewPagerAdapter(fm:FragmentManager,behavior : Int) : FragmentPagerAdapter(fm,behavior){



        override fun getCount(): Int {
            TODO("Not yet implemented")
        }

        override fun getItem(position: Int): Fragment {
            TODO("Not yet implemented")
        }

    }

}