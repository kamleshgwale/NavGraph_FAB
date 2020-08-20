package com.spaceo.navigationgraph.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.spaceo.navigationgraph.R

/**
 * A simple [Fragment] subclass.
 */
class BikesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bikes, container, false)

      /*  view?.findViewById<TextView>(R.id.tvArgsBikes)!!.text = arguments?.get("userText") as String*/

        return view
    }
}
