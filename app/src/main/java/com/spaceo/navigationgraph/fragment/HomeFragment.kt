package com.spaceo.navigationgraph.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.Navigation

import com.spaceo.navigationgraph.R

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        if (view != null) {
            init(view)
        }

        return view
    }

    private fun init(view: View?) {

        view?.findViewById<TextView>(R.id.tvShowAll)?.setOnClickListener {
//            val bundle = bundleOf("userText" to "John Connor")
            Navigation.findNavController(view).navigate(R.id.action_homeActivity_to_allFragment)
        }

        view?.findViewById<TextView>(R.id.tvShowBikes)?.setOnClickListener {
            val bundle = bundleOf("userText" to "Jack Sparrow")
            Navigation.findNavController(view).navigate(R.id.action_homeActivity_to_bikesFragment, bundle)
        }

        view?.findViewById<TextView>(R.id.tvShowCars)?.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeActivity_to_carsFragment)
        }

        view?.findViewById<TextView>(R.id.tvShowTrucks)?.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeActivity_to_trucksFragment)
        }
    }
}
