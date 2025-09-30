package jp.techacademy.hirokazu.hatta.KotlinReview

import android.util.Log


open class Human (
    name: String,
    age: Int,
    val hobby: String


) : Animal(name, age), Thinkable {


    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は"  + this.age + "歳です。")
    }


    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }


}





//constructor(name: String, age: Int, hobby: String): super(name, age) {
//    }