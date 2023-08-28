package com.example.mockandroid1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_login, container, false)
        view.findViewById<TextView>(R.id.tvSignUp).setOnClickListener {

            (activity as MainActivity).replaceFragment(RegisterFragment(),true)

        }
        view.findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val emailEditText = view.findViewById<EditText>(R.id.edtTextEmail)
            val passwordEditText = view.findViewById<TextInputEditText>(R.id.edtPassword)
            if(emailEditText.text.isEmpty() && passwordEditText.text!!.isEmpty()){
                Toast.makeText(requireContext(), "Nhap tai khoan hoac mat khau", Toast.LENGTH_SHORT).show()
            }else{
                (activity as MainActivity).replaceFragment(HomeFragment(),false)
            }
        }
        return view
    }
    fun isLogin(userName: String, passWord: String){

    }
}