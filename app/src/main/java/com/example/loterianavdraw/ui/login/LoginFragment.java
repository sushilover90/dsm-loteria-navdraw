package com.example.loterianavdraw.ui.login;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.loterianavdraw.R;
import com.example.loterianavdraw.classes.GameEngine;
import com.example.loterianavdraw.classes.UseRequestQueue;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginFragment extends Fragment {

    Button btnClearEmail, btnClearPassword, btnLogIn;
    EditText etEmail, etPassword;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Assign buttons
        btnClearEmail = view.findViewById(R.id.btn_loginClearEmail);
        btnClearPassword = view.findViewById(R.id.btn_loginClearPassword);
        btnLogIn = view.findViewById(R.id.btn_loginLogIn);

        // Assing edit texts
        etPassword = view.findViewById(R.id.et_loginPassword);
        etEmail = view.findViewById(R.id.et_loginEmail);

        etEmail.setText("e@e.com");

        setBtnEvents();
    }

    private void setBtnEvents() {
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                String email, password;

                // storing email and password
                email = etEmail.getText().toString();
                password = etPassword.getText().toString();

                // if email and/or password are empty, alert the user
                if(email.equals("") || password.equals(""))
                {
                    Toast.makeText(getActivity(), "Do not leave empty fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                // url to login
                String url = "http://ramiro174.com/oauth/token";
                JSONObject login_data = new JSONObject();
                try {
                    login_data.put("client_id",6);
                    login_data.put("client_secret","otuoWd9Zyukpu8WRItXxicoLlpfXbOYAX0zv4tEu");
                    login_data.put("grant_type","password");
                    login_data.put("username",email);
                    login_data.put("password",password);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                Toast.makeText(getActivity(), "Autheticating...", Toast.LENGTH_SHORT).show();

                // send the log in request
                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                        Request.Method.POST,// method,
                        url,// url,
                        login_data,// body ,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                try {
                                    GameEngine.setToken(response.getString("access_token"));
                                    Toast.makeText(getActivity(), "200", Toast.LENGTH_SHORT).show();
                                    Navigation.findNavController(v).navigate(R.id.gameFragment);
                                } catch (JSONException e) {
                                    Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        },//listener
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getActivity(), String.valueOf(error.networkResponse.statusCode), Toast.LENGTH_SHORT).show();
                            }
                        }// error,
                );
                UseRequestQueue.getInstance(getActivity()).addToRequestQueue(jsonObjectRequest);

            }
        });

        btnClearPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etPassword.setText("");
            }
        });

        btnClearEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etEmail.setText("");
            }
        });

    }

}