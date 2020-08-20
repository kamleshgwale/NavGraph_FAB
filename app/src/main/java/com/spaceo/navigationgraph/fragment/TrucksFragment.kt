package com.spaceo.navigationgraph.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.spaceo.navigationgraph.R
import kotlinx.android.synthetic.main.content_main.*

/**
 * A simple [Fragment] subclass.
 */
class TrucksFragment : Fragment() {
    var isOpen = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trucks, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fab.setOnClickListener { view ->
            if (isOpen) {

                textview_camera.setVisibility(View.INVISIBLE)
                textview_mail.setVisibility(View.INVISIBLE)
                fab2.startAnimation(AnimationUtils.loadAnimation(activity?.applicationContext!!, R.anim.fab_close))
                fab1.startAnimation(AnimationUtils.loadAnimation(activity?.applicationContext!!, R.anim.fab_close))
                fab.startAnimation(AnimationUtils.loadAnimation(activity?.applicationContext!!, R.anim.fab_rotate_anticlock))
                fab2.setClickable(false)
                fab1.setClickable(false)
                isOpen = false
            } else {
                textview_camera.setVisibility(View.VISIBLE)
                textview_mail.setVisibility(View.VISIBLE)
                fab2.startAnimation(AnimationUtils.loadAnimation(activity?.applicationContext!!, R.anim.fab_open))
                fab1.startAnimation(AnimationUtils.loadAnimation(activity?.applicationContext!!, R.anim.fab_open))
                fab.startAnimation(AnimationUtils.loadAnimation(activity?.applicationContext!!, R.anim.fab_rotate_clock))
                fab2.setClickable(true)
                fab1.setClickable(true)
                isOpen = true
            }
        }

        fab2.setOnClickListener{view ->
            Snackbar.make(view, "Camera Image Clicked", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        textview_camera.setOnClickListener{view ->
            Snackbar.make(view, "Camera Text View Clicked", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        fab1.setOnClickListener{view ->
            Snackbar.make(view, "Email Image Clicked", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        fab1.setOnClickListener{view ->
            Snackbar.make(view, "Email Text View Clicked", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }



}
