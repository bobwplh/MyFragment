package com.bob.myfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FragmentSatu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satu, container, false)
            }

            override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                super.onViewCreated(view, savedInstanceState)
                val btnDua: Button = view.findViewById(R.id.btn_dua)
                val fragmentDua = FragmentDua()
                btnDua.setOnClickListener{
                    fragmentManager?.beginTransaction()?.apply {
                        replace(R.id.frame_container, fragmentDua, FragmentDua::class.java.simpleName)
                            .addToBackStack(null)
                            .commit()
                    }
                }
    }
}