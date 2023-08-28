package com.example.mockandroid1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class RegisterFragment : Fragment() {
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var db: DBHelper
    private lateinit var btnSignIn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        db = DBHelper(requireContext())
        val view= inflater.inflate(R.layout.fragment_register, container, false)
        view.findViewById<Button>(R.id.btnSignIn).setOnClickListener {
            val emailEditText = view.findViewById<EditText>(R.id.edtEmail)
            val passwordEditText = view.findViewById<EditText>(R.id.edtPassword)
            val savedata = db.insertdata(emailEditText.toString(), passwordEditText.toString())

            if(emailEditText.text.isEmpty() && passwordEditText.text!!.isEmpty()){
                Toast.makeText(requireContext(), "Chua nhap thong tin", Toast.LENGTH_SHORT).show()
            }
            else{
                if(savedata == true){
                    Toast.makeText(requireContext(),"Dang ky thanh cong",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(requireContext(),"Da ton tai User",Toast.LENGTH_LONG).show()
                }
               // (activity as MainActivity).replaceFragment(LoginFragment,false)
                (activity as MainActivity).replaceFragment(LoginFragment(),false)
            }
        }
        return view
    }

}