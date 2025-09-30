package jp.techacademy.hirokazu.hatta.KotlinReview

abstract class Animal {
    // プロパティ
    var name: String
    var age: Int

    // 引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    // メソッド
    abstract fun say()

}