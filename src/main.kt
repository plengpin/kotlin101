fun main(){
    var Animal = Animal()
    Animal.makeNoise()
    Animal.eat()
    Animal.roam()
    Animal.sleep()


    println("----------------------------")
    var myHippo = Hippo()
    myHippo.makeNoise()
    myHippo.eat()
    myHippo.roam()
    myHippo.sleep()



    println("----------------------------")
    var myCat = Cat()
    myCat.makeNoise()
    myCat.eat()
    myCat.roam()
    myCat.sleep()


    println("----------------------------")
    var myDog = Dog()
    myDog.makeNoise()
    myDog.eat()
    myDog.sleep()
    myDog.roam()



//    //นี่คือ hippo ของฉัน
//    var myhippo = Hippo()
//    myhippo.eat()
//    myhippo.room()
//    myhippo.makenoise()
//    myhippo.sleep()
//    println("")
//
//    //นี่คือ cat ของฉัน
//    var mycat = cat()
//    mycat.eat()
//    mycat.room()
//    mycat.makenoise()
//    mycat.sleep()

}

open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise(){
        println(" animal กำลังส่งเสียงร้อง")
    }

    open fun eat(){
        println(" animal กำลังกิน")
    }
    open fun roam(){
        println(" animal กำลังเดิน")
    }
    open fun sleep(){
        println(" animal กำลังนอน")
    }
}
class Hippo : Animal(){
    override val image: String
        get() = "hippo.jpg"
    override val food: String
        get() = "หญ้า"
    override val habitat: String
        get() = "น้ำ"

    override fun makeNoise() {
        println(" Hippo กำลังส่งเสียงร้อง ฮิบฮิบ")
    }

    override fun eat() {
        println(" Hippo กิน $food")
    }

}



class Cat : Animal(){
    override val image: String
        get() = "Can.jpg"
    override val food: String
        get() = "อาหารแมว"
    override val habitat: String
        get() = "บ้าน"

    override fun makeNoise() {
        println(" Cat กำลังส่งเสียงร้อง เมี๊ยวววววววววว")
    }

    override fun eat() {
        println(" Cat  กิน $food")
    }
}

class Dog : Animal(){
    override val image: String
        get() = "dog.jpg"
    override val food: String
        get() = "อาหารสุนัข"
    override val habitat: String
        get() = "บ้านสุนัข"

    override fun makeNoise() {
        println(" Dog กำลังส่งเสียงร้อง โฮ่งโฮ่ง")
    }

    override fun eat() {
        println(" Dog  กิน $food")
    }
}