package com.example.newrecyclerview

import com.example.newrecyclerview.model.User

interface Navigator {

    fun showDetails(user: User)

    fun goBack()

    fun toast(messageRes: Int)

}